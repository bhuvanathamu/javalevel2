import java.io.*;
class Overloading {

        int add(int a, int b) {
        return a + b;
    }

        int add(int a, int b, int c) {
        return a + b + c;
    }

        double add(double a, double b) {
        return a + b;
    }

        String add(String a, String b) {
        return a + b;
    }

        void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

        void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Overloading obj = new Overloading();

        System.out.println("Sum (int, int): " + obj.add(10, 20));
        System.out.println("Sum (int, int, int): " + obj.add(10, 20, 30));
        System.out.println("Sum (double, double): " + obj.add(5.5, 6.5));
        System.out.println("Concatenation (String, String): " + obj.add("Hello ", "World"));

        obj.display("Bhuvi", 19);
        obj.display(21, "sowmi");
    }
}
