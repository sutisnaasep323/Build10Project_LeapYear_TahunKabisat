/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

/**
 *
 * @author keyla
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cekTahun = 2021;
        
        if (cekTahun % 4 == 0){
            System.out.println("Ini tahun Kabisat!");
        } else {
            System.out.println("Ini bukan tahun kabisat");
        }
    }
    
}
