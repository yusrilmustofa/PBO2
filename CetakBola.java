/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author yusri
 */
public class CetakBola {
     public static void main(String[] args) {
        Bola BolaBesar = new Bola();
        BolaBesar.setJarijari(10);
        BolaBesar.showDiameter();
        BolaBesar.showLuaspermukaan();
        BolaBesar.showVolume();
    }
}
   
