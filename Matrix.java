//Write a program to find the difference b/w two matrix
import java.util.*; //importing util package 
class Matrix //start of class
{
    int arr[][];
    int m,n;
    //declaring variables
    Matrix(int mm, int nn) //constructor to initialize variables
    {
        m=mm;
        n=nn;
        arr = new int[m][n];
        //initializing variables
    }//end of constructor
    void fillarray() //to take input from user 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements");
        for(int i = 0; i < m; i++)
        {
           for(int j = 0; j < n; j++)
           {
              arr[i][j] = sc.nextInt();
           }//end of for loop
        }//end of for loop
    }//end of fillarray() method
    public Matrix SubMatrix(Matrix A) //to calculate difference
    {
        Matrix B = new Matrix(m,n);
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                B.arr[i][j] = this.arr[i][j] - A.arr[i][j];
            }//end of for loop
        }//end of for loop
        return B; //returning value
    }
    void display() //to display required information
    {
        System.out.println("Matrix:");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + " ");
            }//end of for loop
            System.out.println();
        }//end of for loop
    }//end of display() method
    public static void main(String args[]) //start of main method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();
        //taking input from user
        if(r <= 25 && c <= 25) //condition for program
        {
           Matrix P = new Matrix(r,c);
           Matrix Q = new Matrix(r,c);
           Matrix R = new Matrix(r,c);
           //declaring objects 
           P.fillarray();
           Q.fillarray();
           R = P.SubMatrix(Q);
           P.display();
           Q.display();
           R.display();
           //object passing 
        }
        else
        {
           System.out.println("Invalid size");
        }//end of if-else statement
    } //end of main() method
}//end of class
/**VDT
Variable Datatype          Description
arr[][]    int      to take inputs from user
 m         int     to store the number of rows
 n         int    to store the number of columns 
 i         int     control variable to run loop
 j         int     control variable to run loop
 r         int     to store the number of rows
 c         int    to store the number of columns  */
