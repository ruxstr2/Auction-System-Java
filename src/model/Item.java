package model;

public abstract class Item {
    protected int id;
    protected int start_price;
    protected String origin_country;

    public Item(int id, int start_price, String origin_country){
        this.id = id;
        this.start_price = start_price;
        this.origin_country = origin_country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStart_price() {
        return start_price;
    }

    public void setStart_price(int start_price) {
        this.start_price = start_price;
    }

    public String getOrigin_country() {
        return origin_country;
    }

    public void setOrigin_country(String origin_country) {
        this.origin_country = origin_country;
    }

    public abstract void printInfo();
}
