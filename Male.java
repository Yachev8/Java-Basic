package ExercisesOOP;

public class Male extends Human {

    public Male(String name, int age) {
        super(name, age);

    }

    @Override
    public void sleep() {
        System.out.println("The Male sleeps 6 hours per day");
    }

    @Override
    public void talk() {
        TheMaleTalkLess();
    }


private void TheMaleTalkLess(){
    System.out.println("The Male talking less than the female");
}





}
