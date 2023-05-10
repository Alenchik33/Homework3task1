public class BonusMilesService {

    public int calculate(int price) {

        if(price < 0) {
            price = 0;
        } else {
            price = price / 20;
        }

        return price;
    }
}