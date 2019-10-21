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
public class UjicobaBUS3 {
    public static void main(String[]Yusril){
    BUS3 Bus=new BUS3(10);
       Bus.makspenumpang=25;
       Bus.addpenumpang(10);
        Bus.getpenumpang(24);
        Bus.cetak();
        Bus.penumpang=Bus.penumpang+9;
        Bus.cetak();
        Bus.penumpang=Bus.penumpang+10;
        Bus.cetak();
    }
}
