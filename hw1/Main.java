package hw1;

public class Main {
    public static void main(String[] args) {
        // 1) Выведите на экран текст Hello World
        System.out.println("Hello World");

        // 2) Создайте переменную, присвойте ей целочисленное значение. Выведите значение на экран
        int num = 777;
        System.out.println(num);

        // 3) Создайте переменную, увеличьте её на единицу несколькими способами и выведите значение на экран.
        int a = 0;
        a = a + 1;
        a += 1;
        a++;
        System.out.println(a);

        // 4) Даны две переменные. Поменяйте значения переменных друг с другом двумя способами
        int b = 4;
        int c = 5;
        System.out.println(b + ", " + c);
        int d = b;
        b = c;
        c = d;
        System.out.println(b + ", " + c);
        b += c;
        c = b - c;
        b -= c;
        System.out.println(b + ", " + c);

        // 5) Дано два числа a и b. Найдите гипотенузу треугольника с заданными катетами.
        int e = 3;
        int f = 4;
        System.out.println(Math.sqrt(e * e + f * f));

        // 6) Дано натуральное число. Выведите его последнюю цифру.
        int g = 66666;
        System.out.println(g % 10);

        // 7) Дано неотрицательное целое число. Найдите число десятков в его десятичной записи.
        int h = 55575;
        System.out.println((h % 100 - h % 10) / 10);

        // 8) Дано двузначное число. Найдите число десятков в нем.
        int i = 88;
        System.out.println(i / 10);

        // 9) Реализуйте метод, который получает целое число на вход и возвращает разницу между данным числом и 21.
        // Выведите значение на экран с различными целыми числами.
        System.out.println(j(30));

        // 10) Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее арифметическое
        System.out.println(k(5, 15));

        // 11) Реализуйте метод, в который передается две целочисленные переменные и возвращает их среднее геометрическое
        System.out.println(l(5, 20));

        // 12) Реализуйте метод, в который передается 4 числа с плавающей точкой.
        // Первые два числа – координаты x, y первой точки.
        // Вторые два числа – координаты x,y второй точки. Найти расстояние между двумя точками
        System.out.println(m(1, 1, 4, 5));
    }
    public static int j(int j) {return j - 21;}
    public static int k(int k1, int k2){
        return (k1 + k2) / 2;
    }
    public static double l(int l1, int l2){
        return Math.sqrt(l1 * l2);
    }
    public static double m(double m1, double m2, double m3, double m4) {
        double m5 = m1 - m3;
        double m6 = m2 - m4;
        return Math.sqrt(m5 * m5 + m6 * m6);
    }
}
