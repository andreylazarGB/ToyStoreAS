import java.io.Serializable;

public class Toy implements Serializable {
    private int id;
    private String name;
    private int countToys;
    private int weight;


    public Toy(String name, int countToys, int weight) {
        id = -1 ;
        this.name = name;
        this.countToys = countToys;
        this.weight = weight;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public void setCountToys(int countToys) {
        this.countToys = countToys;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCountToys() {
        return countToys;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countToys=" + countToys +
                ", weight=" + weight +
                '}' + "\n";
    }
}
