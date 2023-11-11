import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyMarket implements Serializable {
    private int toyId;
    private List<Toy> toys = new ArrayList<>();
    private List<Toy> luckyToys = new ArrayList<>();
    private Random random = new Random();
    private String filename = "toys.json";


    public void addToy(Toy toy) {
        if (!toys.contains(toy)) {
            toys.add(toy);
            toy.setId(toyId++);
        }
        saveToys();
    }

    public void editToyWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                saveToys();
                break;
            }
        }
    }

    public Toy play() {
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        double randomWeight = random.nextDouble() * totalWeight;
        double weightSum = 0;
        for (Toy toy : toys) {
            weightSum += toy.getWeight();
            if (randomWeight <= weightSum) {
                luckyToys.add(toy);
                toy.setCountToys(toy.getCountToys() - 1);
                if (toy.getCountToys() == 0) {
                    toys.remove(toy);
                }
                saveToys();
                return toy;
            }
        }
        return null;
    }

    public List getLuckyToys() {
        return luckyToys;
    }

    private void saveToys() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(toys);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ToyMarket{" +
                "toys=" + toys +
                ", luckyToys=" + luckyToys +
                '}';
    }
}
