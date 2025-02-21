import java.util.Scanner;
public class Hw {
    public static void main(String[] args) {
        System.out.println("Enter the name");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter the option");
        Scanner s=new Scanner(System.in);
        int option=sc.nextInt();

        for(int i=0;i<=0;i++){
            if(option==1){
                System.out.println(n-(n-1)+(n-2)-(n-3)+(n-4)-1);
            }
            else if(option==2){
                System.out.println(n+(n-1)-(n-2)+(n-3)-(n-4)+1);
            }
        }
    }
    
}
