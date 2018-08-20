/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author WINDOWS 10
 */
import java.util.Scanner;
public class suhu {
    public static void main(String[] args) {
       Scanner masukan = new Scanner(System.in);
       float R, F, K;
    System.out.print("Masukkan Nilai Suhu Celcius :");
    float C = masukan.nextInt();
        System.out.println("Pilih Konfersi :");
        String pilihan = masukan.next();
    switch (pilihan){
        case "R":
        case "r":
        System.out.println("Hasil :" +(R= C*4/5));
        break;
        case "F":
        case "f":
        System.out.println("Hasil :" +(F= C*9/5+32));
        break;
        case "K":
        case "k":
        System.out.println("Hasil :" +(K= C+273));
        break;
  }
    }
    }

