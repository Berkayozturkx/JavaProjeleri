import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutF = 2.14,elmaF =3.67 ,domatesF = 1.11,muzF = 0.95,patlicanF = 5;
        double armutM,elmaM,domatesM, muzM, patlicanM,tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Armuttan kaç kilo aldınız?:");
        armutM = input.nextDouble();

        System.out.print("Elmadan kaç kilo aldınız?:");
        elmaM = input.nextDouble();

        System.out.print("Domatesten kaç kilo aldınız?:");
        domatesM = input.nextDouble();

        System.out.print("Muzdan kaç kilo aldınız?:");
        muzM = input.nextDouble();

        System.out.print("Patlıcandan kaç kilo aldınız?:");
        patlicanM = input.nextDouble();

        tutar = (armutF*armutM) + (elmaF*elmaM) + (domatesF*domatesM) + (muzF* muzM) + (patlicanF*patlicanM);

        System.out.println("Toplam tutar:" + tutar);
    }
}
