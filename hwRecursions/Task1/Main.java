package hwRecursions.Task1;

public class Main {
    public static String recursion_1(int num) {
        if (num == 1) {
            return "1";
        }else{
            return recursion_1(num-1) + " " + num;
        }
    }
    public static void main(String[] args) {
        System.out.println("Первая задача");
        System.out.println(recursion_1(10));
    }
}