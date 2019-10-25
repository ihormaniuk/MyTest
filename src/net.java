 import java.util.Scanner;
    public class net {
        static Scanner sc = new Scanner(System.in);
        public static void main(String args[])
        {
            System.out.print("Введите радиус: ");
      /* Мы сохраняем введенный радиус в double
         потому что пользователь может ввести радиус дробным числом
       */
            double radius = sc.nextDouble();
            //Площадь круга вычисляется по формуле = PI*radius*radius
            double area = Math.PI * (radius * radius);
            System.out.println("Площадь круга равна: " + area);
            //Длины окружности вычисляется по формуле = 2*PI*radius
            double circumference= Math.PI * 2*radius;
            System.out.println("Длины окружности равна: " + circumference) ;
        }
    }
