public class Operator {
    public static void main(String[] args){
        float a=50.0f;
        float b=10.0f;
        float c=4.0f;
        float x=2.0f;
        float y=7.0f;
        float d=9.0f;
        float u=12.0f;
        float v=15.0f;

        float m=(x-y)/2.0f;
        float n=(b*b-4*a*c)/2.0f*a;
        float o=(v*v-u*u);
        float p=a*b-d;
        float  q=++c * --x;
        float r=x++ * c++;

        System.out.println("The value of Expression is (x-y)/2 \n" +m);
        System.out.println("The value of Expression is (b*b-4*a*c)/2*a \n" +n);
        System.out.println("The value of Expression is (v*v-u*u) \n" +o);
        System.out.println("The value of Expression is a*b-d \n" +p);
        System.out.println(q);
        System.out.println(r);

        char s ='b';
        s++;
        System.out.println(s);

        float t=7.0f/5.0f*9.0f/2.0f;
        System.out.println(t);

        char grade='c';
        grade=(char)(grade+10);
        System.out.println(grade);

        grade=(char)(grade-10);
        System.out.println(grade);

        int w=72;
        System.out.println(w<10);


    }
    
}
