public class Audi extends Car{
    private final int year;
    public Audi(String color, int maxSpeed, int currentSpeed, String box, int price, int year) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.year = year;
    }
    @Override
    public  String getName(){
        return "Audi";
    }
    public int getYear(){
        return this.year;
    }
}
