public class ClassDemo{
    static{
    System.out.println("hello world from ststic block");
}
{
    System.out.println("hello world from non-static block-1");
}
{
    System.out.println("hello world from non-static block-2");
}
public static void main(String[] args)
{
    ClassDemo d=new ClassDemo();
    ClassDemo d1=new ClassDemo();
}
}

    