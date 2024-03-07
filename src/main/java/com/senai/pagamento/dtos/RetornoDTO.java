package com.senai.pagamento.dtos;

public class RetornoDTO {
    private String nomeUsuario;
    private float salario;
    private int diasFaltados;
    private float descontoSalario;



    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getDiasFaltados() {
        return diasFaltados;
    }

    public void setDiasFaltados(int diasFaltados) {
        this.diasFaltados = diasFaltados;
    }

    public float getDescontoSalario() {
        return descontoSalario;
    }

    public void setDescontoSalario(float descontoSalario) {
        this.descontoSalario = descontoSalario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
}
