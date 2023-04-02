import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz:");
        int basamakSayisi = input.nextInt();

        for (int i = basamakSayisi;i >= 1; i -=1){
            for ( int j =1; j<= (basamakSayisi-i);j++){
                System.out.print(" ");
            }
            for (int k = (2*i-1);k >= 1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
