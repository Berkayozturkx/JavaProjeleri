import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip
        ,şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        String sistemKullanici,sistemSifre,kullanici,sifre,yeniSifre,select;
        sistemKullanici = "Berkayozturkx";
        sistemSifre = "123456";
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz:");
        kullanici = input.nextLine();

        System.out.print("Şifrenizi Giriniz:");
        sifre = input.nextLine();

        if ((sistemKullanici.equals(kullanici)) && (sistemSifre.equals(sifre))){
            //  Önemli !!! .equals() fonksiyonu string ifadelerde eşitliği kontrol eder.
            System.out.println("Sisteme başarıyla giriş yaptınız.");
        }else {
            System.out.println("Kullanıcı adı ve şifre hatalı.");
            System.out.print("Şifrenizi değiştirmek ister misiniz?(E/H)");
            select = input.nextLine();
            if (select.equals("E")){
                System.out.print("Yeni şifrenizi giriniz:");
                yeniSifre = input.nextLine();
                if (sistemSifre.equals(yeniSifre)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else {
                    System.out.println("Şifre başarıyla oluşturuldu.");
                }
            }else {
                System.out.println("Programdan çıkış yapılıyor.");
            }
        }

        }


    }
