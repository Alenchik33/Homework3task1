public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

//        int price = 10_000;
//        int miles = service.calculate(price);
//        System.out.println(miles);

        int Price = service.calculate(-300_000);
        System.out.println(Price);


    }
}