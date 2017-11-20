/**
 * Representação de um contato
 *
 * @author Gabriel Alves Tavares
 */
public class Contato {

    private String nome;
    private String sobrenome;
    private String numero;

    /**
     * Construtor do contato
     *
     * @param nome nome do contato
     * @param sobrenome sobrenome do contato
     * @param numero numero do contato
     */
    public Contato(String nome, String sobrenome, String numero) {
        if (nome == null || sobrenome == null  || numero == null){
            throw new NullPointerException();
        }
        if (nome.trim().equals("") || sobrenome.trim().equals("") || numero.trim().equals("")){
            throw new IllegalArgumentException();
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
    }

    /**
     * retorna uma representação em string do contato
     * @return representação em String da classe
     */
    public String toString() {
        return nome + " " + sobrenome + " - " + numero;
    }

    /**
     * retorna uma string com o nome e sobrenome do contato
     * @return string com nome e sobrenome separados por espaço
     */
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    /**
    * Compara um objeto Contato com outro objeto
    *
    * @param outro Objeto a ser comparado
    * @return verdadeiro se ambos os contatos tem nomes iguais, falso do contrário
    */
    public boolean equals(Object outro){
        if (outro == null || outro.getClass() != Contato.class) return false;
        Contato outroContato = (Contato) outro;

        return this.getNomeCompleto().equals(outroContato.getNomeCompleto());
    }

}
