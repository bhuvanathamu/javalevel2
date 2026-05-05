class Bsc
{
void java(){

System.out.println("java programming");
}
void os()
{
System.out.println("Operating System");
}
}
class BCA extends Bsc
{
void CWS()
{
System.out.println("Cloud Web Service");
}
}
class sample 
{
public static void main(String args[]) 
{
Bsc a=new Bsc();
a.java();
a.os();
BCA b=new BCA();
b.java();
b.os();
b.CWS();
}
}