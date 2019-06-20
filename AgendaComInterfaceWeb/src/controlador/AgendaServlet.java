package controlador;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Contato;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ArrayList<Contato> listaContatos;
	ArrayList<Contato> listaContatosEncontrados;
       
    public AgendaServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		super.init();
		
		listaContatos = new ArrayList<Contato>();
		listaContatosEncontrados = new ArrayList<Contato>();
	}

	public void destroy() {
		super.destroy();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String acao = request.getParameter("acao");
		String resposta = "index.jsp";
		String nomeRecebido;
		String novoNomeRecebido;
		String novoNumeroRecebido;
		String novoEmailRecebido;
		int totalContatos;
		int i;
		
		if ("cadastrar".equals(acao)) {
			resposta = "cadastrar.jsp";
		}
		else if ("confirmarCadastro".equals(acao)) {
			Contato contato = new Contato();
			
			contato.setNome(request.getParameter("nome"));
			contato.setNumero(request.getParameter("numero"));
			contato.setEmail(request.getParameter("email"));
			
			listaContatos.add(contato);
		}
		else if ("remover".equals(acao)) {
			resposta = "remover.jsp";
		}
		else if ("confirmarRemover".equals(acao)) {
			nomeRecebido = request.getParameter("nome");
			int x = 0;
			boolean ret = false;
			
			for (i = 0; i < listaContatos.size(); i++) {
	            if (listaContatos.get(i).getNome().equals(nomeRecebido)) {
	                ret = true;
	                x = i;
	            }
	        }

	        if (ret == true) {
	        	this.listaContatos.remove(x);
	        }
	        
	        request.setAttribute("listaContatos", listaContatos);
			resposta = "listar.jsp";
		}
		else if ("procurar".equals(acao)) {
			resposta = "procurar.jsp";
		}
		else if ("confirmarProcurar".equals(acao)) {
			nomeRecebido = request.getParameter("nome");
			listaContatosEncontrados.clear();
			
			for (i = 0; i < listaContatos.size(); i++) {
				if (listaContatos.get(i).getNome().equals(nomeRecebido)) {
					listaContatosEncontrados.add(listaContatos.get(i));
				}
			}
			
			request.setAttribute("listaContatosEncontrados", listaContatosEncontrados);
			resposta = "listarBusca.jsp";
		}
		else if ("listar".equals(acao)) {
			request.setAttribute("listaContatos", listaContatos);
			resposta = "listar.jsp";
		}
		else if ("atualizar".equals(acao)) {
			resposta = "atualizar.jsp";
		}
		else if ("confirmarAtualizar".equals(acao)) {
			nomeRecebido = request.getParameter("nome");
			novoNomeRecebido = request.getParameter("novoNome");
			novoNumeroRecebido = request.getParameter("novoNumero");
			novoEmailRecebido = request.getParameter("novoEmail");
			listaContatosEncontrados.clear();
			
			for (i = 0; i < listaContatos.size(); i++) {
				if (listaContatos.get(i).getNome().equals(nomeRecebido)) {
					if (novoNomeRecebido != "") {
						listaContatos.get(i).setNome(novoNomeRecebido);
					}
					if (novoNumeroRecebido != "") {
						listaContatos.get(i).setNumero(novoNumeroRecebido);
					}
					if (novoEmailRecebido != "") {
						listaContatos.get(i).setEmail(novoEmailRecebido);
					}
					listaContatosEncontrados.add(listaContatos.get(i));
				}
			}
			
			request.setAttribute("listaContatosEncontrados", listaContatosEncontrados);
			resposta = "listarBusca.jsp";
		}
		else if ("total".equals(acao)) {
			totalContatos = listaContatos.size();
			
			request.setAttribute("totalContatos", totalContatos);
			resposta = "total.jsp";
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
	}
}
