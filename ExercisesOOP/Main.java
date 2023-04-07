package ExercisesOOP;


public class Main {
    public static void main(String[] args) {
        Male male = new Male("Dobri" , 25);
        Female female = new Female("Mariq" , 22);
        male.talk();
        male.sleep();
        male.walk();
        female.talk();
        female.sleep();
        female.walk();

        int age = male.age;
        String name = male.name;
        System.out.println(male.name + " "+ male.age);
        System.out.println(female.name + " "+female.age);





    }

}
