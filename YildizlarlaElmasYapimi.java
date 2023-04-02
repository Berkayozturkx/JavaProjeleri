import java.util.Scanner;

public class YildizlarlaElmasYapimi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Basamak sayısını giriniz:");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi;i++){
            for (int j = 1;j <= (sayi-i);j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int l = (sayi-1); l>= 1 ;l--){
            for (int m = 1;m <= (sayi-l);m++){
                System.out.print(" ");
            }
            for (int n = 1; n <= (2*l-1);n++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
