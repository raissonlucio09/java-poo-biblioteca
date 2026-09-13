package br.com.poo.biblioteca;

import br.com.poo.biblioteca.model.ItemBiblioteca;
import br.com.poo.biblioteca.model.Livro;
import br.com.poo.biblioteca.model.Revista;

public class App {
    public static void main(String[] args) {
        ItemBiblioteca[] itens = {
            new Livro("Clean Code", 2008, "Robert C. Martin"),
            new Revista("Java Magazine", 2024, 123)
        };

        System.out.println("=== Catálogo da biblioteca ===");
        for (ItemBiblioteca item : itens) {
            exibirItem(item);
        }
    }

    private static void exibirItem(ItemBiblioteca item) {
        System.out.println(item.getDescricao());
        System.out.println("Prazo de empréstimo: " + item.getPrazoEmprestimoDias() + " dias");
        item.emprestar();
        System.out.println("Status após empréstimo: " + (item.isEmprestado() ? "emprestado" : "disponível"));
        item.devolver();
        System.out.println("Status final: " + (item.isEmprestado() ? "emprestado" : "disponível"));
        System.out.println();
    }
}
