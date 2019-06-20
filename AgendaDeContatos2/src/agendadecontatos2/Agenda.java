package agendadecontatos2;

import java.util.ArrayList;

public class Agenda {
    int tamanhoArray = 100;
    Contato[] listaContatos = new Contato[tamanhoArray];
    int salvaIndice = 0;
    int i = 0;
    int primeiroElementoVazio = 0;
    Contato contatoRetorno;

    public void adicionar(Contato contato) {  
        for (i = 0; i < salvaIndice + 1; i++) {
            if (listaContatos[i] == null) {
                primeiroElementoVazio = i;
            }
        }
        
        listaContatos[primeiroElementoVazio] = contato;
        salvaIndice = salvaIndice + 1;
    }

    public boolean remover(String nome) {
        boolean ret = false;
        int x = 0;
        
        for (i = 0; i < salvaIndice; i++) {
            if (listaContatos[i].getNome().equals(nome)) {
                ret = true;
                x = i;
            }
        }
        
        if (ret == true) {
            listaContatos[x] = null;
            salvaIndice = salvaIndice - 1;
        }
        
        return ret;
    }
    
    public Contato procurar(String nome) {
        contatoRetorno = null;
        
        for (i = 0; i < salvaIndice; i++) {
            if (listaContatos[i] != null) {
                if (listaContatos[i].getNome().contains(nome)) {
                    contatoRetorno = listaContatos[i];
                }
            }
        }

        return contatoRetorno;
    }
    
    public Contato listarTodosContatos(int indice) {
        contatoRetorno = null;
        
        if (listaContatos[indice] != null) {
            contatoRetorno = listaContatos[indice];
        }

        return contatoRetorno;
    }
    
    public boolean atualizarContato(String nome, String novoNome, String novoNumero) {
        boolean ret = false;
        
        for(i = 0; i < salvaIndice; i++) {
            if (listaContatos[i] != null) {
                if (listaContatos[i].getNome().equals(nome)) {
                    listaContatos[i].setNome(novoNome);
                    listaContatos[i].setNumero(novoNumero);
                    ret = true;
                }
            }
        }
        
        return ret;
    }

    public int totalContatos() {
        return salvaIndice;
    }
}