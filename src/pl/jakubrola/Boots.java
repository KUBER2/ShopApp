package pl.jakubrola;

public class Boots {

    private int size;
    private boolean isNatural;

    public void setNatural(boolean natural) {
        isNatural = natural;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isNatural() {
        return isNatural;
    }

    public int getSize() {
        return size;
    }
}
