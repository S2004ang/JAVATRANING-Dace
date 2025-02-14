package tamilnadu.chennai;
import tamilnadu.chennai.Office1;

public class BranchOffic extends Office1{
     public BranchOffic()
    {
        System.out.println("welcome to BranchOffice ");
    }
    public static void main(String[] args){
        BranchOffic bff=new BranchOffic();
        bff.celebrate_local_function();
        bff.work();
    }
    void celebrate_local_function()
    {
        System.out.println("happy to celebrate");
    }
   
    void hike()
    {
         System.out.println("got hike");
    }
        
}
    
