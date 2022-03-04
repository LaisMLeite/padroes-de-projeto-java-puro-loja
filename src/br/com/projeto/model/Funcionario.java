package br.com.projeto.model;

import java.time.LocalDate;

public class Funcionario {
    private String nomeCompleto;
    private int CPF;
    private LocalDate dataDeNascimento;
    private Cargo cargo;


    public Funcionario(String nomeCompleto, int CPF, LocalDate dataDeNascimento, Cargo cargo) {
        this.nomeCompleto = nomeCompleto;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
        this.cargo = cargo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
