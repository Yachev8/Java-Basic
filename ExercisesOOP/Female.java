package ExercisesOOP;

public class Female extends Human{

    public Female( String name, int age) {
        super(name, age);
    }

    @Override
    public void sleep() {
        System.out.println("The Female sleeps 7 hours per day");
    }

    @Override
    public void talk(){
       System.out.println("The Female talking more than the male");
   }
}
