package com.pietrofilla.biblioteca.model;

public class Autor {

    private String nome;
    private String nacionalidade;
    private String dataNascimento;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}