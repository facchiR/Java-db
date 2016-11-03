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
public class Studente extends Utente {
    protected int crediti;
    public Studente(String nome, int crediti){
        super(nome);
        this.crediti = crediti;        
    } 

    public void showname(){
        super.showname();
        System.out.println(" e ho " + crediti + " crediti");
    }
    public void showcredits(){
        System.out.println("Ho " + crediti + " crediti");
    }
}
