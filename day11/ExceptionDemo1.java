import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        divide();
    }
    public static void divide()
    {
        Scanner sc=new Scanner(System.in);
        //exception possible areas
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result=a/b;

            int arr[]=new int[result];
            for(int i=0;i<10;i++)
            {
                System.out.println(arr[i]);
            }
        }
        catch(ClassNotFoundException ce)
        {
            System.out.println("class not found");
        }
        catch(NegativeArrayException na)
        {
            System.out.println()
        }
        
    }
    
}
