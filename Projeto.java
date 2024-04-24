/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto;
import java.util.Scanner;
import model.Biblioteca;
import model.Livro;
/**
 *
 * @author dsrlu
 */
public class Projeto {

    public static void main(String[] args) {
        Livro livro = new Livro();
        Biblioteca biblioteca = new Biblioteca();
        Scanner ler = new Scanner(System.in);
        int opcao;
       
        do{
        
        System.out.println("Escolha uma opção:");
        System.out.println("1-Ver livros");
        System.out.println("2-Escolher um livro");
        System.out.println("3-Devolver um livro");
        System.out.println("4-Cadastrar um livro");
        System.out.println("5-Remover Livro");
        System.out.println("9-Finalizar aplicação");
        opcao = ler.nextInt();
            
        
        if(opcao==1){
            biblioteca.exibirLivros();
        }
        else if(opcao==2){
            String nome = "";
            String autor = "";
            int numero = 0;
            
            System.out.println("Digite o nome do livro: ");
            nome = ler.next();
            System.out.println("Digite o nome do Autor: ");
            autor = ler.next();
            System.out.println("Digite o número de páginas: ");
            numero = ler.nextInt();
            
            if(nome != livro.getNome() && autor != livro.getAutor() && numero != livro.getN_pag()){
                System.out.println("Sem registro do livro procurado");
            }
            else{
                if(livro.isStatus()== true){
                    System.out.println("O livro já está emprestado");
                }
                else if(nome.equals(livro.getNome()) && autor.equals(livro.getAutor()) && numero == livro.getN_pag()){
                    livro.setStatus(true);
                    System.out.println("Livro emprestado com sucesso");
                }
            }
        }
        else if(opcao==3){
            String nome = "";
            String autor = "";
            int numero = 0;
            
            System.out.println("Digite o nome do livro: ");
            nome = ler.next();
            System.out.println("Digite o nome do Autor: ");
            autor = ler.next();
            System.out.println("Digite o número de páginas: ");
            numero = ler.nextInt();
            
            if(livro.isStatus()== false){
                System.out.println("O livro já foi devolvido");
            }
            else if(nome.equals(livro.getNome()) && autor.equals(livro.getAutor()) && numero == livro.getN_pag()){
                livro.setStatus(false);
                System.out.println("Livro devoldido com sucesso");
            }
        }
        else if(opcao==4){
            System.out.println("Digite o nome do livro:");
            livro.setNome(ler.next());
            System.out.println("Digite o nome do Autor:");
            livro.setAutor(ler.next());
            System.out.println("Digite a quantidade de páginas do livro:");
            livro.setN_pag(ler.nextInt());
            biblioteca.adicionarLivro(livro);
        }
        else if(opcao==5){
            System.out.println("Digite o nome do livro:");
            livro.setNome(ler.next());
            System.out.println("Digite o nome do Autor:");
            livro.setAutor(ler.next());
            System.out.println("Digite a quantidade de páginas do livro:");
            livro.setN_pag(ler.nextInt());
            biblioteca.removeLivro(livro);
            System.out.println("Livro removido da lista");
        }
        else if(opcao==9){
            System.out.println("Finalizando programa");
        }
        else{
            System.out.println("Opção Inválida");
        }
        }while(opcao!=9);
        
        
    }
}
