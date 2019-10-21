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
public class BUS {
    public int penumpang;
    public int makspenumpang;
    
    public void cetak(){
            System.out.println("Jumlah penumpang saat ini:"+penumpang);
            System.out.println("Jumlah masksimal penumpang:"+makspenumpang);
    }
}
