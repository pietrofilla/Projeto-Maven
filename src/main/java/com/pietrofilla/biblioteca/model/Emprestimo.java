package com.pietrofilla.biblioteca.model;

public class Emprestimo {

    private String dataEmprestimo;
    private String dataDevolucao;
    private String status;
    private String livro;
    private String usuario;

    // Getters
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    public String getLivro() {
        return livro;
    }

    public String getUsuario() {
        return usuario;
    }

    // Setters
    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}