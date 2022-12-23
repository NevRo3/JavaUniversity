package hwThreads.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Первая задача");
        NewThread t1 = new NewThread();
        t1.start();
    }
}
