package com.daniel.os.domain.enums;

public enum Prioridade {

    // definindo os indices dos enum como fixos
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");


    private Integer cod;
    private String descricao;

    Prioridade(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Prioridade toEnum(Integer cod) {
        if(cod == null) {
            return null;
        }

        for(Prioridade x: Prioridade.values()) {
            if(cod.equals(x.getCod()));
        }

        throw new IllegalArgumentException("Propriedade inválida!" + cod);
    }
}

