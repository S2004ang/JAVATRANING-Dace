public class Factors_60 {
    public static void main(String[] args) {
        Scanner s c= new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            {
                System.out.println(i+" ");
            }
        }
    }
    
}
