import java.util.*;
class Angle
{
    int deg;
    int min;
    Angle()
    {
        deg=0;
        min=0;
    }
    void inputAngle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of degrees");
        deg=sc.nextInt();
        System.out.println("Enter number of minutes");
        min=sc.nextInt();
    }
    void dispAngle()
    {
        System.out.println("Angle: " + deg + " degrees and " + min + " minutes");
    }
    Angle sumAngle(Angle A, Angle B)
    {
        this.deg = A.deg + B.deg;
        this.min = A.min + B.min;
        if(this.min>=60)
        {
            this.min=this.min-60;
            this.deg++;
        }
        return this;
    }
    public static void main(String args[])
    {
        Angle X = new Angle();
        Angle Y = new Angle();
        X.inputAngle();
        Y.inputAngle();
        X.dispAngle();
        Y.dispAngle();
        Angle S = new Angle();
        S=S.sumAngle(X,Y);
        S.dispAngle();
    }
}