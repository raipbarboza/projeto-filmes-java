import java.time.LocalDateTime;

public class Filme {

    // Atributos
    private String titulo;
    private int anoLancamento;
    private String genero;
    private double avaliacao;
    private LocalDateTime dataCadastro;

    // Construtor
    public Filme(String titulo, int anoLancamento, String genero, double avaliacao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.avaliacao = avaliacao;
        this.dataCadastro = LocalDateTime.now();
    }

    // Retorna o título
    public String getTitulo() {
        return titulo;
    }

    // Retorna o ano de lançamento
    public int getAnoLancamento() {
        return anoLancamento;
    }

    // Retorna o gênero
    public String getGenero() {
        return genero;
    }

    // Retorna a avaliação
    public double getAvaliacao() {
        return avaliacao;
    }

    // Altera a avaliação
    public void alterarAvaliacao(double novaAvaliacao) {
        this.avaliacao = novaAvaliacao;
    }

    // Verifica se o filme é clássico
    public boolean ehClassico() {
        LocalDateTime agora = LocalDateTime.now();
        int anoAtual = agora.getYear();
        return anoAtual - anoLancamento > 30;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

}
