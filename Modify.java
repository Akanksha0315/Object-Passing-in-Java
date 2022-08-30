//Write a program to take string input from user and change the word according to the given criteria(+2)
import java.util.*; //importing util package 
class Modify //start of class 
{
    String str;
    int len;
    //declaring variables 
    void read() //constructor to take input 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string in Uppercase");
        str=sc.nextLine(); //taking input from user 
        str=str.toUpperCase(); //converting to uppercase 
    }//end of constructor 
    void putin(int x, char c)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.insert(x,c);
        System.out.println("Changed string: " + sb);
    }//end of putin() method
    void takeOut(int x)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.delete(x,x+1);
        System.out.println("Changed string: " + sb);
    }//end of takeOut() method
    void change()
    {
        StringBuffer sb = new StringBuffer(str);
        len = str.length(); //calculating length of String
        for(int i=0; i<len; i++)
        {
            char c1=str.charAt(i);
            if(c1!=' ')
            {
                int n=(int)c1;
                n=n+2;
                if(n>90)
                {
                    n=64+(n-90);
                }//end of if statement
                char c2=(char)n;
                sb.setCharAt(i,c2);
            }//end of if statement
        }//end of for loop
        System.out.println("Changed string: " + sb);
    }//end of change() method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Modify ob = new Modify();
        //declaring object 
        ob.read();
        System.out.println("Enter a character to insert");
        char C = sc.next().charAt(0);
        System.out.println("Enter the index at which you want it inserted");
        int I = sc.nextInt();
        ob.putin(I,C);
        System.out.println("Enter index of character you want deleted");
        int D = sc.nextInt();  //taking input from user 
        ob.takeOut(D);
        ob.change();  //object passing
    }//end of main
}//end of class 
/**VDT
Variable   Datatype            Description
  str       String      to take input from user
  len        int    to caluculate length of String
  x          int          temporary variable
  c          char         temporary variable
  i          int      control variable to run loop
  n          int      variable to store ASCII value
  c1         char         temporary vatiable
  C          char       to take input from user
  I          int        to take input from user
  D          int        to take input from user   */