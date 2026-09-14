import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Filme filme = null;

        int opcao;

        do {

            String menu = "===== MUSEU CINEMATOGRÁFICO =====" + "\n\n1 - Cadastrar filme" + "\n2 - Alterar avaliação" + "\n3 - Exibir informações do filme cadastrado" + "\n4 - Encerrar";

            String entradaOpcao = JOptionPane.showInputDialog(null, menu + "\n\nEscolha uma opção:");

            opcao = Integer.parseInt(entradaOpcao);

            switch (opcao) {

                case 1: {

                    String titulo = JOptionPane.showInputDialog(null, "Título:");

                    String entradaAno = JOptionPane.showInputDialog(null, "Ano de lançamento:");

                    int anoLancamento = Integer.parseInt(entradaAno);

                    String genero = JOptionPane.showInputDialog(null, "Gênero:");

                    String entradaAvaliacao = JOptionPane.showInputDialog(null, "Avaliação:");

                    double avaliacao = Double.parseDouble(entradaAvaliacao);

                    filme = new Filme(titulo, anoLancamento, genero, avaliacao);

                    String classificacao;

                    if (filme.ehClassico()) {
                        classificacao = "Clássico";
                    } else {
                        classificacao = "Contemporâneo";
                    }

                    JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!" + "\n\nTítulo: " + filme.getTitulo() + "\nAno de lançamento: " + filme.getAnoLancamento() + "\nGênero: " + filme.getGenero() + "\nAvaliação: " + filme.getAvaliacao() + "\nClassificação: " + classificacao + "\nData de cadastro: " + filme.getDataCadastro().format(formato)

                    );

                    break;
                }

                case 2:

                    if (filme == null) {

                        JOptionPane.showMessageDialog(null, "Nenhum título cadastrado.");

                    } else {

                        double avaliacaoAntiga = filme.getAvaliacao();

                        String entradaNovaAvaliacao = JOptionPane.showInputDialog(null, "Avaliação atual: " + avaliacaoAntiga + "\n\nDigite a nova avaliação:");

                        double novaAvaliacao = Double.parseDouble(entradaNovaAvaliacao);

                        filme.alterarAvaliacao(novaAvaliacao);

                        JOptionPane.showMessageDialog(null, "Avaliação alterada com sucesso!" + "\n\nAvaliação antiga: " + avaliacaoAntiga + "\nNova avaliação: " + filme.getAvaliacao());
                    }

                    break;

                /*
                 * Versão inicial do switch 3:
                 * realizava apenas a verificação se o filme era clássico ou contemporâneo.
                 *
                 * Refatoração:
                 * o case 3 foi aprimorado para exibir as informações completas do filme,
                 * mantendo a responsabilidade da verificação de classificação no método
                 * filme.ehClassico().
                 *
                 * Dessa forma, a regra de negócio permanece encapsulada na classe Filme,
                 * enquanto o switch fica responsável apenas por apresentar os dados ao usuário.
                 *
                 * Essa abordagem melhora a organização do código e evita duplicar a lógica
                 * de verificação de filmes clássicos em diferentes partes do programa.
                 *
                 * Versão anterior:
                 *
                 * case 3:
                 *
                 *     if (filme == null) {
                 *         System.out.println("Nenhum filme cadastrado.");
                 *     } else {
                 *
                 *         if (filme.ehClassico()) {
                 *             System.out.println("CLASSICO");
                 *         } else {
                 *             System.out.println("CONTEMPORANEO");
                 *         }
                 *     }
                 *
                 *     break;
                 */

                case 3: {

                    if (filme == null) {

                        JOptionPane.showMessageDialog(null, "Nenhum título cadastrado.");

                    } else {

                        String classificacao;

                        if (filme.ehClassico()) {
                            classificacao = "Clássico";
                        } else {
                            classificacao = "Contemporâneo";
                        }

                        String informacoes = "INFORMAÇÕES DO FILME" + "\n\nTítulo: " + filme.getTitulo() + "\nAno de lançamento: " + filme.getAnoLancamento() + "\nGênero: " + filme.getGenero() + "\nAvaliação: " + filme.getAvaliacao() + "\nClassificação: " + classificacao + "\nData de cadastro: " + filme.getDataCadastro().format(formato);

                        JOptionPane.showMessageDialog(null, informacoes);
                    }

                    break;
                }

                case 4:
                    JOptionPane.showMessageDialog(null, "Programa encerrado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }

        } while (opcao != 4);

    }

}
