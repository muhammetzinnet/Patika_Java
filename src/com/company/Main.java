package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String userName = "patikaatm";
        String password = "12345";

        Scanner input = new Scanner(System.in);

        int right = 3;
        double balance = 1000;
        int select=4;
        int price;

        while (right > 0) {
            System.out.print("Kullanıcı adınız:");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password = input.nextLine();

            if (userName.equals("patikaatm") && password.equals("12345")) {
                System.out.println("ATM Programina Hoş Geldiniz...");

                do{
                    System.out.println("Yapmak istediğiniz işlemi seçiniz\n" +
                            "1.Para Yatırma\n" +
                            "2.Para Çekme\n" +
                            "3.Bakiye ögrenme\n" +
                            "4.Çıkış");

                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı girin: ");
                            price = input.nextInt();

                            balance += price;
                            System.out.print("Yeni bakiye = " + balance + " TL'dir.");
                            System.out.println("\n");
                        case 2:
                            System.out.print("Çekmek istediğiniz para mikatarını giriniz: ");
                            price = input.nextInt();

                            if (price > balance){
                                System.out.println("Bakiyeniz yetersiz. Lütefen daha sonra deneyin...");
                            }else {
                                balance -= price;
                                System.out.print("Yeni bakiyeniz: " + balance + " TL'dir.");
                                System.out.println("\n");
                            }

                        case 3:
                            System.out.print("Bakiyeniz: " + balance + " TL'dir.");
                            System.out.println("\n");

                    }

                }while (select!=4);
                    break;

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre...");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur...");
                }else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }

        }
    }

}
