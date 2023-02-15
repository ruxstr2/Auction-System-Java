package entity;

public class SculptureEntity {
    private int id;
    private int start_price;
    private String origin_country;
    private int weight;
    private String material;

    public SculptureEntity(int id, int start_price, String origin_country, int weight, String material) {
        this.id = id;
        this.start_price = start_price;
        this.origin_country = origin_country;
        this.weight = weight;
        this.material = material;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "SculptureEntity{" +
                "id=" + id +
                ", start_price=" + start_price +
                ", origin_country='" + origin_country + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}
