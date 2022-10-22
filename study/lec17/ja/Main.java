package study.lec17.ja;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

    }

    private List<Fruit> filterFruits(List<Fruit> fruits, Predicate<Fruit> fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.test(fruit)) {
                results.add(fruit);
            }
        }

        return results;
    }
}

