package sr.unasat.modifiers.model;

public class Student extends Person{

    private String favoriteCourse;
    public Student(String favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }

    @Override
    public void iLove() {
        introduce("Sandjana");
        System.out.println("My favorite course is " + favoriteCourse);
        countILoveAnswers++;
        System.out.println(countILoveAnswers);
    }

    public void iLoveMethode() {
        iLove();
    }


}
