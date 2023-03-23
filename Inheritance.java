class base{
        int a;
        void set_a(int a ){
            this.a=a;
        }
        int get_a(){
            return a;
        }
        void display(){
            System.out.println("The value of a : "+a);
        }

};
class derived extends base{
    int b;
    void set_b(int b){
        this.b=b;

    }
    int set_b(){
        return b;
    }
    void display(){
        System.out.println("The value of b : "+b);
    }
};

public class Inheritance {
    public static void main(String[] args){
        base b1 = new base();
        b1.set_a(40);
        b1.display();
        derived d = new derived();
        d.set_b(50);
        d.display();


    }
    
}
