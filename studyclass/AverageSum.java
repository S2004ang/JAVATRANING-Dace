public class AverageSum {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
            double average=(double)sum/numbers.length;
            System.out.println("Sum of elements:" +sum);
            System.out.println("Average of elements:" +average);
        }
    }
    

