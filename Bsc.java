class BSc
{
    void java()
    {
        System.out.println("Java Programming");
    }
}

class AIML extends BSc
{
    void os()
    {
        System.out.println("Operating System");
    }
}

class BCA extends AIML
{
    void CWS()
    {
        System.out.println("Cloud Web Service");
    }
}

class Sample
{
    public static void main(String args[])
    {
        BSc a = new BSc();
        a.java();

        AIML b = new AIML();
        b.java();
        b.os();

        BCA c = new BCA();
        c.java();
        c.os();
        c.CWS();
    }
}