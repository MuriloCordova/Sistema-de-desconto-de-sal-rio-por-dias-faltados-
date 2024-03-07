package com.senai.pagamento.dtos;

public class PagamentoDTO {

    private String nomeUsuario;
    private float salario;
    private int diasFaltados;
    private int horaExtra;
    private float valorHora;
    private int diasAbonados;
    private float valorAbono;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

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

    public int getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(int horaExtra) {
        this.horaExtra = horaExtra;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getDiasAbonados() {
        return diasAbonados;
    }

    public void setDiasAbonados(int diasAbonados) {
        this.diasAbonados = diasAbonados;
    }

    public float getValorAbono() {
        return valorAbono;
    }

    public void setValorAbono(float valorAbono) {
        this.valorAbono = valorAbono;
    }
}
