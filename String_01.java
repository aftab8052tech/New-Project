

import java.util.Scanner;

public class String_01 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Hello ! Mr. "+name);
        int value = name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String ustring=name.toUpperCase();
        System.out.println(ustring);
        String nonTrimmedString="       Aftab Alam";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,2));
        System.out.println(name.replace('t','r'));
        System.out.println(name.replace("af", "cd"));
        System.out.println(name.startsWith("af"));
        System.out.println(name.endsWith("ri"));
        System.out.println(name.equals("aftab alam mansoori"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("ta"));
        System.out.println(name.equalsIgnoreCase("aftab alam mansoori"));

        System.out.println("I am a Escape sequence \" Double quotes");
        System.out.println("I am a Escape sequence \\ Double quotes");
        System.out.println("I am a Escape sequence \'' Double quotes");

        String aftab="I am Genius";
       // System.out.println(aftab.replace(" ", "_"));
        aftab=aftab.replace(" ", "_");
       System.out.println(aftab);

       String letter=" Dear <|name|> , Thanks a lot";
       letter =letter.replace("name", "Aftab Alam");
       System.out.println(letter);

       String mystring="This content  double or triple spaces";
       System.out.println(mystring.indexOf("__"));
       System.out.println(mystring.indexOf("___"));


       String a="Dear Aftab \n\tAlam This Course is going awesome.\n Thanks a lot !";
       System.out.println(a);
       




        sc.close();
    }
    
}
