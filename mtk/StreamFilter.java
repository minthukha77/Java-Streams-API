package mtk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        
        List<ProductB> list = new ArrayList<ProductB>();

        // Without using streams API
        for(ProductB product : getProducts()){
            if(product.getPrice() > 30000f){
                list.add(product);
                System.out.println(product);

            }
        }


        System.out.println("***********************************");

        //using streams API
        List<ProductB> list2 = getProducts()
                .stream().filter((products) -> products.getPrice() > 28000f)
                .collect(Collectors.toList());

        list2.forEach(System.out::println);
       

    }

    private static List<ProductB> getProducts() {

        List<ProductB> productsList = new ArrayList<ProductB>();
        // Adding Products
        productsList.add(new ProductB(1, "HP Laptop", 25000f));
        productsList.add(new ProductB(2, "Dell Laptop", 30000f));
        productsList.add(new ProductB(3, "Lenevo Laptop", 28000f));
        productsList.add(new ProductB(4, "Sony Laptop", 28000f));
        productsList.add(new ProductB(5, "Apple Laptop", 90000f));

        return productsList;
    }
    
}


class ProductB{
    private int id;
    private String name;
    private float price;

    public ProductB(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public ProductB(String string, String string2) {
        //TODO Auto-generated constructor stub
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    

    

}
