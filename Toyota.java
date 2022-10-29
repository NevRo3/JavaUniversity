public class Toyota extends Car{
    private final int luggage;
    public Toyota(String color, int maxSpeed, int currentSpeed, String box, int price,int luggage) {
        super(color, box, maxSpeed, currentSpeed, price);
        this.luggage = luggage;
    }
    @Override
    public  String getName(){
        return "Toyota";
    }
    public int getLuggage(){
        return this.luggage;
    }
}
