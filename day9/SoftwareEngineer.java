public class SoftwareEngineer extends Parent1 implements TrafficRules,EmployeeRules {
    

   public static void main(String[] args) {
      // SoftwareEngineer se=new SoftwareEngineer();
      // TrafficRules se = new SoftwareEngineer();
      SoftwareEngineer se = new SoftwareEngineer();
      // dynamic binding
      
      // se.cooking();
      // se.go_slow();
      // se.fine();
      se.wear_Id();
      // TrafficRules tf=new TrafficRules();//error
   }
   public void wear_formals() {
      System.out.println("i am in formal");
   }
   public void work_12_hours() {
      System.out.println("i'll worl 12 hours");
   }
   public void wear_Id() {
      System.out.println("i wearing id");
   }
   public void go_slow()
   {
       System.err.println("go_slow");
   }
   
   public void wear_helmet() {
      System.out.println("wear helmet");
   }
   public void fine() {
      System.out.println("the fone amount is " );
   }
   @Override
   public void work_12_houres() {
      System.out.println("i work 12 hours");
      
   }
   @Override
   public void wear_helment() {
      System.out.println("i ware helmet");
      
   }
}