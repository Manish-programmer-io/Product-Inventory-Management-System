import java.util.*;

public class Inventory {
    private List<Product> products;
    private Set<String> categories;
    private Map<String, Integer> stock;

    public Inventory(){
        products = new ArrayList<>();
        categories = new HashSet<>();
        stock = new HashMap<>();
    }

    public void addProduct(Product product, int quantity){
        products.add(product);
        categories.add(product.getCategory());
        stock.put(product.getId(), quantity);
    }
    public void removeProduct(String productID){
        products.removeIf(product -> product.getId().equals(productID));
        stock.remove(productID);
    }
    public void updateStock(String productID, int quantity){
        if (stock.containsKey(productID)){
            stock.put(productID,quantity);
        }
    }

    public List<Product> filterProducts(double minPrice, double maxPrice, double minRating, boolean inStock) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products){
            boolean matchesPrice = product.getPrice() >= minPrice && product.getPrice()<=maxPrice;
            boolean matchesRating = product.getRating() >= minRating;
            boolean matchesStock = !inStock || (stock.containsKey(product.getId()) && stock.get(product.getId()) > 0);

            if (matchesPrice && matchesRating && matchesStock){
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public void adjustPriceBasedOnSales(double percentage, int salesThresholds){
        for (Product product : products){
            if (product.getSales() > salesThresholds){
                double newPrice = product.getPrice() * (1 + percentage / 100);
                product.setPrice(newPrice);
            }
        }
    }

    public Map<String, Integer>
    getTotalSalesByCategory(){
        Map<String, Integer> totalSales = new HashMap<>();
        for (Product product : products){
            totalSales.put(product.getCategory(), totalSales.getOrDefault(product.getCategory(),0) + product.getSales());
        }
        return totalSales;
    }

    public Map<String, Double>
    getAveragePriceByCategory(){
        Map<String, Double> totalPrice = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        for (Product product : products) {
            totalPrice.put(product.getCategory(), totalPrice.getOrDefault(product.getCategory(), 0.0) + product.getPrice());
            count.put(product.getCategory(), count.getOrDefault(product.getCategory(),0 ) + 1 );
        }
        Map<String, Double> averagePrice = new HashMap<>();
        for (String category : totalPrice.keySet()){
            averagePrice.put(category, totalPrice.get(category) / count.get(category));
        }
        return averagePrice;
    }

    public Map<String, Product>
    getHighestRatedProductByCategory(){
        Map<String, Product> highestRated = new HashMap<>();
        for (Product product : products){
            if (!highestRated.containsKey(product.getCategory()) || product.getRating() > highestRated.get(product.getCategory()).getRating()){
                highestRated.put(product.getCategory(), product);
            }
        }
        return highestRated;
    }

    public Map<String, Integer>
    forecastInventoryNeeds(double growthRate){
        Map<String, Integer> forecast = new HashMap<>();
        for (Product product : products){
            int currentStock = stock.getOrDefault(product.getId(), 0);
            int futureDemand = (int) (product.getSales() * (1 + growthRate / 100));
            forecast.put(product.getId(), futureDemand - currentStock);
        }
        return forecast;
    }

    public void displayInventoryDetails(){
        for (Product product : products){
            System.out.println("ID: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Rating: " + product.getRating());
            System.out.println("Sales: " + product.getSales());
            System.out.println("Stock: " + stock.getOrDefault(product.getId(), 0));
            System.out.println("--------------------------------------------------------------");
        }
    }
}
