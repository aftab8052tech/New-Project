
        /*
         1. Create a class employee with following properties and method.
         */


class Employee{
    int salary;
    String name;

    public void setSalary(int a){
        salary = a;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}

        /*
       2.  Create a class Cellphone with method to print "ringing ..." "vibrating..." etc
         */
    class Cellphone{
        public void printdata(){
            System.out.println("The is Ringing ...");
            System.out.println("The Phone is Vibrating ...");
        }
    }

    /*  3. Create a class square with a method to initialize its side, calculating area, perimeter etc. */
    class Square{
        int side = 10;
        public void printdata_squ(){
            System.out.println("The Area of the square are : "+(side*side));
            System.out.println("The Perimeter of the square are : "+(4*side));
        }
    }

    /*  4.   Create a class rectangle with a method to initialize its side , calculating area, perimeter etc. */
    class Rectangle{
        int l = 10;
        int b = 5;
        public void printdata_rec(){
            System.out.println("The Area of the rectangle are : "+(l*b));
            System.out.println("The Perimeter of the rectangle are : "+ 2*(l*b));
        }
    }
 /* 5.  Create a class circle with a method to initialize its side, calculating area , perimeter etc. */
    class Circle{
      int r = 6;
      int h = 7;

      public void printdata_cir(){
        System.out.println("The Area of the circle are : "+3.14*r*r);
        System.out.println("The Perimeter of the circle are : "+2*r*h);
      }
    }
    /*Create a class TommyVecetti for tockstar games capable of hitting (print hitting ... ) , running , firing */

   
   

public class Exercise {
    public static void main(String[] args){

      
        Employee aftab = new Employee();
        aftab.name="Aftab Alam";
        aftab.salary=1000;
        System.out.println("The name of the Employee is "+aftab.name);
        System.out.println("The Salary of your Employee are "+aftab.salary);

       
        System.out.println("\n");

        Cellphone samsung=new Cellphone();
        samsung.printdata();
        System.out.println("\n");

        Square s = new Square();
        s.printdata_squ();
        System.out.println("\n");

        Rectangle r = new Rectangle();
        r.printdata_rec();
        System.out.println("\n");

        Circle c = new Circle();
        c.printdata_cir();


    }
    
}
