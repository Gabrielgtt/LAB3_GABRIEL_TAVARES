/**
 * Agenda que guarda até 100 contatos criados. 
 * Pode adicionar contatos, lista-los, ou exibir informações sobre um deles 
 * @author Gabriel Alves Tavares
 */
public class Agenda {

    private Contato[] contatos = new Contato[100];

    /**
     * Cria um objeto Contato com os paramêtros dados e o armazena no array de
     * contatos
     *
     * @param nome nome do contato
     * @param sobrenome sobrenome do contato
     * @param numero numero do contato
     * @param posicao posicao do contato no array (converte o número para
     * indexação por 0)
     */
    public void cadastraContato(String nome, String sobrenome, String numero, int posicao){
        Contato novoContato = new Contato(nome, sobrenome, numero);
        this.contatos[posicao -1] = novoContato;
    }

    public String infoContato(int posicao) {
        posicao -= 1;
        return this.contatos[posicao].toString();
    }

    public String getNomeContato(int posicao) {
        posicao -= 1;
        return this.contatos[posicao].getNomeCompleto();
    }

    public String listaContatos() {
        String lista = "\n";

        for (int i = 0; i < 100; i++) {
            if (this.contatos[i] != null) {
                String nome = this.contatos[i].getNomeCompleto();
                lista += (i + 1) + " - " + nome + "\n";
            }
        }
        
        return lista;
    }
}