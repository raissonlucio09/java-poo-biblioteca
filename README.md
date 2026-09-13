# Java POO — Biblioteca

Projeto introdutório em Java para praticar os quatro pilares da Programação Orientada a Objetos (POO) em um domínio simples: uma biblioteca.

## O que foi implementado

- **Abstração:** `ItemBiblioteca` define o contrato comum dos itens emprestáveis.
- **Encapsulamento:** atributos são privados e o estado de empréstimo é alterado por métodos controlados (`emprestar` e `devolver`).
- **Herança:** `Livro` e `Revista` herdam de `ItemBiblioteca`.
- **Polimorfismo:** o `App` percorre um array de `ItemBiblioteca` e cada classe fornece sua própria descrição e prazo de empréstimo.

## Estrutura

```text
src/
└── br/com/poo/biblioteca/
    ├── App.java
    └── model/
        ├── ItemBiblioteca.java
        ├── Livro.java
        └── Revista.java
```

## Como executar

Requer **Java 17 ou superior**.

```bash
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out br.com.poo.biblioteca.App
```

## Exemplo de saída

```text
=== Catálogo da biblioteca ===
Livro: Clean Code, de Robert C. Martin (2008)
Prazo de empréstimo: 14 dias
Status após empréstimo: emprestado
Status final: disponível

Revista: Java Magazine, edição 123 (2024)
Prazo de empréstimo: 7 dias
Status após empréstimo: emprestado
Status final: disponível
```

## Possíveis evoluções

Como exercício, o projeto pode evoluir com cadastro de usuários, controle de multas, persistência em banco de dados, interface gráfica ou uma API REST.
