package tamilnadu.chennai;

public class Office {
    final int salariy = 45000;

    public Office() {
        System.out.println("welcome to office");
    }

    public static void main(String[] args) {
        Office off = new Office();
        off.work();

    }

    public void work() {
        System.out.println("working in office");
    }

    void recurit() {
        System.out.println("recruitment");
    }

    private void wfm() {
        System.out.println("working in home");
    }

    private void write() {
        System.out.println("salary");
    }

}
