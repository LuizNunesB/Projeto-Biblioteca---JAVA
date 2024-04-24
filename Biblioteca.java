/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.Livro;
/**
 *
 * @author dsrlu
 */
public class Biblioteca {
    private ArrayList<Livro> acervo;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.acervo);
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
        final Biblioteca other = (Biblioteca) obj;
        return Objects.equals(this.acervo, other.acervo);
    }

    
    
    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
    }
    
    public void removeLivro(Livro livro){
        this.acervo.remove(livro);
    }
    public void emprestarLivro(Livro livro) {
        livro.empresta();
    }

    public void devolverLivro(Livro livro) {
        livro.devolve();
    }

    public void exibirLivros() {
        for (Livro livro : acervo) {
            System.out.println(livro);
        }
    }
    
}
