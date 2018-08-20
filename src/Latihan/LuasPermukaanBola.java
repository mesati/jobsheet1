/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class LuasPermukaanBola {
    public static void main(String[] args) {
        System.out.println("Menghitung Luas Permukaan Bola");
        String jari = "";
        jari = JOptionPane.showInputDialog("Masukkkan Jari - Jarinya : ");
        int r=Integer.parseInt(jari);
        System.out.println("Jari - jari =" +(r));
        System.out.println("Luas permukaannya ="+((3.14*r*r)*4));
    }   
}
