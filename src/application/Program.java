package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Mouse", 54.90 ));
        list.add(new Product("Monitor", 234.93 ));
        list.add(new Product("Xbox", 1190.99 ));

        list.removeIf(Product::nonStaticProductPredicate);

        for ( Product p: list){
            System.out.println(p);
        }

    }
}
