import java.util.Scanner;

public class CLI {

    public static void cadastraContato(Agenda agenda, Scanner sc) {
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

    private static void listarContatos(Agenda agenda) {
        System.out.println(agenda.listaContatos());
    }
}