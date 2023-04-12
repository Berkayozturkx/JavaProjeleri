package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlasına Hoşgeldiniz.");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz. ");
        System.out.print("Satır sayısı: ");
        row = input.nextInt();
        System.out.print("Sütun sayısı: ");
        column = input.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();
    }
}
