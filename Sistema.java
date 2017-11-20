/**
* Interface de comando por linha onde ocorre o loop principal do programa
*
* @author Gabriel Alves Tavares
*/
import java.util.Scanner;

public class Sistema {
    /**
    * Cadastra uma contato na agenda. Recebe da entrada padrão uma posição onde,
    * caso seja válida, será registrado um contato com os dados recebidos a seguir
    *
    * @param agenda agenda que guarda todos os contatos
    * @param sc Scanner para receber os dados
    */
    private static void cadastraContato(Agenda agenda, Scanner sc) {
        System.out.print("\nPosição: ");
        int posicao = sc.nextInt();
        sc.nextLine();

        if (posicao < 1 || posicao > 100) {
            System.out.println("POSIÇÃO INVÁLIDA!\n");
            return;
        }

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();

        System.out.print("Telefone: ");
        String telefone = sc.nextLine();

        agenda.cadastraContato(nome, sobrenome, telefone, posicao);
        System.out.println("CADASTRO REALIZADO!\n");
    }


    /**
    * Cadastra uma contato na agenda. Recebe da entrada padrão uma posição onde,
    * caso seja válida, será registrado um contato com os dados recebidos a seguir.
    *
    * @param agenda agenda que guarda todos os contatos
    * @param sc Scanner para receber os dados
    */
    private static void exibirContato(Agenda agenda, Scanner sc) {
        System.out.print("Contato> ");
        int posicao = sc.nextInt();
        sc.nextLine();

        if (posicao < 1 || posicao > 100) {
            System.out.println("POSIÇÃO INVÁLIDA!");
            return;

        } else {
            try {
                System.out.println("\n" + agenda.infoContato(posicao) + "\n");
            } catch (NullPointerException npe) {
                System.out.println("\nPOSIÇÃO INVÁLIDA!\n");
            }
        }

    }

    /**
    * Imprime na saída padrão uma lista com todos os contatos cadastrados
    *
    * @param agenda agenda que guarda os contatos
    */
    private static void listarContatos(Agenda agenda) {
        System.out.println(agenda.listaContatos());
    }


    /**
    * Loop principal do programa
    *
    * @param args parâmetro padrão da main
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("(C)adastrar Contato");
            System.out.println("(L)istar Contatos");
            System.out.println("(E)xibir Contato");
            System.out.println("(S)air");

            System.out.print("\nOpção> ");
            String comando = sc.nextLine();

            if (comando.equals("C")) {
                cadastraContato(agenda, sc);

            } else if (comando.equals("L")) {
                listarContatos(agenda);

            } else if (comando.equals("E")) {
                exibirContato(agenda, sc);

            } else if (comando.equals("S")) {
                break;
            } else {
                System.out.println("OPÇÃO INVÁLIDA!\n");
            }

        }
    }
}
