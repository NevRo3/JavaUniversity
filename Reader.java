import java.util.Arrays;
public class Reader {
    String name;
    double library;
    String department;
    String birthday;
    double phone;
    public Reader(String name, double library, String department, String birthday, double phone) {
        this.name = name;
        this.library = library;
        this.department = department;
        this.birthday = birthday;
        this.phone = phone;
    }
    public static void takeBook(String name, int booksAmount) {
        System.out.println(name + " взял " + booksAmount + " книги");
    }
    public static void takeBook(String name, String[] booksNames) {
        System.out.println(name + " взял книги: " + Arrays.toString(booksNames));
    }
    public static void takeBook(String name, Book[] books) {
        String[] bookNameList = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            bookNameList[i] = books[i].name;
        }
        System.out.println(name + " взял: " + Arrays.toString(bookNameList));
    }
    public static void returnBook(String fio, int booksnumber) {
        System.out.println(fio + " вернул " + booksnumber + " книги");
    }
    public static void returnBook(String fio, String[] booksNames) {
        System.out.println(fio + " вернул книги: " + Arrays.toString(booksNames));
    }
    public static void returnBook(String fio, Book[] books) {
        String[] bookNameList = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            bookNameList[i] = books[i].name;
        }
        System.out.println(fio + " вернул: " + Arrays.toString(bookNameList));
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Reader.takeBook("Шабанов М.В.", 3);
        Reader.takeBook("Шабанов М.В.", new String[]
                {"библиотека профессионала java кей хорстманн", "полное руководство java герберт шилдт"});
        Reader.takeBook("Шабанов Максим Владимирович", new Book[]
                { new Book("библиотека профессионала java кей хорстманн"),
                        new Book("полное руководство java герберт шилдт")});
        Reader.returnBook("Шабанов М.В.", 3);
        Reader.returnBook("Шабанов М.В.", new String[]{"полное руководство java герберт шилдт"});
        Reader.returnBook("Шабанов Максим Владимирович", new Book[]
                { new Book("библиотека профессионала java кей хорстманн"),
                        new Book("полное руководство java герберт шилдт")});
    }
}

