import java.util.Scanner;

public class BancoUI {
	private Agencia[] todasAsAgencias = new Agencia[3];
	private Scanner read = new Scanner(System.in);
	private Cliente cliente;
	private ContaBancaria conta;
	private int i;

	public static void main() {
		int opcao = -1;

		while (opcao != 0) {

			imprimirMenuSelecaoUsuario();
			opcao = Integer.parseInt(read.nextLine());

			switch(opcao) {
				case 1:
					//Menu do operador
					imprimirMenuOperador();
					break;
				case 2:
					//Menu do cliente
					imprimirMenuCliente();
					break;
				case 0:
					//Encerra execução
					System.out.printf("Saindo...");
					break;
				default:
					System.out.printf("Opcao invalida, tente novamente!\n");
					break;
			}
		}
	}

	//Imprime o menu de seleção do tipo de usuário (cliente ou operador)
	public static void imprimirMenuSelecaoUsuario() {
		System.out.printf("#####- MENU INICIAL -#####\n"
						+ "1 - Operador\n"
						+ "2 - Cliente\n"
						+ "0 - Sair");
	}

	//Imprime o menu do operador
	public static void imprimirMenuOperador() {
		System.out.printf("#####- MENU OPERADOR -#####\n"
						+ "1 - Criar Agencia\n"
						+ "2 - Cadastrar Cliente\n"
						+ "3 - Cadastrar Contas\n"
						+ "4 - Listar Todos os Clientes\n"
						+ "5 - Listar Todas as Contas\n"
						+ "6 - Cancelar Conta\n"
						+ "0 - Sair");
	}

	//Imprime o menu do cliente
	public static int imprimirMenuCliente() {
		System.out.printf("#####- MENU OPERADOR -#####\n"
						+ "1 - Deposito\n"
						+ "2 - Saque\n"
						+ "3 - Extrato\n"
						+ "4 - Minhas Contas\n"
						+ "5 - Cancelar Minha Conta\n"
						+ "0 - Sair\n");
	}

	//Criar nova agência
	public Agencia novaAgencia(Agencia[] todasAsAgencias) {
		int entradaUsuario;
		int tamanhoArray = todasAsAgencias.length;
		Agencia novaAgencia = null;
		boolean validaCondicao = false;

		while (novaAgencia == null) {
			System.out.printf("Numero da nova agencia: ");
			entradaUsuario = Integer.parseInt(read.nextLine());

			//Verifica se o operador digitou um valor maior que 0
			if (entradaUsuario > 0) {
				//Laço para verificar se já existe agencia com esse numero
				for (i = 0; i < tamanhoArray; i++) {
					if (entradaUsuario == todasAsAgencias[i].getNumeroAgencia()) {
						System.out.printf("Agencia já cadastrada\n");
						validaCondicao = true;
					}
				}

				//Caso não exista uma nova agencia será criada
				if (validaCondicao == false) {
					novaAgencia = new Agencia(entradaUsuario);
					System.out.printf("Agencia criada\n");
				}
			}
			else {
				System.out.printf("Numero invalido\n");
			}
		}

		return novaAgencia;
	}
}