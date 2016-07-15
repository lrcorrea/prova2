/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import java.util.ArrayList;
/**
 *
 * @author Lucas
 */
public class ListaDePessoa implements Lista{
    private ArrayList<String> lista = new ArrayList();
    
    public void inserir(ArrayList<String> lista){
        this.lista = lista;
    }
    public ArrayList<String> getLista(){
        return this.lista;
    }
    /*public Pessoa remover(String nome){
        return Pessoa;
    }*/
    
    public ArrayList<String> nomes(){
        return lista;
    }
}
