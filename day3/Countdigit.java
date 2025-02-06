import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=5678,count=0;
        while(n!=0)
        {
           // int rem=n%10;
            count++;
            n=n/10;
        }
        System.out.println(count);

    }
    
    
}   

    
}
