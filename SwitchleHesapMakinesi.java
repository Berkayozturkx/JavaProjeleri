import java.util.Scanner;

public class SwitchleHesapMakinesi {
    public static void main(String[] args) {
        int select,valueOne,valueTwo;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz:");
        valueOne = input.nextInt();

        System.out.print("2.Sayıyı giriniz:");
        valueTwo = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Girdiğiniz sayıların toplamı:" + (valueOne+valueTwo));
                break;
            case 2:
                System.out.println("Girdiğiniz sayıların farkı:" + (valueOne-valueTwo));
                break;
            case 3:
                System.out.println("Girdiğiniz sayıların çarpımı:" + (valueOne*valueTwo));
                break;
            case 4:
                System.out.println("Girdiğiniz sayıların bölümü:" + (valueOne/valueTwo));
                break;
            default:
                System.out.println("Yanlış işlem numarası girdiniz.");


        }
    }
}
