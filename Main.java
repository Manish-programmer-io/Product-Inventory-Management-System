import java.util.List;

public class Main {
    public static void main(String[] args){
        Inventory inventory = new Inventory();
        Product product1 = new Product("1", "Laptop", "Electronics", 1000.0, 4.5, 15);
        Product product2 = new Product("2", "Smartphone", "Electronics", 500.0, 4.0, 20);
        Product product3 = new Product("3", "Headphones", "Accessories", 100.0, 4.8, 30);
        inventory.addProduct(product1, 10);
        inventory.addProduct(product2, 5);
        inventory.addProduct(product3, 20);
        inventory.displayInventoryDetails();
        System.out.println("Total Sales by category; " + inventory.getTotalSalesByCategory());
        System.out.println("Average Price by Category: " + inventory.getAveragePriceByCategory());
        System.out.println("Highest Rated Product by Category: " + inventory.getHighestRatedProductByCategory());
        System.out.println("Forecasted Inventory Needs: " + inventory.forecastInventoryNeeds(10));
    }
}
