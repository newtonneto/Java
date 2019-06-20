package agendadecontatos2;

import java.util.Scanner;

public class AgendaDeContatos2 {
    public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Contato contato;
    Scanner read = new Scanner(System.in);
    int operacao;
    String entrada;
    String entrada2;
    String entrada3;
    int varAux = 0;
    int i = 0;
    Contato contatoRetorno;

    do {
        contato = new Contato();

        System.out.printf("%n#####- Agenda -#####%n"
                        + "Digite o número correspondente a opção desejada%n"
                        + "1- Adicionar Contato%n"
                        + "2- Remover Contato%n"
                        + "3- Procurar Contato%n"
                        + "4- Listar Contatos%n"
                        + "5- Atualizar Contato%n"
                        + "6- Quantidade de Contatos%n"
                        + "0- Sair%n");
        operacao = Integer.parseInt(read.nextLine());

        switch (operacao) {
            case 1:
                System.out.printf("#####- Adicionar Contado -#####%n"
                                + "Nome: ");
                entrada = read.nextLine();
                contato.setNome(entrada);
                System.out.printf("Número: ");
                entrada = read.nextLine();
                contato.setNumero(entrada);
                agenda.adicionar(contato);
                System.out.printf("Contato Adicionado%n");

                break;
            case 2:
                System.out.printf("#####- Remover Contato -#####%n"
                                + "Nome: ");
                entrada = read.nextLine();

                if (agenda.remover(entrada)) {
                    System.out.printf("Contado Removido%n");
                }
                else {
                    System.out.printf("Contado Inexistente%n");
                }
                
                break;
            case 3:
                System.out.printf("#####- Procurar Contato -#####%n"
                                + "Nome: ");
                entrada = read.nextLine();
                contatoRetorno = agenda.procurar(entrada);
                if (contatoRetorno != null) {
                    System.out.printf("Contato: %s - %s%n", contatoRetorno.getNome(), contatoRetorno.getNumero());
                }
                else {
                    System.out.printf("Contato não encontrado\n");
                }
                
                break;
            case 4:
                System.out.printf("#####- Listar Contatos -#####%n");
                varAux = agenda.totalContatos();

                for (i = 0; i < varAux; i++) {
                    contatoRetorno = agenda.listarTodosContatos(i);
                    if (contatoRetorno != null) {
                        System.out.printf("%d- %s - %s%n", i, contatoRetorno.getNome(), contatoRetorno.getNumero());
                    }
                    else {
                        varAux = varAux + 1;
                    }
                }
                
                break;
            case 5:
                System.out.printf("#####- Atualizar Contato -#####%n"
                                + "Nome: ");
                entrada = read.nextLine();
                System.out.printf("Novo nome: ");
                entrada2 = read.nextLine();
                System.out.printf("Novo numero: ");
                entrada3 = read.nextLine();

                if (agenda.atualizarContato(entrada, entrada2, entrada3)) {
                    System.out.printf("Contado Atualizado com Sucesso%n");
                }
                else {
                    System.out.printf("Contado Inexistente%n");
                }

                break;
            case 6:
                System.out.printf("#####- Quantidade de Contatos -#####%n"
                                + "Número Total de Contatos Salvos: %d%n", agenda.totalContatos());

                break;
            case 0:
                System.out.printf("Saindo...%n");

                break;
            default:
                System.out.println("Opção invalida");

                break;
        }
    } while (operacao != 0);
    
    read.close();
    }
}