import java.util.Scanner;

public class YildizlarlaUcgenYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz:");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi;i += 1){
            for (int k = 1; k <= (sayi - i); k += 1){
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i-1);j += 1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
