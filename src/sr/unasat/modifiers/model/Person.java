package sr.unasat.modifiers.model;

abstract class Person{
    String name;
    String dateOfBirth;
    public static int countILoveAnswers = 0;
    public void introduce(String name){
        System.out.println("Hi, my name is " + name);
    }

    abstract void iLove();

}
