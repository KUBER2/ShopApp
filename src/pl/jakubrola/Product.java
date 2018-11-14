package pl.jakubrola;

public class Product {

    private int id,productCount;
    private String productName,color;
    private float price,weight;

    public Product(int id,int productCount, String productName, String color, float price,float weight){
        this.id=id;
        this.productCount=productCount;
        this.productName=productName;
        this.color=color;
        this.price=price;
        this.weight=weight;
    }


    public void setId(int id){
        this.id=id;
    }

    public void setClor(String clor) {
        this.color = clor;
    }

    public void setProductCount(int productCount){
        this.productCount=productCount;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public String getClor() {
        return color;
    }

    public int getProductCount() {
        return productCount;
    }

    public String getProductName() {
        return productName;
    }
}
