import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println("Your are eligible to vote");
        }
        else{

            System.out.println("Your not eligible to vote");
        }

    }
    
}
