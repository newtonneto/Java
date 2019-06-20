package banco;

public class Banco {
    String nomeFantasia;
    Agencia[] todasAsAgencias = new Agencia[100];
    int indiceArrayAgencias = 0;
    
    public Banco(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    public String getNome() {
        return nomeFantasia;
    }
    
    public int getQuantidadeAgencias() {
        return indiceArrayAgencias;
    }
    
    public void setAgencia(Agencia novaAgencia) {
        todasAsAgencias[indiceArrayAgencias] = novaAgencia;
        indiceArrayAgencias++;
    }
    
    /*public boolean buscaAgencia(int numeroAgencia) {
        int i;
        boolean retorno = false;
        
        for (i = 0; i < indiceArrayAgencias; i++) {
            if (todasAsAgencias[i].getNumeroAgencia() == numeroAgencia) {
                retorno = true;
            }
        }
    
        return retorno;
    }*/
    
    public Agencia buscaAgencia(int numeroAgencia) {
        int i;
        Agencia agenciaRetorno = null;
        
        for (i = 0; i < indiceArrayAgencias; i++) {
            if (todasAsAgencias[i].getNumeroAgencia() == numeroAgencia) {
                agenciaRetorno = todasAsAgencias[i];
            }
        }
    
        return agenciaRetorno;
    }
}
