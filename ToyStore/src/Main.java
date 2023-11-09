import java.util.List;

public class Main {
    public static void main(String[] args) {
        ToyMarket market = new ToyMarket();
        market.addToy(new Toy("qwe", 10, 6));
        market.addToy(new Toy("rty", 3, 7));
        market.addToy(new Toy("aad", 6, 64));
        market.addToy(new Toy("zxc", 5, 7));
        market.addToy(new Toy("cvb", 8, 12));
        market.addToy(new Toy("fds", 1, 44));
        market.addToy(new Toy("hgf", 2, 9));
        System.out.println(market);
        Toy luckyToy = market.play();
        if (luckyToy==null){
            System.out.println("all toys wined");
        } else {
            System.out.println("you winn - "+luckyToy.getName());
            List luckyToys = market.getLuckyToys();
            luckyToys.add(luckyToy);
        }
    }
}