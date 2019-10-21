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
public class UjiBus {
    public static void main(String[]srgs){
        BUS busmini=new BUS();  
            busmini.penumpang=15;
            busmini.makspenumpang=25;
            busmini.cetak();
            busmini.penumpang=busmini.penumpang+9;
            busmini.cetak();
            busmini.penumpang=busmini.penumpang-9;
            busmini.cetak();
            busmini.makspenumpang=busmini.makspenumpang+10;
    }
}
