package ExercisesOOP;

public abstract class Human {
    String name;
    int age;
    public Human(String name, int age){
        this.name=name;
        this.age=age;

    }
   public abstract void sleep();
   public void walk(){
       System.out.println("Male and Female walking 30min");
   }
   public void talk(){
       System.out.println("Male and Female talking a lot");
   }



}
