/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

/**
 *
 * @author Lucas
 */
public class Cliente extends Pessoa{
    private Produto ultimo=null;
    public Cliente(String nome, String cpf, String endereco, String className){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.className = className;
    }
}
