package OgrenciBilgiSistemi;

public class Course {

    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher; //Yarattığımız classları birer veri tipi olarak kullanabiliriz.

    int sozluNotu;



    Course(String name, String code, String prefix,Teacher theacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = theacher;
        this.note = 0;
        this.sozluNotu = 0;
    }

    void printTeacher(){
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){

            this.teacher = teacher;
        }else {
            System.out.println("Öğretmenin branşı ile ders branşı uyuşmadığı için öğretmen eklenemedi.");
        }
    }



}
