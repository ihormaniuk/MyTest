import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);

    double Radius = scanner.nextDouble ();

    public Circle(){

    }

    public Circle(double Radius){
        this.Radius = Radius;
    }

    public double diameter(){
       return (Radius * 2);
    }

    public double area(){
       return  Math.PI * (Radius * Radius);
    }

    public double length(){
        return Math.PI * 2*Radius;
    }


}
