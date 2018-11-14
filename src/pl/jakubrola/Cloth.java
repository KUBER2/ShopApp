package pl.jakubrola;

public class Cloth {

    private String size,material;

    public Cloth(String size, String material){
        super();
        this.material=material;
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public String getSize() {
        return size;
    }
}
