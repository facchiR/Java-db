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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Utente pippo = new Utente("pippo");
        Utente paperino = new Utente("paperino");
        Utente pluto = new Studente("pluto",0);
        Studente orazio = new Studente("orazio",0);
        paperino.showname();
        pippo.showname();
        pluto.showname();
        orazio.showcredits();
    }
    
}
