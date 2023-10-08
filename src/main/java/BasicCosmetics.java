public class BasicCosmetics {

    private String name;
    private int price;
    private String effect;

    BasicCosmetics(String name, int price, String effect) {
        this.name = name;
        this.price = price;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //getterとsetterは省略


}



