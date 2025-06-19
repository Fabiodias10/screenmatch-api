package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("Action", "Ação"), ROMANCE("Romance", "Romance"), COMEDIA("Comedy", "Comedia"), DRAMA("Drama", "Drama"), CRIME("Crime", "Crime"), DOCUMENTARIO("Documentary", "Documentario"), OUTRA("Unknown", "não tem");


    private String categoriaOmdb;

    private String categoriaPortugues;

    Categoria(String categoriaOmdb, String categoriaPortugues) {

        this.categoriaOmdb = categoriaOmdb;
        this.categoriaPortugues = categoriaPortugues;
    }

    public static Categoria fromString(String text) {
        System.out.println("metodo categoria: " + text);
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb != null && categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }

        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }

    public static Categoria fromPortugues(String text) {
        System.out.println("metodo categoria: " + text);
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaPortugues.equalsIgnoreCase(text)) {
                return categoria;
            }
        }

        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
}

