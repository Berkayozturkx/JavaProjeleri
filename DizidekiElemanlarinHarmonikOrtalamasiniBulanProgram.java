public class DizidekiElemanlarinHarmonikOrtalamasiniBulanProgram {

    static void harmonikOrtalama(double[] list){
        double harmonikToplam = 0;
        double harmonikOrtalama = 0;
        for (int i = 0 ; i < list.length ; i++){
            harmonikToplam += 1 / list[i];
        }
        harmonikOrtalama = list.length / harmonikToplam;
        System.out.println("Girilen dizinin harmonik ortalaması: "+ harmonikOrtalama);
    }

    public static void main(String[] args) {
        double[] list = {1,2,3,4,5,6};
        harmonikOrtalama(list);
    }
}
