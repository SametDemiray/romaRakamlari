package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi = 0;
        int   k1 = 0;
        int   k2 = 0;
        int   k3 = 0;
        String    rs;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Roma Rakamları ile Sayıyı Giriniz = ");
        rs=scanner.nextLine();

            for (int i=0; i<rs.length(); i++){
                k2=k1;
                switch (rs.charAt(i))
                {
                    case 'I' : k1=1; break;
                    case 'V' : k1=5; break;
                    case 'X' : k1=10; break;
                    case 'L' : k1=50; break;
                    case 'C' : k1=100; break;
                    case 'D' : k1=500; break;
                    case 'M' : k1=1000; break;

                }
                if (k1>k2) k3=-2*k2;
                else k3=0;
                sayi=sayi+k1+k3;
            }
        System.out.println("Sayı :" + sayi);
    }
}