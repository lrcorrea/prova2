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
import java.util.Scanner;
public class Interface {
    public ListaDePessoa lista = new ListaDePessoa();
    public void menu(){
        System.out.println("add Pesosa");
        Pessoa temp = new Cliente("Lucas", "123123", "asdasd", "Pessoa");
        
        System.out.println("add Func");
        Pessoa temp2 = new Funcionario("Lucas", "123123", "asdasd", "Funcionario");
    }
}
