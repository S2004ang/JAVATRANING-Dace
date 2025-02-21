public class MainThread1 {
    public static void main(String[] args) {
        ChildThread ct1=new ChildThread();
        ct1.start();
        System.out.println(ct1.getState());
        System.out.println(ct1.getName());

        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println("Mainthread"+i);  
            

        }
        //ct1.join();
        
    }
    
}
class ChildThread1 extends Thread{
    @Override
    public void run(){
        //Thread yield();
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(millis:1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println("interrupted my sleep");
            }
        }
    }
}
