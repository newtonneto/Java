package agendadecontatos;

import java.util.ArrayList;
//import java.util.Iterator;

public class Agenda {
    ArrayList<Contato> listaContatos = new ArrayList<Contato>();

    public void adicionar(Contato contato) {
	this.listaContatos.add(contato);
    }

    public boolean remover(String nome) {
        boolean ret = false;
        int x = 0;

        for(int i = 0; i < listaContatos.size(); i++) {
            if (listaContatos.get(i).getNome().equals(nome)) {
                ret = true;
                x = i;

            }
        }

        if (ret == true) {
        	this.listaContatos.remove(x);
        }

        /*Iterator<Contato> itr = listaContatos.iterator();
        while (itr.hasNext()) {
        	Contato rec = (Contato)itr.next();
        	if (rec.getName().equals(nome)) {
        		itr.remove();
        		ret = true;
        	}
        }*/
                
        return ret;
    }
        
    public String procurar(String nome) {
        String num = "Contato não encontrado";
        
        for (Contato c : this.listaContatos) {
            if (c.getNome().equals(nome)) {
                num = c.getNumero();
            }
        }
        
        return num;
    }
    
    public String listarTodosContatos(int indice) {
        String cont = this.listaContatos.get(indice).getNome() + " - " + this.listaContatos.get(indice).getNumero();
        
        return cont;
    }
    
    public boolean atualizarContato(String nome, String novoNome, String novoNumero) {
        boolean ret = false;
        
        for (Contato c: this.listaContatos) {
            if (c.getNome().equals(nome)) {
                c.setNome(novoNome);
                c.setNumero(novoNumero);
                ret = true;
            }
        }
        
        return ret;
    }

    public int totalContatos() {
        return this.listaContatos.size();
    }
}