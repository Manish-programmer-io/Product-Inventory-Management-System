public class Product {
    private String id;
    private String name;
    private String category;
    private double price;
    private double rating;
    private int sales;

    public Product(String id, String name, String category, double price, double rating, int sales){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
        this.rating=rating;
        this.sales=sales;
    }

    //Getter and setter for each attributes
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double rating){
        this.rating=rating;
    }
    public int getSales(){
        return sales;
    }
    public void setSales(int sales){
        this.sales=sales;
    }
}

