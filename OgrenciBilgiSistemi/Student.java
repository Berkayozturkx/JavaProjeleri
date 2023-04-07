package OgrenciBilgiSistemi;

public class Student {
    String name;
    String StuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Student(String name, String StuNo, String classes, Course course1, Course course2, Course course3){
        this.name = name;
        this.StuNo = StuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int course1Note,int course2Note,int course3Note){
        if ((course1Note >= 0 && course1Note <= 100)){
            this.course1.note = course1Note;
        }
        if ((course2Note >= 0 && course2Note <= 100)){
            this.course2.note = course2Note;
        }
        if ((course3Note >= 0 && course3Note <= 100)){
            this.course3.note = course3Note;
        }
    }

    void addBulkOpinionNote(int course1Opinion, int course2Opinion,int course3Opinion){
        if (course1Opinion >= 0){
            this.course1.sozluNotu = course1Opinion;
        }
        if (course1Opinion >= 0){
            this.course2.sozluNotu = course2Opinion;
        }
        if (course1Opinion >= 0){
            this.course3.sozluNotu = course3Opinion;
        }
    }



    void calculateCourseAvarage(){
        double ortalama1 = (course1.sozluNotu*0.20+course1.note*0.8);
        double ortalama2 = (course2.sozluNotu*0.20+course2.note*0.8);
        double ortalama3 = (course3.sozluNotu*0.20+course3.note*0.8);

        System.out.println(course1.name + " Dersi Ortalamanız: "+ortalama1);
        System.out.println(course2.name + " Dersi Ortalamanız: "+ortalama2);
        System.out.println(course3.name + " Dersi Ortalamanız: "+ortalama3);
    }
    void isPass(){
        double ortalama1 = (course1.sozluNotu*0.20+course1.note*0.8);
        double ortalama2 = (course2.sozluNotu*0.20+course2.note*0.8);
        double ortalama3 = (course3.sozluNotu*0.20+course3.note*0.8);

        this.avarage = (ortalama1+ortalama2+ortalama3)/3.0;
        if (this.avarage >= 55){
            System.out.println("Sınıfı geçtiniz");
        }else {
            System.out.println("Sınıfı geçemediniz.");
        }
    }

    void printNote(){
        System.out.println(course1.name + " Notu: "+course1.note);
        System.out.println(course2.name + " Notu: "+course2.note);
        System.out.println(course3.name + " Notu: "+course3.note);
    }
}
