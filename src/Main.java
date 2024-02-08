import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Person person1 = new Person("semih", "avci", 28);
//        Person person2 = new Person("ali", "veli", 49);
////
////        System.out.println(person1.getFirstname());
////        System.out.println(person2.getFirstname());
////        System.out.println(person2.getAge());
//
//        String[] hobbies = {"piano", "guitar"};
//        Person person3 = new Person("muhammed", "avci", 28, 27000, false, new String[]{"guitar","piano"});
//        System.out.println(person3.getFirstname());

        Wall wall = new Wall(12,23);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println("area"+ wall.getArea());
       wall.setWidth(-4);
    }
}
