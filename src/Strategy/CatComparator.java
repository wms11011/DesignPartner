package Strategy;

/**
 * @author 王旻爽
 * 2020/10/20
 * @ClassName CatComparator.java
 */
public class CatComparator implements Comparator<Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.weight-o2.weight;
    }
}
