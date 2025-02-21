public class MainThread{
    public static void main(String[] args) {
        MainThread mt=new MainThread();
        System.out.println(mt.getState());
        //mt.run();
        mt.start();
        System.out.println(mt.getState());
        System.out.println(mt.getName());
        mt.setName("practice thread");
        System.out.println();
        for(int i=1;i<=5;i++){
            System.out.println("MainThread "+i);
        }
        System.out.println(mt.getState());

    }
    
}
class ChildThread extends Thread{
    //start()
    //run()
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
    
              System.out.println("ChildThread "+i);

        }
    }
}