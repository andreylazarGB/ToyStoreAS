import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ToyMarket market = new ToyMarket();
        market.addToy(new Toy("qwe", 10, 1));
        market.addToy(new Toy("rty", 3, 7));
        market.addToy(new Toy("aad", 6, 64));
        market.addToy(new Toy("zxc", 5, 7));
        market.addToy(new Toy("cvb", 8, 12));
        market.addToy(new Toy("fds", 1, 44));
        market.addToy(new Toy("hgf", 2, 9));
//        System.out.println(market);
        for (int i = 0; i < 10; i++) {
            Toy luckyToy = market.play();
//            market.editToyWeight(random.nextInt(6), random.nextInt(100));
            if (luckyToy==null){
                System.out.println("all toys wined");
            } else {
                System.out.println("you winn - "+luckyToy.getName());
                List luckyToys = market.getLuckyToys();
                luckyToys.add(luckyToy);
            }
        }
    }
}