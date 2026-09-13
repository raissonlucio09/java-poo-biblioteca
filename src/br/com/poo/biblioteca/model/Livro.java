package br.com.poo.biblioteca.model;

public class Livro extends ItemBiblioteca {
    private final String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        if (autor == null || autor.isBlank()) {
            throw new IllegalArgumentException("O autor não pode ser vazio.");
        }
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public int getPrazoEmprestimoDias() {
        return 14;
    }

    @Override
    public String getDescricao() {
        return "Livro: %s, de %s (%d)".formatted(getTitulo(), autor, getAnoPublicacao());
    }
}
