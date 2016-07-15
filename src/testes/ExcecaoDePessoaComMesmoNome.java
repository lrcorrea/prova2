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
public class ExcecaoDePessoaComMesmoNome extends Exception {
    
    private String nomes = "Este nome já consta na lista";
    public ExcecaoDePessoaComMesmoNome() {
    }

    public ExcecaoDePessoaComMesmoNome(String nomes) {
        super(nomes);
    }
}
