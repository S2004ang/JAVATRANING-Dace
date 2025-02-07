public class Pavani {
    public static void main(String[] args) {
        int n=28,sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n)
               System.out.println(n+" is a perfect no");
            else
            System.out.println(n+" is not a perfect no");

                }
    }


