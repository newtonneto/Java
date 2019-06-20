import java.util.Scanner;

public class ContaUI {
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		Cliente cliente = null;
		ContaBancaria novaContaBancaria;
		ContaBancaria[] todasAsContas = new ContaBancaria[100];
		Cliente[] todosOsClientes = new Cliente[100];
		int operacao;
		int indiceArrayContas = 0;
		int indiceArrayCliente = 0;
		int opcao;
		int i;
		double valor;
		boolean validaCondicao;
		String entrada;

		todosOsClientes[0] = new Cliente();

		do {
			imprimirMenuPrincipal();		
			operacao = Integer.parseInt(read.nextLine());

			switch (operacao) {
				//Cadastro do cliente
				case 1:
					todosOsClientes[indiceArrayCliente] = cadastroNovoCliente();
					indiceArrayCliente++;

					System.out.printf("Cliente cadastrado\n");
					break;
				//Cadastro de conta
				case 2:
					opcao = -1;

					while (opcao != 0) {
						opcao = imprimirMenuCadastroConta();

						//Caso o cliente já seja cadastrado
						if (opcao == 1) {
							System.out.printf("Seu nome: ");
							entrada = read.nextLine();

							validaCondicao = false;
							for (i = 0; i < indiceArrayCliente; i++) {
								if (entrada.equals(todosOsClientes[i].getNome())) {
									cliente = todosOsClientes[i];
									validaCondicao = true;
								}
							}

							if (validaCondicao == true) {
								todasAsContas[indiceArrayContas] = new ContaBancaria(indiceArrayContas, cliente);
								cliente.setConta(todasAsContas[indiceArrayContas]);
								indiceArrayContas++;

								System.out.printf("Conta criada\n");
								System.out.printf("Titular: %s\n"
												+ "Numero da conta: %d\n"
												+ "Saldo: %f\n", todasAsContas[indiceArrayContas - 1].getNome(), todasAsContas[indiceArrayContas - 1].getNumero(), todasAsContas[indiceArrayContas - 1].getSaldo());
							}
							else {
								System.out.printf("Cliente não cadastrado\n");
							}

							opcao = 0;
						}
						//Caso o cliente não seja cadastrado
						else if (opcao == 2) {
							todosOsClientes[indiceArrayCliente] = cadastroNovoCliente();
							indiceArrayCliente++;
							
							todasAsContas[indiceArrayContas] = new ContaBancaria(indiceArrayContas, todosOsClientes[indiceArrayCliente - 1]);
							todosOsClientes[indiceArrayCliente - 1].setConta(todasAsContas[indiceArrayContas]);
							indiceArrayContas++;

							System.out.printf("Conta criada\n");
							System.out.printf("Titular: %s\n"
											+ "Numero da conta: %d\n"
											+ "Saldo: %f\n", todasAsContas[indiceArrayContas - 1].getNome(), todasAsContas[indiceArrayContas - 1].getNumero(), todasAsContas[indiceArrayContas - 1].getSaldo());

							opcao = 0;
						}
						//Sair
						else if (opcao == 0) {
							System.out.printf("Cancelando operação\n");
						}
						//Opção inválida
						else {
							System.out.printf("Opcão inválida\n");
							opcao = 0;
						}
					}

					break;
				case 3:
					System.out.printf("Número da conta: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if (Integer.parseInt(entrada) == todasAsContas[i].getNumero()) {
							validaCondicao = true;

							if (todasAsContas[i].getAtiva() == true) {
								System.out.printf("Valor do deposito: ");
								valor = Double.parseDouble(read.nextLine());
								System.out.printf("Saldo: %f\n", todasAsContas[i].depositar(valor));
							}
							else {
								System.out.printf("Conta cancelada\n");
							}
						}
					}

					if (validaCondicao = false) {
						System.out.printf("Conta não encontrada\n");
					}

					break;
				case 4:
					System.out.printf("Número da conta: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if(Integer.parseInt(entrada) == todasAsContas[i].getNumero()) {
							validaCondicao = true;

							if (todasAsContas[i].getAtiva() == true) {
								System.out.printf("Valor do saque: ");
								valor = Double.parseDouble(read.nextLine());

								if (todasAsContas[i].getSaldo() - valor >= 0) {
									System.out.printf("Saldo: %f\n", todasAsContas[i].sacar(valor));
								}
								else {
									System.out.printf("Saldo insuficiente\n");
								}
							}
							else {
								System.out.printf("Conta cancelada\n");
							}
						}
					}

					if (validaCondicao = false) {
						System.out.printf("Conta não encontrada\n");
					}

					break;
				case 5:
					System.out.printf("Número da conta: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if (Integer.parseInt(entrada) == todasAsContas[i].getNumero()) {
							System.out.printf("Titular: %s\n"
											+ "Conta: %d\n"
											+ "Saldo: %f\n", todasAsContas[i].getNome(), todasAsContas[i].getNumero(), todasAsContas[i].getSaldo());

							validaCondicao = true;
						}
					}

					if (validaCondicao = false) {
						System.out.printf("Conta não encontrada\n");
					}

					break;
				case 6:
					System.out.printf("Número da conta: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if (Integer.parseInt(entrada) == todasAsContas[i].getNumero()) {
							todasAsContas[i].cancelarConta();

							validaCondicao = true;
						}
					}

					if (validaCondicao == false) {
						System.out.printf("Conta não encontrada\n");	
					}

					break;
				case 7:
					System.out.printf("Nome do titular: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if (entrada.equals(todasAsContas[i].getNome())) {
							System.out.printf("Titular: %s | "
											+ "Conta: %d\n", todasAsContas[i].getNome(), todasAsContas[i].getNumero());
							validaCondicao = true;
						}
					}

					if (validaCondicao == false) {
						System.out.printf("Não existe contas associadas a esse cliente\n");
					}

					break;
				case 8:
					/*System.out.printf("Número da conta: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if (Integer.parseInt(entrada) == todasAsContas[i].getNumero()) {
							System.out.printf("Titular: %s\n"
											+ "Conta: %d\n", todasAsContas[i].getNome(), todasAsContas[i].getNumero());
						}
					}

					if (validaCondicao == false) {
						System.out.printf("Conta não encontrada\n");
					}*/
					System.out.printf("Nome: ");
					entrada = read.nextLine();

					validaCondicao = false;
					for (i = 0; i < indiceArrayContas; i++) {
						if (entrada.equals(todasAsContas[i].getNome())) {
							validaCondicao = true;

							System.out.printf("Numero da conta: ");
							entrada = read.nextLine();
							novaContaBancaria = todosOsClientes[i].buscaConta(Integer.parseInt(entrada));

							if (novaContaBancaria != null) {
								System.out.printf("Conta encontrada\n"
												+ "Titular: %s\n"
												+ "Saldo: %f\n"
												+ "Status: %b\n", novaContaBancaria.getNome(), novaContaBancaria.getSaldo(), novaContaBancaria.getAtiva());
							}
							else {
								System.out.printf("O cliente não possui conta com esse número\n");
							}
						}
					}

					if (validaCondicao != true) {
						System.out.printf("Esse cliente ainda não possui contas\n");
					}

					break;
				case 9:
					for (i = 0; i < indiceArrayContas; i++) {
						System.out.printf("Titular: %s | Conta: %d | Saldo: %f | Ativa: %b\n", todasAsContas[i].getNome(), todasAsContas[i].getNumero(), todasAsContas[i].getSaldo(), todasAsContas[i].getAtiva());
					}

					break;
				case 0:
					System.out.printf("Encerrando execução\n");
					break;
				default:
					System.out.printf("Opcao invalida, tente novamente!\n");
					break;
			}

		} while(operacao != 0);
	}

	//Imprime o menu principal
	public static void imprimirMenuPrincipal() {
		System.out.printf("#####- Menu -#####\n"
						+ "1 - Cadastrar cliente\n"
						+ "2 - Criar conta\n"
						+ "3 - Deposito\n"
						+ "4 - Saque\n"
						+ "5 - Extrato\n"
						+ "6 - Cancelar conta\n"
						+ "7 - Verificar se o cliente possui conta\n"
						+ "8 - Procurar conta\n"
						+ "9 - Lista todas as contas\n"
						+ "0 - Sair\n");
	}

	//Imprime o formulario de cadastro do cliente e retorna um objeto cliente
	public static Cliente cadastroNovoCliente() {
		Cliente novoCliente = new Cliente();

		System.out.printf("Nome: ");
		novoCliente.setNome(read.nextLine());
		System.out.printf("Telefone: ");
		novoCliente.setTelefone(read.nextLine());
		System.out.printf("Email: ");
		novoCliente.setEmail(read.nextLine());

		return novoCliente;
	}

	//Imprime o menu de cadastro de conta e retorna a opção escolhida
	public static int imprimirMenuCadastroConta() {
		int opcao;

		System.out.printf("Já é cliente cadastrado?\n"
						+ "1 - Sim\n"
						+ "2 - Não\n"
						+ "0 - Sair\n");
		opcao = Integer.parseInt(read.nextLine());

		return opcao;
	}
}