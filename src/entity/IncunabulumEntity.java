package entity;

public class IncunabulumEntity {
    private int id;
    private int start_price;
    private String origin_country;
    private int year;
    private int no_pages;

    public IncunabulumEntity(int id, int start_price, String origin_country, int year, int no_pages) {
        this.id = id;
        this.start_price = start_price;
        this.origin_country = origin_country;
        this.year = year;
        this.no_pages = no_pages;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNo_pages() {
        return no_pages;
    }

    public void setNo_pages(int no_pages) {
        this.no_pages = no_pages;
    }

    @Override
    public String toString() {
        return "IncunabulumEntity{" +
                "id=" + id +
                ", start_price=" + start_price +
                ", origin_country='" + origin_country + '\'' +
                ", year=" + year +
                ", no_pages=" + no_pages +
                '}';
    }
}
