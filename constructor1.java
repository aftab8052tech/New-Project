

// class Employee1{
//     private String name;
//     private int id;

//     public void setdata( String s , int a){
//         name = s;
//         id = a;
//     }

//     public void getdata(){
//         System.out.println("The name of the Employee : "+name);
//         System.out.println("The Id of the Employee is "+id);
//     }
// }



// public class constructor1 {
//     public static void main(String[] args){
//         Employee1 aftab = new Employee1();
//         aftab.setdata("Aftab Alam", 1);
//         aftab.getdata();


//     }
    
// }


    class Employee1{
        private int id;
        private String name;
 
        public Employee1(){
            id=1;
            name="Aftab Alam";
        }
         
        public void getdata(){
            System.out.println("The name of the Employee is "+name);
            System.out.println("The id of the Employee is "+id);
        }
      
        public Employee1(int a , String s){
            id = a;
            name = s;
        }
        public void getdata1(){
            System.out.println("The name of the Employee is "+name);
            System.out.println("The id of the Employee is "+id);

        }

        public Employee1(String sc){
           
            name = sc;
        }
        public void setId(int a){
            id = a;
        }
        public int getId(){
            return id;
        }
        public void getdata2(){
            System.out.println("The name of the Employee is "+name);
        }


    }

    public class constructor1{
        public static void main(String[] arg){
    Employee1 aftab = new Employee1();
    aftab.getdata();
    Employee1 irshad = new Employee1(2,"Mohd Irshad");
    irshad.getdata1();
    Employee1 arbaz = new Employee1("Arbaz");
 
   // arbaz.setId=3;
    arbaz.getdata2();
    System.out.println("The id of the Employee is "+arbaz.getId());
    

    }
}