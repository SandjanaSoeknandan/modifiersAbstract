package sr.unasat.modifiers.app;

import sr.unasat.modifiers.model.Lecturer;
import sr.unasat.modifiers.model.Person;
import sr.unasat.modifiers.model.Student;

public class Application{
    public static void main(String[] args) {

        Person studentPerson = new Student("Java");
        studentPerson.iLove();

        Person lecturerPerson = new Lecturer("Java");
        lecturerPerson.iLove();
    }
}
