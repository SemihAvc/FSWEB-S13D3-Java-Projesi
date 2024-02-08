public class Person {
    String firstname;
    String Lastname;
    int age;
    double salary;
    String[] hobbies;
    boolean isMerried;
git


    public Person( String firstname,String Lastname,int age){
    this.firstname= firstname;
    this.Lastname= Lastname;
    this.age= age;
}
public Person( String firstname,String Lastname,int age, double salary, boolean isMerried, String[] hobbies){
    this(firstname,Lastname,age);
    if(salary<11500){
        this.salary = 11500;
    }else {
        this.salary =salary;
    }
    this.isMerried = isMerried;
    this.hobbies = hobbies;
}
public  String getFirstname(){
        return  this.firstname;
}
    public  String getLastname(){
        return  this.Lastname;
    }public  int getAge(){
        return  this.age;
    }
    public boolean isTeen(){
        if(age>13 && age<19){
            return true;}
        else{return  false;}
        }
    }
