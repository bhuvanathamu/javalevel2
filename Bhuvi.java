import java.io.*;

class Bhuvi
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    void fact() throws Exception
    {
        System.out.println("Factorial");
        System.out.println("Enter the Number");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }

        System.out.println("Fact: " + f);
    }

    void sum() throws Exception
    {
        System.out.println("Sum of N numbers");
        System.out.println("Enter the Number");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int s = 0;
        for(int i = 1; i <= n; i++)
        {
            s = s + i;
        }

        System.out.println("Sum: " + s);
    }
}

class BCA
{
    public static void main(String args[]) throws Exception
    {
        Bhuvi b = new Bhuvi();

        b.fact();
        b.sum();
        b.fact();
        b.sum();
    }
}

