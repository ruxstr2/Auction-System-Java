package entity;

public class PaintingEntity {
    private int id;
    private int start_price;
    private String origin_country;
    private int width;
    private int height;

    public PaintingEntity(int id, int start_price, String origin_country, int width, int height) {
        this.id = id;
        this.start_price = start_price;
        this.origin_country = origin_country;
        this.width = width;
        this.height = height;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "PaintingEntity{" +
                "id=" + id +
                ", start_price=" + start_price +
                ", origin_country='" + origin_country + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
