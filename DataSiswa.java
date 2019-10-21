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
public class DataSiswa {
    private int Age;
    private String Nama;
    private String Addres;
    
    public int getAge(){
        return Age;
    }
    public String getNama(){
        return Nama;
    }
    public String getAddres (){
        return Addres;
    }
    public void setAge(int newAge){
        Age=newAge;
    }
    public void setNama(String newNama){
        Nama=newNama;
    }
    public void setAddres(String newAddres){
        Addres=newAddres;
    }
}
