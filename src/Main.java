import java.util.Scanner;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {git

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Filme filme = null;

        int opcao;

        do {

            System.out.println("\n===== MUSEU CINEMATOGRÁFICO =====");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Alterar avaliação");
            System.out.println("3 - Exibir informações do filme cadastrado"); /*Alterado de verificar se é classico para exibir informções dos filmes */
            System.out.println("4 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Ano de lançamento: ");
                    int anoLancamento = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    System.out.print("Avaliação: ");
                    double avaliacao = scanner.nextDouble();
                    scanner.nextLine();

                    filme = new Filme(
                            titulo,
                            anoLancamento,
                            genero,
                            avaliacao
                    );

                    System.out.println("Filme: " + filme.getTitulo());
                    System.out.println("Avaliação: " + filme.getAvaliacao());
                    System.out.println("Genero: " + filme.getGenero());

                    if (filme.ehClassico()) {
                        System.out.println("Filme lançado em: " + filme.getAnoLancamento() + " - Clássico");
                    } else {
                        System.out.println("Filme lançado em: " + filme.getAnoLancamento() + " - Contemporâneo");
                    }

                    /// System.out.println(filme.ehClassico());
                    System.out.println("Filme cadastrado com sucesso!  " + filme.getDataCadastro().format(formato));

                    break;

                case 2:

                    if (filme == null) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {


                        double avaliacaoAntiga = filme.getAvaliacao();

                        System.out.println("Avaliação atual: " + avaliacaoAntiga);

                        System.out.print("Digite a nova avaliação: ");
                        double novaAvaliacao = scanner.nextDouble();
                        scanner.nextLine();


                        filme.alterarAvaliacao(novaAvaliacao);


                        System.out.println("Avaliação alterada!");
                        System.out.println("Avaliação antiga: " + avaliacaoAntiga);
                        System.out.println("Nova avaliação: " + filme.getAvaliacao());
                    }

                    break;

                /*case 3:

                    if (filme == null) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {

                        if (filme.ehClassico()) {
                            System.out.println("CLASSICO");
                        } else {
                            System.out.println("CONTEMPORANEO");
                        }
                    }

                    break;*/

                case 3:

                    System.out.println(filme.getTitulo());
                    System.out.println(filme.getAvaliacao());
                    System.out.println(filme.getGenero());

                    if (filme.ehClassico()) {
                        System.out.println("Filme com mais de trinta anos: Clássico");
                    } else {
                        System.out.println("Filme com menos de trinta anos: contemporâneo.");
                    }

                        /// System.out.println(filme.ehClassico());
                    System.out.println("Filme cadastrado em " + filme.getDataCadastro().format(formato));

                    break;
                case 4:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }

}
