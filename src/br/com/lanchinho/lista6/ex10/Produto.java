/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Exercicio10;

import java.io.Serializable;

/**
 *
 * @author LABCCET
 */
public class Produto implements Serializable{ // obrigatorio pra serialização binária !!!

    private  int codigo; 
    private String nome;
    private double preco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(){
    }


}

