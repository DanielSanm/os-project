package com.daniel.os.domain.enums;

public enum Status {

    // definindo os indices dos enum como fixos
    ABERTO(0, "ABERTO"),
    ANDAMENTO(1, "ANDAMENTO"),
    ENCERRADO(2, "ENCERRADO");


    private Integer cod;
    private String descricao;

    Status(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Status toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }

        for(Status x: Status.values()) {
            if(cod.equals(x.getCod()));
        }

        throw new IllegalArgumentException("Propriedade inválida!" + cod);
    }
}
