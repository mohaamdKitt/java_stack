import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();

        System.out.println("enter your age");
        int age=sc.nextInt();
        String temp=sc.nextLine();

        System.out.println("enter your city");
        String city=sc.nextLine();

        System.out.println("enter your pin");
        int pin=sc.nextInt();
        String any=sc.nextLine();
        
        System.out.println("enter your town");
        String town=sc.nextLine();

        System.out.print("my name is:"+name +"\n my age is"+ age +"\n my city:"+ city + "\n my pin"+ pin +"\n my town"+town );

    
    }
}