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
public class Funcionario extends Pessoa{
    private Double salario=null;
    private Double percentual=null;
    public Funcionario(String nome, String cpf, String endereco, String className){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.className = className;
    }
    
    public void setSalario(Double salario){
        this.salario = salario;
    }
    public Double getSalario(){
        return this.salario;
    }
    
    public Double percentual(Double percentual){
        return this.percentual;
    }
}
