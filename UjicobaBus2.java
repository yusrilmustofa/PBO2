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
public class UjicobaBus2 {
    public static void main(String[]simon){
        Bus2 Bus=new Bus2(40);
        Bus.cetak();
        
        Bus.addpenumpang(5);
        Bus.cetak();
        
        Bus.addpenumpang(10);
        Bus.cetak();
    }
}
