class Pen{
    String type;
    String colour;
    public void write(){
        System.out.println("write something");
    }
    public void colour(){
        System.out.println(this.colour);
    }
}

class Student{
    String name;
    int age;
    String nationality;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.nationality);
        
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // Pen pen2 = new Pen();
        // pen1.type = "gel";
        // pen1.colour = "black";
        // pen2.type = "ballpoint";
        // pen2.colour = "blue";

        // pen1.write();
        // pen1.colour();
        // pen2.colour();

        Student s1 = new Student();
        s1.name = "Imran";
        s1.age = 24;
        s1.nationality ="Indian";

        s1.printInfo();
    }
}

