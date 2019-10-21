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
public class UjiBus4 {

    public static void main(String[] simon) {
        BUS4 busbesar = new BUS4(40);
        busbesar.cetak();
        
       busbesar.addpenumpang(11);
       busbesar.getAverage(42.5);
       busbesar.cetak();
       
       busbesar.addpenumpang(5);
       busbesar.getAverage(41.5);
       busbesar.cetak();
    }
}
