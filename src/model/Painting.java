package model;

import java.util.Objects;

public class Painting extends Item{
    private int width;
    private int height;

    public Painting(int id, int start_price, String origin_country, int width, int height){
        super(id, start_price, origin_country);
        this.width = width;
        this.height = height;
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
    public void printInfo() {
        System.out.println("Painting: ID-"+id+ " start_price: "+ start_price+
                ", origin_country: "+origin_country+
                ", width: "+width+", height: "+height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Painting pai = (Painting) o;
        return id == pai.id &&start_price == pai.start_price && width == pai.width
                && height == pai.height && Objects.equals(origin_country, pai.origin_country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, start_price, origin_country, width, height);
    }

    @Override
    public String toString() {
        return "Painting{" +
                "id=" + id +
                ", start_price=" + start_price +
                ", origin_country='" + origin_country + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
