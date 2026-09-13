package br.com.poo.biblioteca.model;

public class Revista extends ItemBiblioteca {
    private final int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        if (edicao <= 0) {
            throw new IllegalArgumentException("A edição deve ser positiva.");
        }
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 7;
    }

    @Override
    public String getDescricao() {
        return "Revista: %s, edição %d (%d)".formatted(getTitulo(), edicao, getAnoPublicacao());
    }
}
