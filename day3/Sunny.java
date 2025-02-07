public class Sunny{
        public static void main(String[] args) {
            int n=11;
            int div=2;
            boolean isprime = true;
            while(div <= n / 2){
                if(n % div == 0)
                   {
                    isprime = false;
                    break;
                   }
                   ++div;
            }
            if(isprime)
            {
                System.out.println("prime");
            }
            else{
                System.out.println("not a prime");
            }
            
        }
    }
    

