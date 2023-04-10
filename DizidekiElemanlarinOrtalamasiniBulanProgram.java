public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    static void dizilerinOrtalamasiniBulma(int[] list){
        double toplam = 0;
        int uzunluk = list.length;
        double ortalama = 0.0;
        for (int i = 0 ; i < list.length ; i++){
            toplam += list[i];
        }
        ortalama = toplam/uzunluk;
        System.out.println("Girilen dizinin ortalaması : "+ortalama);
    }


    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6};
        dizilerinOrtalamasiniBulma(list);
    }
}
