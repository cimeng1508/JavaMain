/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

public class KalkulatorMTK {
public static void main(String[] args) {
        boolean isExit = false;
	   Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("========= Kalkulator Console =========");
		System.out.println("Menu :1. Penjumlahan 2. Pengurangan 3. Perkalian 4. Pembagian 5. Keluar aplikasi ");
                System.out.print("Pilih operasi : ");
		int menuSelect = scanner.nextInt();
		if (menuSelect == 5) {
                    System.out.println("Anda Keluar Aplikasi");
			isExit = true;
		} else {
			if (menuSelect == 1) { //Penambahan
				System.out.println("Operasi Penjumlahan ");
			} else if (menuSelect == 2) { //Pengurangan
				System.out.println("Operasi Pengurangan ");
			} else if (menuSelect == 3) { //Perkalian
				System.out.println("Operasi Perkalian ");
			} else if (menuSelect == 4) { //Pembagian
				System.out.println("Operasi Pembagian ");
			}
			
			System.out.print("Masukkan angka 1 : ");
			double value1 = scanner.nextDouble();
			System.out.print("Masukkan angka 2 : ");
			double value2 = scanner.nextDouble();
			
			double result = 0;
			
			if (menuSelect == 1) { //Penambahan
				result = value1 + value2;
			} else if (menuSelect == 2) { //Pengurangan
				result = value1 - value2;
			} else if (menuSelect == 3) { //Perkalian
				result = value1 * value2;
			} else if (menuSelect == 4) { //Pembagian
				result = value1 / value2;
			} 
			
			System.out.println("Hasil : " + result);
			
				isExit = false;
		}			
	} while (!isExit);
	scanner.close();
}
    }  
