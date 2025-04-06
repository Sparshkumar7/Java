class student{
    int marks = 60;
}
public class oops {
    String name= "Rohan";
    int age;

    static void mymethod(){
        System.out.println("Hello world");
    }

    public void method1(){
        System.out.println("How are you!");
    }

    public static void main(String[] args){
        student mark = new student();

        oops obj = new oops();// create a object
        obj.name="mohit";
        obj.age=15; //udpate the name



        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(mark.marks);
        mymethod();
        obj.method1();
    }
}
