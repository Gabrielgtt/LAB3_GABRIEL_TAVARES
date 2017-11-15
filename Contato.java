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
     */
    public String toString() {
        return (nome + " " + sobrenome + " - " + numero);
    }
    
    /**
     * retorna uma string com o nome e sobrenome do contato 
     */
    public String getNomeCompleto() {
        return (nome + " " + sobrenome);
    }

}