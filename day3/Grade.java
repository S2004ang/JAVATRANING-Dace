import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Grade:");
        int a=sc.nextInt();       
        if(a >= 90 && a<100){
            System.out.println("Your Grade is A");
        }
        else if(a >= 80 && a < 90){
            System.out.println("Your Grade is B");
        }
        else if(a >= 70 && a < 80){
            System.out.println("Your Grade is C");
        }
        else if(a >= 60 && a < 70){
            System.out.println("Your Grade is D");

        }
        else{
            System.out.println("You have falied");
        }

        
    }
}

