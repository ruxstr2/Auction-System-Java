package model;

public class Sculpture extends Item{
    private int weight;
    private String material;

    public Sculpture(int id, int start_price, String origin_country, int weight, String material) {
        super(id, start_price, origin_country);
        this.weight = weight;
        this.material = material;
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
        return "Sculpture{" +
                "id=" + id +
                ", start_price=" + start_price +
                ", origin_country='" + origin_country + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println("Sculpture: ID-"+id+ " start_price: "+ start_price+
                ", origin_country: "+origin_country+
                ", weight: "+weight+", material: "+material);
    }
}
