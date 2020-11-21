package sr.unasat.modifiers.app;

import sr.unasat.modifiers.model.Lecturer;
import sr.unasat.modifiers.model.Student;

public class Application{
    public static void main(String[] args) {

        Student student = new Student("Java");
        student.iLoveMethode();

        Lecturer lecturer = new Lecturer("Java");
        lecturer.iLoveMethode();
    }
}
