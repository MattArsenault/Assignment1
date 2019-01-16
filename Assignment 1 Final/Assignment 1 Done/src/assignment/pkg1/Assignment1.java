/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg1;

/**
 *
 * @author c0710955
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
    }
    public static String stringPower(String s, int a){
        
        if (s == ""){
            return s;
        }
        if (a < 1){
            return null;
        }
        if (a == 1){
            return s;
        }
        if (a == 2){
            return s + s;
        }
        return s;
    }
}
