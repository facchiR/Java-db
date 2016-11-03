/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author utente
 */
public class Utente {
    protected String nome;
    public Utente(String nome){
        this.nome = nome;    
    }
    public void showname(){
        System.out.println("Il mio nome è " + this.nome);
    }
}
