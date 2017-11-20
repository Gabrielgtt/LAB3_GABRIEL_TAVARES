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

    /**
    * Retorna a informação de um contato em uma posição específica
    *
    * @param posicao posicao do contato no array (converte o número para
    * indexação por 0)
    * @return toString do contato na posição recebida
    */
    public String infoContato(int posicao) {
        posicao -= 1;
        return this.contatos[posicao].toString();
    }

    /**
    * Retornar o nome completo do contato em uma posição específica
    *
    * @param posicao posicao do contato no array (converte o número para
    * indexação por 0)
    * @return NomeCompleto do contato na posição recebida
    */
    public String getNomeContato(int posicao) {
        posicao -= 1;
        return this.contatos[posicao].getNomeCompleto();
    }

    /**
    * Retorna uma string com o toString de todos os contatos registrados
    *
    * @return todos os toStrings dos contatos registrados
    * , separados por uma quebra de linha
    */
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

    /**
    * Compara um objeto Agenda com outro objeto
    *
    * @param outro Objeto a ser comparado
    * @return verdadeiro se todos os contatos estão na mesma posição e são iguais
    * nas duas agendas, falso do contrário
    */
    public boolean equals(Object outro){
        if (outro == null || outro.getClass() != Agenda.class) return false;
        Agenda outraAgenda = (Agenda) outro;

        for (int i = 0; i < contatos.length; i++) {
            if (this.contatos[i] == null){
                if (outraAgenda.contatos[i] != null) return false;
            } else {
                if (!this.contatos[i].equals(outraAgenda.contatos[i])) return false;
            }
        }
        return true;
    }
}
