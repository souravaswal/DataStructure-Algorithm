# Calculate power of a number i.e. a to the power b

public class RecursionProgram 
{
    public static void main(String args[])
    {
        RecursionProgram obj = new RecursionProgram();
        System.out.println(obj.powerOf(3, 5));
    }

    private int powerOf(int a, int b) 
    {
        if(b==0)
        {
            return 1;
        }
        return a * powerOf(a, b-1);
    }
}