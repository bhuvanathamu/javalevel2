import java.io.*;
class Bike{
String brand;
int year;
Bike(String b, int y){
brand=b;
year=y;
}
void display(){
System.out.println("Brand:"+brand);
System.out.println("Year:"+year);
}
}
public class ConstructorDemo{
public static void main(String[] args)
{
Bike bike1=new Bike("KTM",2000);
Bike bike2=new Bike ("Royal Enfield",1955);
bike1.display();
bike2.display();
}
}