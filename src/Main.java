import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Compromisso> compromissos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1. Criar Compromisso");
            System.out.println("2. Criar Reunião");
            System.out.println("3. Criar Evento Social");
            System.out.println("4. Mostrar Compromissos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    compromissos.add(criarCompromisso(scanner));
                    break;
                case 2:
                    compromissos.add(criarReuniao(scanner));
                    break;
                case 3:
                    compromissos.add(criarEventoSocial(scanner));
                    break;
                case 4:
                    mostrarCompromissos(compromissos);
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    public static Compromisso criarCompromisso(Scanner scanner) {
        System.out.println("Digite a data (AAAA-MM-DD): ");
        String data = scanner.nextLine();
        System.out.println("Digite a hora (HH:MM): ");
        String hora = scanner.nextLine();
        System.out.println("Digite a descrição: ");
        String descricao = scanner.nextLine();

        return new Compromisso(data, hora, descricao);
    }

    public static Reuniao criarReuniao(Scanner scanner) {
        System.out.println("Digite a data (AAAA-MM-DD): ");
        String data = scanner.nextLine();
        System.out.println("Digite a hora (HH:MM): ");
        String hora = scanner.nextLine();
        System.out.println("Digite a descrição: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite os participantes (separados por vírgula): ");
        String participantes = scanner.nextLine();

        return new Reuniao(data, hora, descricao, participantes);
    }

    public static EventoSocial criarEventoSocial(Scanner scanner) {
        System.out.println("Digite a data (AAAA-MM-DD): ");
        String data = scanner.nextLine();
        System.out.println("Digite a hora (HH:MM): ");
        String hora = scanner.nextLine();
        System.out.println("Digite a descrição: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite o local: ");
        String local = scanner.nextLine();

        return new EventoSocial(data, hora, descricao, local);
    }

    public static void mostrarCompromissos(ArrayList<Compromisso> compromissos) {
        for (Compromisso compromisso : compromissos) {
            compromisso.imprimirDetalhes();
            if (compromisso instanceof Reuniao) {
                Reuniao reuniao = (Reuniao) compromisso;
                System.out.println("Tipo: Reunião");
                System.out.println("Participantes: " + reuniao.getParticipantes());
            } else if (compromisso instanceof EventoSocial) {
                EventoSocial evento = (EventoSocial) compromisso;
                System.out.println("Tipo: Evento Social");
                System.out.println("Local: " + evento.getLocal());
            }
            System.out.println("-------------------------");
        }
    }
}
