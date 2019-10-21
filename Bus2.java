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
public class Bus2 {
    private int penumpang;
    private int makspenumpang;
    
    public Bus2 (int makspenumpang){
        this.makspenumpang= makspenumpang;
        penumpang=0;
    }
    public void addpenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if(temp>=makspenumpang){
            System.out.println("Penumpang melebihi kapasitas");
        }else{
            this.penumpang=temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang yang berada di bus sekarang:"+penumpang);
        System.out.println("Maksimal penumpang:"+makspenumpang);
    }
}
