import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ToyMarket market = new ToyMarket();

        market.addToy(new Toy("qwe", 2, 67));
        market.addToy(new Toy("rty", 3, 70));
        market.addToy(new Toy("aad", 6, 64));
        market.addToy(new Toy("zxc", 5, 7));
        market.addToy(new Toy("cvb", 8, 88));
        market.addToy(new Toy("fds", 1, 21));
        market.addToy(new Toy("hgf", 2, 9));

        for (int i = 0; i < 30; i++) {
            Toy luckyToy = market.play();
            if (luckyToy==null){
                System.out.println("no more toys");
            } else {
                System.out.println("you winn - "+luckyToy.getName());
                List luckyToys = market.getLuckyToys();
                luckyToys.add(luckyToy);
            }
        }
    }
}