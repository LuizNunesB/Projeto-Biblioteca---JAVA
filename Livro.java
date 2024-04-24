/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author dsrlu
 */
public class Livro {
    private String nome;
    private String titulo;
    private String autor;
    private int n_pag;
    private boolean status;
    
    public Livro(){
    this.autor="";
    this.titulo="";
    this.nome="";
    this.status=false;
    this.n_pag=0;
    }

    public Livro(String nome, String titulo, String autor, int n_pag, boolean status) {
        this.nome = nome;
        this.titulo = titulo;
        this.autor = autor;
        this.n_pag = n_pag;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getN_pag() {
        return n_pag;
    }

    public void setN_pag(int n_pag) {
        this.n_pag = n_pag;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.autor);
        hash = 67 * hash + this.n_pag;
        hash = 67 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.n_pag != other.n_pag) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    
    public void empresta(){
        this.status=true;
    }
    
    public void devolve(){
        this.status=false;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome: " + nome + ", autor: " + autor + ", numero de paginas" + n_pag + ", estado do livro:" + (this.status ? "Emprestado" : "Não emprestado") + '}';
    }
    
    
}
