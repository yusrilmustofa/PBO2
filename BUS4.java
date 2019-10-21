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
public class BUS4 {

    private double penumpang;
    private double makspenumpang;
    private double Average;

    public BUS4(int makspenumpang) {
        this.makspenumpang = makspenumpang;
        penumpang = 0;
        Average = 0;
    }

    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp >= makspenumpang) {
            System.out.println("Penumpang melebihi kuota,MOHON MAAF");
        } else {
            this.penumpang =(double) temp;
        }
    }

    public double getAverage(double Average) {
        double temp;
        temp =  (double) (this.Average + Average);
        if (temp < Average) {
            System.out.println("Berat rata rata penumpang:");
        } else {
            this.Average=(double)temp;
        }
        return Average;
    }

    public void cetak() {
        System.out.println("Penumpang bus sekarang:" + penumpang);
        System.out.println("Jumlah maksimal bus:" + makspenumpang);
        System.out.println("Berat rata rata penumpang:"+Average+"Kg");
    }
}
