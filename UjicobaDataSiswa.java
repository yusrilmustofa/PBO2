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
public class UjicobaDataSiswa {
    public static void main(String[]Yusril){
        DataSiswa Data=new DataSiswa();
        Data.setNama("Yusril");
        Data.setAge(15);
        Data.setAddres("Malang");
        
        System.out.println("Nama:"+Data.getNama());
        System.out.println("Age:"+Data.getAge());
        System.out.println("Addres:"+Data.getAddres());
}
}
