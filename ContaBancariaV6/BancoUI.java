import java.util.Scanner;

public class BancoUI {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Agencia[] todasAsAgencias = new Agencia[3];
		Agencia[] backupTodasAsAgencias;
		int indiceMaximoArray = 2;
		Agencia agencia;
		Cliente cliente;
		ContaBancaria conta;
		int opcaoPrincipal = -1;
		int opcao;
		int tamanhoArrayAgencias = 0;
		int tamanhoArrayClientes;
		int tamanhoArrayContas;
		int i, j;
		boolean validaCondicao;
		String entradaUsuario;
		String numeroDaConta;

		while (opcaoPrincipal != 0) {
			opcaoPrincipal = imprimirMenuSelecaoUsuario();

			switch(opcaoPrincipal) {
				case 1:
					opcao = -1;
					//Menu do operador
					while (opcao != 0) {
						opcao = imprimirMenuOperador();

						switch(opcao) {
							//Cadastra uma nova agencia
							case 1:
								todasAsAgencias[tamanhoArrayAgencias] = novaAgencia(tamanhoArrayAgencias);
								tamanhoArrayAgencias++;

								//Verifica se o array já está completo, se sim vai dobrar o tamanho dele
								if (tamanhoArrayAgencias > indiceMaximoArray) {
									System.out.printf("Duplicando array...\n");
									backupTodasAsAgencias = todasAsAgencias.clone();
									todasAsAgencias = new Agencia[tamanhoArrayAgencias * 2];
									System.arraycopy(backupTodasAsAgencias, 0, todasAsAgencias, 0, tamanhoArrayAgencias);
									indiceMaximoArray = (tamanhoArrayAgencias * 2) - 1;
									System.out.printf("Array duplicado com sucesso...\n");
								}

								break;
							//Cadastra um novo cliente
							case 2:
								cliente = novoCliente();

								validaCondicao = false;
								for (i = 0; i < tamanhoArrayAgencias; i++) {
									//Verifica se a agencia do cliente realmente existe
									if (cliente.getNumeroAgencia() == todasAsAgencias[i].getNumeroAgencia()) {
										validaCondicao = true;
										todasAsAgencias[i].setCliente(cliente);
										System.out.printf("Cliente cadastrado na agencia %d\n", todasAsAgencias[i].getNumeroAgencia());
									}
								}

								if (validaCondicao == false) {
									cliente = null;
									System.out.printf("Agencia inexistente\n");
								}

								break;
							//Cadastra uma nova conta
							case 3:
								System.out.printf("Nome: ");
								entradaUsuario = read.nextLine();
								
								validaCondicao = false;
								//For para percorrer o array de agencias
								for (i = 0; i < tamanhoArrayAgencias; i++) {
									tamanhoArrayClientes = todasAsAgencias[i].getTamanhoArrayClientes();
									//For para percorrer o array de clientes em cada objeto agencia criado
									for (j = 0; j < tamanhoArrayClientes; j++) {
										if (todasAsAgencias[i].getCliente(j).getNome().equals(entradaUsuario)) {
											validaCondicao = true;
											//Armazena o usuario encontrado
											cliente = todasAsAgencias[i].getCliente(j);
											//Define o numero da conta
											numeroDaConta = "1000" + todasAsAgencias[i].getNumeroAgencia() + "" + todasAsAgencias[i].getTamanhoArrayContas();
											//Cria uma nova conta
											conta = novaConta(cliente, Integer.parseInt(numeroDaConta), todasAsAgencias[i].getNumeroAgencia());
											//Armazena a nova conta em uma agencia
											todasAsAgencias[i].setConta(conta);
											System.out.printf("Conta cadastrada para o cliente %s\n", todasAsAgencias[i].getCliente(j).getNome());
											i = tamanhoArrayAgencias;
											j = tamanhoArrayClientes;
										}
									}
								}

								if (validaCondicao == false) {
									System.out.printf("Cliente nao encontrado\n");
								}

								break;
							//Lista todas as contas de uma agencia
							case 4:
								System.out.printf("Numero da agencia: ");
								entradaUsuario = read.nextLine();

								validaCondicao = false;
								//For para percorrer o array de agencias
								for (i = 0; i < tamanhoArrayAgencias; i++) {
									//Verifica se existe a agencia buscada
									if (todasAsAgencias[i].getNumeroAgencia() == Integer.parseInt(entradaUsuario)) {
										validaCondicao = true;
										listarContasPorAgencia(todasAsAgencias[i]);
										i = tamanhoArrayAgencias;
									}
								}

								if (validaCondicao == false) {
									System.out.printf("Agencia nao encontrada\n");
								}

								break;
							//Lista todos os clientes de uma agencia
							case 5:
								System.out.printf("Numero da agencia: ");
								entradaUsuario = read.nextLine();

								validaCondicao = false;
								//For para percorrer o array de agencias
								for (i = 0; i < tamanhoArrayAgencias; i++) {
									//Verifica se existe a agencia buscada
									if (todasAsAgencias[i].getNumeroAgencia() == Integer.parseInt(entradaUsuario)) {
										validaCondicao = true;
										listarClientesPorAgencia(todasAsAgencias[i]);
										i = tamanhoArrayAgencias;
									}
								}

								if (validaCondicao == false) {
									System.out.printf("Agencia nao encontrada\n");
								}

								break;
							//Cancelar conta
							case 6:
								System.out.printf("Numero da agencia: ");
								entradaUsuario = read.nextLine();

								validaCondicao = false;
								for (i = 0; i < tamanhoArrayAgencias; i++) {
									//Verifica se existe a agencia buscada
									if (todasAsAgencias[i].getNumeroAgencia() == Integer.parseInt(entradaUsuario)) {
										validaCondicao = true;
										cancelarConta(todasAsAgencias[i]);
										i = tamanhoArrayAgencias;
									}
								}

								if (validaCondicao == false) {
									System.out.printf("Agencia nao encontrada\n");
								}							

								break;
							//Sair
							case 0:
								System.out.printf("Voltando menu principal\n");
								break;
						}
					}

					break;
				case 2:
					opcao = -1;
					//Recebe a agencia do cliente
					agencia = buscarAgencia(todasAsAgencias, tamanhoArrayAgencias);
					if (agencia != null) {
						//Busca um cliente na agencia especificada
						cliente = buscarCliente(agencia);
						if (cliente != null) {
							while (opcao != 0) {
								opcao = imprimirMenuCliente();

								switch(opcao) {
									//Deposito
									case 1:
										System.out.printf("Numero da conta:");
										entradaUsuario = read.nextLine();
										//Busca uma conta no cliente especificado
										conta = cliente.buscaConta(Integer.parseInt(entradaUsuario));
										//Inicia o processo de deposito
										if (conta != null) {
											//Verifica se a conta está ativa
											if (conta.getAtiva() == true) {
												System.out.printf("Valor do deposito: ");
												entradaUsuario = read.nextLine();
												System.out.printf("Saldo: %f\n", conta.depositar(Double.parseDouble(entradaUsuario)));
											}
											else {
												System.out.printf("Conta %d desativada\n", conta.getNumero());
											}
										}
										else {
											System.out.printf("Conta nao encontrada\n");
										}

										break;
									//Saque
									case 2:
										System.out.printf("Numero da conta:");
										entradaUsuario = read.nextLine();
										//Busca uma conta no cliente especificado
										conta = cliente.buscaConta(Integer.parseInt(entradaUsuario));
										//Inicia o processo de deposito
										if (conta != null) {
											//Verifica se a conta está ativa
											if (conta.getAtiva() == true) {
												System.out.printf("Valor do saque: ");
												entradaUsuario = read.nextLine();
												if (Double.parseDouble(entradaUsuario) <= conta.getSaldo()) {
													System.out.printf("Saldo: %f\n", conta.sacar(Double.parseDouble(entradaUsuario)));
												}
												else{
													System.out.printf("Saldo insuficiente\n"
																	+ "Saldo: %f\n", conta.getSaldo());
												}
											}
											else {
												System.out.printf("Conta %d desativada\n", conta.getNumero());
											}
										}
										else {
											System.out.printf("Conta nao encontrada\n");
										}

										break;
									//Extrato
									case 3:
										System.out.printf("Numero da conta:");
										entradaUsuario = read.nextLine();
										//Busca uma conta no cliente especificado
										conta = cliente.buscaConta(Integer.parseInt(entradaUsuario));
										//Inicia o processo de deposito
										if (conta != null) {
											//Verifica se a conta está ativa
											if (conta.getAtiva() == true) {
												System.out.printf("Saldo: %f\n", conta.getSaldo());
											}
											else {
												System.out.printf("Conta %d desativada\n", conta.getNumero());
											}
										}
										else {
											System.out.printf("Conta nao encontrada\n");
										}

										break;
									//Listar todas as minhas contas
									case 4:
										j = cliente.getQuantidadeDeContas();
										for (i = 0; i < j; i++) {
											System.out.printf("Conta %d: %d\n", (i + 1), cliente.getMinhaConta(i).getNumero());
										}
										if (j == 0) {
											System.out.printf("O cliente %s nao possui contas\n", cliente.getNome());
										} 

										break;
									//Cancelar uma das minhas contas
									case 5:
										System.out.printf("Numero da conta:");
										entradaUsuario = read.nextLine();
										//Busca uma conta no cliente especificado
										conta = cliente.buscaConta(Integer.parseInt(entradaUsuario));
										//Inicia o processo de deposito
										if (conta != null) {
											//Verifica se a conta está ativa
											if (conta.getAtiva() == true) {
												conta.cancelarConta();
												System.out.printf("Conta numero %d cancelada\n", conta.getNumero());
											}
											else {
												System.out.printf("Conta %d previamente desativada\n", conta.getNumero());
											}
										}
										else {
											System.out.printf("Conta nao encontrada\n");
										}

										break;
									//Sair
									case 0:
										System.out.printf("Voltando menu principal\n");
										break;
								}
							}
						}
					}

					break;
				case 0:
					//Encerra execução
					System.out.printf("Saindo...\n");
					break;
			}
		}

	}

	//Imprime o menu de seleção do tipo de usuário (cliente ou operador)
	public static int imprimirMenuSelecaoUsuario() {
		Scanner read = new Scanner(System.in);
		int entradaUsuario = -1;

		//Só sai do loop caso receba como entrada os valores 0, 1 ou 2
		while (entradaUsuario < 0 || entradaUsuario > 2) {
			System.out.printf("#####- MENU INICIAL -#####\n"
							+ "1 - Operador\n"
							+ "2 - Cliente\n"
							+ "0 - Sair\n");
			entradaUsuario = Integer.parseInt(read.nextLine());

			//Exibe mensagem de erro caso a opcao seja invalida
			if (entradaUsuario < 0 || entradaUsuario > 2) {
				System.out.printf("Opcao invalida, tente novamente!\n");
			}
		}

		return entradaUsuario;
	}

	//Imprime o menu do operador
	public static int imprimirMenuOperador() {
		Scanner read = new Scanner(System.in);
		int entradaUsuario = -1;

		//Só sai do loop caso receba como entrada um valor entre 0 e 6
		while (entradaUsuario < 0 || entradaUsuario > 6) {
			System.out.printf("#####- MENU OPERADOR -#####\n"
							+ "1 - Criar Agencia\n"
							+ "2 - Cadastrar Cliente\n"
							+ "3 - Cadastrar Contas\n"
							+ "4 - Listar Todas as Contas\n"
							+ "5 - Listar Todos os Clientes\n"
							+ "6 - Cancelar Conta\n"
							+ "0 - Sair\n");
			entradaUsuario = Integer.parseInt(read.nextLine());

			if (entradaUsuario < 0 || entradaUsuario > 6) {
				System.out.printf("Opcao invalida, tente novamente!\n");
			}
		}

		return entradaUsuario;
	}

	//Imprime o menu do cliente
	public static int imprimirMenuCliente() {
		Scanner read = new Scanner(System.in);
		int entradaUsuario = -1;

		//Só sai do loop caso receba como entrada um valor entre 0 e 5
		while (entradaUsuario < 0 || entradaUsuario > 5) {
			System.out.printf("#####- MENU OPERADOR -#####\n"
							+ "1 - Deposito\n"
							+ "2 - Saque\n"
							+ "3 - Extrato\n"
							+ "4 - Minhas Contas\n"
							+ "5 - Cancelar Minha Conta\n"
							+ "0 - Sair\n");
			entradaUsuario = Integer.parseInt(read.nextLine());

			if (entradaUsuario < 0 || entradaUsuario > 5) {
				System.out.printf("Opcao invalida, tente novamente!\n");
			}
		}

		return entradaUsuario;
	}

	//METODOS GENERICOS

	//Metodo generico para buscar agencia
	public static Agencia buscarAgencia(Agencia[] todasAsAgencias, int tamanhoArrayAgencias) {
		Scanner read = new Scanner(System.in);
		int i;
		int entradaUsuario;
		boolean validaCondicao;
		Agencia retornoAgencia = null;

		System.out.printf("Numero da agencia: ");
		entradaUsuario = Integer.parseInt(read.nextLine());

		validaCondicao = false;
		//Percorre o array de agencias em busca da agencia passada pelo usuario
		for (i = 0; i < tamanhoArrayAgencias; i++) {
			if (todasAsAgencias[i].getNumeroAgencia() == entradaUsuario) {
				validaCondicao = true;
				retornoAgencia = todasAsAgencias[i];
			}
		}

		if (validaCondicao == false) {
			System.out.printf("Agencia nao encontrada\n");
		}

		return retornoAgencia;
	}

	//Metodo generico para buscar cliente
	public static Cliente buscarCliente(Agencia agencia) {
		Scanner read = new Scanner(System.in);
		String entradaUsuario;
		int i;
		int tamanhoArray = agencia.getTamanhoArrayClientes();
		boolean validaCondicao;
		Cliente retornoCliente = null;

		System.out.printf("Nome cliente: ");
		entradaUsuario = read.nextLine();

		validaCondicao = false;
		//Percorre a agencia recebida em busca do cliente passado pelo usuario
		for (i = 0; i < tamanhoArray; i++) {
			if (agencia.getCliente(i).getNome().equals(entradaUsuario)) {
				validaCondicao = true;
				retornoCliente = agencia.getCliente(i);
			}
		}

		if (validaCondicao == false) {
			System.out.printf("Cliente não encontrado na agencia numero %d\n", agencia.getNumeroAgencia());
		}

		return retornoCliente;
	}

	//Metodo generico para buscar cliente - OLD
	/*public static Cliente buscarCliente(Agencia agencia, String nomeCliente) {
		Scanner read = new Scanner(System.in);
		String entradaUsuario;
		int tamanhoArray = agencia.getTamanhoArrayClientes();
		int i;
		boolean validaCondicao;
		Cliente retornoCliente = null;

		System.out.printf("Agencia: ");
		entradaUsuario = read.nextLine();

		validaCondicao = false;
		for (i = 0; i < tamanhoArray; i++) {
			if (agencia.getCliente(i).getNome().equals(nomeCliente)) {
				validaCondicao = true;
				retornoCliente = agencia.getCliente(i);
			}
		}

		if (validaCondicao == false) {
			System.out.printf("Cliente não encontrado na agencia numero %d\n", agencia.getNumeroAgencia());
		}

		return retornoCliente;
	}*/

	//Metodo generico para buscar contas
	/*public static ContaBancaria buscarConta(Agencia agencia, String nomeCliente) {
		Scanner read = new Scanner(System.in);
	}*/

	//METODOS OPERADOR

	//Criar nova agência
	public static Agencia novaAgencia(int tamanhoArrayContas) {
		Scanner read = new Scanner(System.in);
		int entradaUsuario;
		int tamanhoArray = tamanhoArrayContas + 1;
		int i;
		Agencia novaAgencia = null;
		//boolean validaCondicao = false;

		while (novaAgencia == null) {
			System.out.printf("Numero da nova agencia: ");
			entradaUsuario = Integer.parseInt(read.nextLine());

			//Verifica se o operador digitou um valor maior que 0
			if (entradaUsuario > 0) {
				//Laço para verificar se já existe agencia com esse numero
				/*for (i = 0; i < tamanhoArray; i++) {
					if (entradaUsuario == todasAsAgencias[i].getNumeroAgencia()) {
						System.out.printf("Agencia já cadastrada\n");
						validaCondicao = true;
					}
				}

				//Caso não exista uma nova agencia será criada
				if (validaCondicao == false) {
					novaAgencia = new Agencia(entradaUsuario);
					System.out.printf("Agencia criada\n");
				}*/
				novaAgencia = new Agencia(entradaUsuario);
				System.out.printf("Agencia criada\n");
			}
			else {
				System.out.printf("Numero invalido\n");
			}
		}

		return novaAgencia;
	}

	//Cadastrar cliente
	public static Cliente novoCliente() {
		Scanner read = new Scanner(System.in);
		Cliente novoCliente = null;
		String nomeCliente;
		String telefoneCliente;
		String emailCliente;
		int numeroAgencia;

		while (novoCliente == null) {
			//Recebe os dados do cliente
			System.out.printf("Nome: ");
			nomeCliente = read.nextLine();
			System.out.printf("Numero Agencia: ");
			numeroAgencia = Integer.parseInt(read.nextLine());
			System.out.printf("Telefone: ");
			telefoneCliente = read.nextLine();
			System.out.printf("Email: ");
			emailCliente = read.nextLine();

			//Não cadastra o cliente caso algum parametro seja nulo
			if (nomeCliente != null && nomeCliente != "" && telefoneCliente != null && telefoneCliente != "" && emailCliente != null && emailCliente != "") {
				novoCliente = new Cliente(nomeCliente, telefoneCliente, emailCliente, numeroAgencia);
				System.out.printf("Cliente cadastrado\n");
			}
			else {
				System.out.printf("Entrada invalida\n");
			}
		}

		return novoCliente;
	}

	//Cadastrar conta
	public static ContaBancaria novaConta(Cliente cliente, int numeroDaConta, int agencia) {
		ContaBancaria novaConta = new ContaBancaria(numeroDaConta, cliente, agencia);
		cliente.setConta(novaConta);

		return novaConta;
	}

	//Listar as contas de uma agencia
	public static void listarContasPorAgencia(Agencia agencia) {
		int tamanhoArray = agencia.getTamanhoArrayContas();
		int i;

		for(i = 0; i < tamanhoArray; i++) {
			System.out.printf("Conta: %d\n"
							+ "Agencia: %d\n"
							+ "Titular: %s\n"
							+ "Saldo: %f\n"
							+ "Status: %b\n\n", agencia.getConta(i).getNumero(), agencia.getConta(i).getNumeroAgencia(), agencia.getConta(i).getNome(), agencia.getConta(i).getSaldo(), agencia.getConta(i).getAtiva());
		}
	}

	//Listar os clientes de uma agencia
	public static void listarClientesPorAgencia(Agencia agencia) {
		int tamanhoArray = agencia.getTamanhoArrayClientes();
		int i;

		for (i = 0; i < tamanhoArray; i++) {
			System.out.printf("Nome: %s\n"
							+ "Agencia: %d\n"
							+ "Telefone: %s\n"
							+ "Email: %s\n\n", agencia.getCliente(i).getNome(), agencia.getCliente(i).getNumeroAgencia(), agencia.getCliente(i).getTelefone(), agencia.getCliente(i).getEmail());
		}
	}

	//Cancelar uma conta de uma agencia
	public static void cancelarConta(Agencia agencia) {
		Scanner read = new Scanner(System.in);
		int tamanhoArray = agencia.getTamanhoArrayContas();
		int i;
		String entradaUsuario;
		boolean validaCondicao;

		System.out.printf("Titular: ");
		entradaUsuario = read.nextLine();

		validaCondicao = false;
		for (i = 0; i < tamanhoArray; i++) {
			if (agencia.getConta(i).getNome().equals(entradaUsuario)) {
				validaCondicao = true;
				agencia.getConta(i).cancelarConta();
				System.out.printf("Conta numero %d cancelada\n", agencia.getConta(i).getNumero());
				i = tamanhoArray;
			}
		}

		if (validaCondicao == false) {
			System.out.printf("Cliente nao cadastrado\n");
		}
	}
}