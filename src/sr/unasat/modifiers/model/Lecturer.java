package sr.unasat.modifiers.model;

public class Lecturer extends Person{

    private String favoriteCourse;
    public Lecturer(String favoriteCourse) {
        this.favoriteCourse = favoriteCourse;
    }

    @Override
    void iLove() {
        System.out.println("My favorite subject to teach is " + favoriteCourse);
        countILoveAnswers++;
        System.out.println(countILoveAnswers);
    }

    public void iLoveMethode(){
        iLove();
    }

}
