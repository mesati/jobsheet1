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
public class PilihanMenu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int pilihan=9;
        do{
        System.out.println("\n Menu Luas bangun");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Luas Persegi Panjang");
        System.out.println("3. Keluar");
        System.out.println("Masukkan Pilihan Anda :");
        pilihan = masukan.nextInt();
        switch(pilihan){
            case 1 : luasPersegi();break;       
        }
        }while(pilihan != 3);
    }
    private static void luasPersegi(){
        Scanner masukan = new Scanner(System.in);
    }
}
