package tamilnadu.kerala;
import tamilnadu.chennai.Office1;

public class BranchOffice2 extends Office1{
    BranchOffice2()
    {
        System.out.println("welcome to BranchOffice2");
    }
    public static void main(String[] args){
        BranchOffice2 bff2=new BranchOffice2();
        bff2.promoted();
        bff2.salary();
    }
    void promoted()
    {
        System.out.println("got promotion");
    }
}
    

