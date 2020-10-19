package Strategy;

/**
 * @author 王旻爽
 * 2020/10/19
 * @ClassName Cat.java
 */
public class Cat implements Comparable<Cat> {

    int weight;
    int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return this.weight-o.weight;
    }
}
