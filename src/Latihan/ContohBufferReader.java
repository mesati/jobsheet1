/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ContohBufferReader {
    public static void main(String[] args) throws IOException {
        String nama;
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek Bufferreader
        BufferedReader br = new BufferedReader(isr);
        // Membuat variabel nama dengan bufferreader
        System.out.print("Inputkan nama : ");
        nama = br.readLine();
        // Tampilkan output isi variabel nama
        System.out.println("nama kamu adalah " + nama);


    }
}
