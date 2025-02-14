package tamilnadu.chennai;
public class College {
    static String clgname="DACE";
    int fees=20000;

    public static void main(String[] args) {
        display();
        College clg=new College();
        clg.studying();
    }
    static void display()
    {
       System.out.println("welcome to college" +clgname);
    }
    void studying()
    {
       System.out.println("students are studying"); 
    }
    void recruit()
    {
        System.out.println("company is recruiting");
    }
    void write()
    {
        System.out.println("exams are conducting");
    }
    
}
