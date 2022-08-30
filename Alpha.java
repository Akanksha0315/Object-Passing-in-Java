import java.util.*;
class Alpha
{
    String str;
    Scanner sc = new Scanner(System.in);
    Alpha()
    {
        str="";
    }
    void readWord()
    {
        System.out.println("Enter word");
        str=sc.next();
    }
    void arrange()
    {
        for(int i=0; i<str.length(); i++)
        {
            StringBuffer sb = new StringBuffer(str);
            int min=i;
            for(int j=i+1; j<str.length(); j++)
            {
                char c1=str.charAt(min);
                char c2=str.charAt(j);
                if(c1>c2)
                {
                    min=j;
                }
            }
            char C1=str.charAt(i);
            char C2=str.charAt(min);
            sb.setCharAt(i,C2);
            sb.setCharAt(min,C1);
            str=sb.toString();
        }
    }
    void display()
    {
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Alpha ob = new Alpha();
        ob.readWord();
        ob.arrange();
        ob.display();
    }
}        