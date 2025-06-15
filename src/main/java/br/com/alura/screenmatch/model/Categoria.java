package br.com.alura.screenmatch.model;

public enum Categoria {

    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime"),
    DOCUMENTARIO("Documentary"),
    OUTRA("Unknown");


    private String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text) {
        System.out.println("metodo categoria: "+text);
        for (Categoria categoria : Categoria.values()) {
            if (categoria.categoriaOmdb != null && categoria.categoriaOmdb.equalsIgnoreCase(text)) {
                return categoria;
            }
        }
            return OUTRA;
//        throw new IllegalArgumentException("Nenhuma categoria encontrada para a string fornecida: " + text);
    }
    }

