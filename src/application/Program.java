package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Mouse", 54.90 ));
        list.add(new Product("Monitor", 234.93 ));
        list.add(new Product("Xbox", 1190.99 ));
        list.add(new Product("Keyboard", 90.99 ));

        Double min = 100.0;

        list.removeIf(p -> p.getPrice() >= min);

        for ( Product p: list){
            System.out.println(p);
        }

    }
}
