package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Berkay","05528859651","Tarih");
        Teacher t2 = new Teacher("Graham Bell","5555825","Fizik");
        Teacher t3 = new Teacher("Ronnie Coleman","4658756","Beden");


        Course tarih = new Course("Tarih","101","Tarih",t1);
        Course fizik = new Course("Fizik","102","Fizik",t2);
        Course beden = new Course("Beden","103","Beden",t3);

        Student ogrenci = new Student("Burak","123","1",tarih,fizik,beden);

        ogrenci.addBulkExamNote(100,100,50);
        ogrenci.printNote();
        ogrenci.addBulkOpinionNote(80,90,100);
        ogrenci.calculateCourseAvarage();
        ogrenci.isPass();
    }
}
