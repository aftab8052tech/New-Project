class base{
    base(){
        System.out.println("I am a Base class contructor ");
    }
    base(int x){
      
        System.out.println("The value of a "+x);
    }
};

class derived extends base{
    
    derived(){
        System.out.println("I am a Derived class constructor ");
    }
    derived(int x , int y){
        super(15);
        System.out.println("The value of a is "+x+" and the value of y is "+y);
    }
    
};
class aftab extends derived{
    aftab(){
        System.out.println("This is one more derived class ");
    
    }
    aftab(int x, int y, int z)
    {
        super(x, y);
        System.out.println("The value of c is "+x);
        System.out.println("The value of d is "+y);
        System.out.println("The value of e is "+z);
    }

};




public class Contructor_Inheritance {
    public static void main(String[] args){
       // base b1 = new base();

       // derived d1 = new derived(45,78);

        aftab af= new aftab();

    }
    
}
