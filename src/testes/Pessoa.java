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
abstract class Pessoa {
    protected String nome=null;
    protected String cpf=null;
    protected String endereco=null;
    protected String className=null;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getEnderec(){
        return this.endereco;
    }
    
    public String getClassName(){
        return this.className;
    }
    
    public void setClassName(String className){
        this.className = className;
    }
}
