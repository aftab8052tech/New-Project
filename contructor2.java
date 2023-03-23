class Cylinder{
   int radius , height;
   int length , breadth ;
    // void set_rad(int a){
    //     radius=a;
    // }
    // int get_rad(){
    //     return radius;
    // }
    // void set_hei(int b){
    //     height = b;

    // }
    // int get_hei(){
    //     return height;
    // }
    // void SurfaceArea_cylinder(){
    //     System.out.println("The Surface Area of Cylinder are "+2*3.14*radius*height + 12*3.14*radius*radius );
    // }
    Cylinder(int r, int h){
        radius = r;
        height = h;
    }
    void display(){
        System.out.println("The radius of the Cylinder "+radius);
        System.out.println("The height of the Cylinder "+height);
        System.out.println("The Surface Area of Cylinder are "+2*3.14*radius*height + 12*3.14*radius*radius );
        System.out.println("The Volume of the Cylinder are "+ 3.14*radius*radius*height );
    }




 }





public class contructor2 {
    public static void main(String[] arg){
        /* 1. Create a class cylinder and use getter and setters to set its radius and height  */
        Cylinder c = new Cylinder(5,6);
        // c.set_rad(10);
        // c.set_hei(10);
        // System.out.println(c.get_rad());
        // System.out.println(c.get_hei());

        /* 2. use 1 to calculate surface area and volume of the cylinder */
        // c.SurfaceArea_cylinder();

          /* 3. Use a constructor and repeat 1 */
          c.display();

          /* 4. overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.*/

    }
    
}
