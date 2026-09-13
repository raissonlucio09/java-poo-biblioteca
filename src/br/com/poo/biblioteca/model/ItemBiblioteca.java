package br.com.poo.biblioteca.model;

/** Abstração comum para qualquer item que possa ser emprestado. */
public abstract class ItemBiblioteca {
    private final String titulo;
    private final int anoPublicacao;
    private boolean emprestado;

    protected ItemBiblioteca(String titulo, int anoPublicacao) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
        if (anoPublicacao <= 0) {
            throw new IllegalArgumentException("O ano de publicação deve ser positivo.");
        }
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (emprestado) {
            throw new IllegalStateException("O item já está emprestado.");
        }
        emprestado = true;
    }

    public void devolver() {
        if (!emprestado) {
            throw new IllegalStateException("O item não está emprestado.");
        }
        emprestado = false;
    }

    public abstract int getPrazoEmprestimoDias();

    public abstract String getDescricao();
}
