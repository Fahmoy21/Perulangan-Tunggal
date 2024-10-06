/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class kasir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilih=0, jumlah, total;
        double diskon=0, persen=0, grandTotal1=0, grandTotal2=0;
        do{
            total=0;
            System.out.println("Aplikasi Kasir");
            System.out.println("1. Tas\n2. Sandal\n3. Sepatu");
            System.out.println("4. Selesai");
            System.out.println("pilih : ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Tas : Rp 100.000");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total=100000*jumlah;
                    System.out.println("Total : Rp "+total);
                    break;
                case 2:
                    System.out.println("Sandal : Rp 150.000");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total=150000*jumlah;
                    System.out.println("Total : "+total);
                    break;
                case 3:
                    System.out.println("Sepatu : Rp 200.");
                    System.out.print("Jumlah : ");
                    jumlah=sc.nextInt();
                    total=200000*jumlah;
                    System.out.println("Total : "+total);
                    break;  
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default: System.out.println("Pilihan zonk");
                
                
            }  
            
            grandTotal1 += total; 
            
        } while(pilih != 4);
        
        if (grandTotal1 >= 1000000) {
            diskon = 0.45;
        } else if (grandTotal1 >= 500000) {
            diskon = 0.30;
        } else if (grandTotal1 >= 250000) {
            diskon = 0.20;
        }
        
        double jumlahDiskon = grandTotal1 * diskon;
        grandTotal2 = grandTotal1 - jumlahDiskon;     
        persen = diskon * 100;
        
        System.out.println("\nJumlah barang yang dibeli : " + total);
        System.out.println("Total belanja : Rp : " + grandTotal1);
        System.out.println("=============================================");
        if (diskon > 0) {
            System.out.println("Mendapatkan diskon sebesar : " + persen + "%");
            System.out.println("Nilai diskon : Rp " + jumlahDiskon);
        }
        System.out.println("=============================================");
        System.out.println("Total belanja setelah diskon : Rp " + grandTotal2);
        System.out.println("\nTerima kasih telah berbelanja!");
    }
}
        
    
    
    

