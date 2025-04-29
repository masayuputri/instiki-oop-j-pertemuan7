/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemua702;

import java.util.Scanner;

/**
 *
 * @author Masayu Putri
 */
public class Pertemua702 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ulang="ya";
        String pil = "";
        Scanner p = new Scanner(System.in);
        
        do{
            System.out.println("Aplikasi AZALAJA");
            System.out.println("1. Hitung Luas Persegi");
            System.out.println("2. Hitung Luas Segitiga");
            System.out.println("3. Selesai");
            System.out.print("Pilih 1/2/3: ");
            pil = p.nextLine();
            switch (pil) {
                case "1":
                    System.out.println("Memilih Menu Hitung Luas Persegi");
                    break;
                case "2":
                    System.out.println("Memilih Menu Hitung Luas Segitiga");
                    break;
                case "3":
                    ulang = "tidak";
                    break;
                default:
                    System.out.print("Sihlakan pilih 1/2/3:");
            }
        }while(ulang.equals("ya"));
        }
    }
    

