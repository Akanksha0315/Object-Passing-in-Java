//Write a program which combines two arrays into a single array including the duplicate elements and sort the combined array
import java.util.*;
class Combine
{
  int com[];
  int size;
  //declaring variables
  Combine(int nn) //constructor to initialize variables
  {
    size=nn;
    com = new int[size];
    //initializing variables
  }//end of constructor
  void inputArray() //to take input from user
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements");
    for(int i=0; i<size; i++)
    {
      com[i]=sc.nextInt();
    }//end of for loop
    //taking inpput from user
  }
  void sort() //to sort the combined array
  {
    for(int i=0; i<size; i++)
    {
      int min=i;
      for(int j=i+1; j<size; j++)
      {
        if(com[min]>com[j])
        {
          min=j;
        }
      }
      int t=com[min];
      com[min]=com[i];
      com[i]=t; //swapping values
    }
  }//end of sort() method
  void mix(Combine A, Combine B)
  {
    //Combine ob3 = new Combine(A.size+B.size);
    for(int i=0; i<A.size; i++)
    {
      com[i]=A.com[i];
    }//end of for loop
    for(int i=0, j=A.size; i<B.size; i++, j++)
    {
      com[j]=B.com[i];
    }//end of for loop
    //ob3.sort();
    //ob3.display();
  }//end of mix() method
  void display()
  {
    System.out.println("Array:");
    for(int i=0; i<size; i++)
    {
      System.out.println(com[i]);
    }//end of for loop
    //to display required information
  }//end of display() method
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of first array");
    int L1=sc.nextInt();
    Combine ob1 = new Combine(L1);
    ob1.inputArray();
    System.out.println("Enter length of second array");
    int L2=sc.nextInt();
    //taking input from user 
    Combine ob2 = new Combine(L2);
    //declararing object 
    ob2.inputArray();
    Combine ob3 = new Combine(L1+L2);
    ob3.mix(ob1, ob2);
    ob3.sort();
    ob3.display();
    //object passing
  }//end of main() method
}//end of clsss
/**VDT
Variable  Datatype        Description
  com[]     int         to store inputs 
  size      int      to store sze of array
  min       int       temporary variable
  t         int   temporary variable for swap
  i         int   control variable to run loop
  j         int   control variable to run loop  */