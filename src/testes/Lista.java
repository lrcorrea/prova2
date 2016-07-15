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
public interface Lista {
    public int inserir(Pessoa obj) throws ExcecaoDePessoaComMesmoNome;
    // método que insere um objeto na coleção. O método joga a Exceção caso já exista na coleção,
    // uma pessoa com o mesmo nome da pessoa do argumento
    /////////public Pessoa remover(String nome) ;
    // remove um objeto da lista retornando-o. Retorna null se a Pessoa não está na lista.
    public ArrayList<String> nomes( ) ;
     // retorna um array de String com os nomes de todas as pessoas que estão na lista

}
