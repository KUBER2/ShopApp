package pl.jakubrola;

public class Cloth extends Product {

    private String size,material;

    public Cloth(int id,int productCount, String productName, String color, float price,float weight,String size, String material){
        super(id,productCount,productName,color,price,weight);
        this.material=material;
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
    @Override
    public String toString() {
        return super.toString() + "Cloth{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                '}';
    }


}
