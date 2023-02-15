package model;

public class Incunabulum extends Item{
    private int year_publication;
    private int no_pages;

    public Incunabulum(int id, int start_price, String origin_country, int year_publication, int no_pages) {
        super(id, start_price, origin_country);
        this.year_publication = year_publication;
        this.no_pages = no_pages;
    }

    public int getYear_publication() {
        return year_publication;
    }

    public void setYear_publication(int year_publication) {
        this.year_publication = year_publication;
    }

    public int getNo_pages() {
        return no_pages;
    }

    public void setNo_pages(int no_pages) {
        this.no_pages = no_pages;
    }

    @Override
    public String toString() {
        return "Incunabulum{" +
                "year_publication=" + year_publication +
                ", no_pages=" + no_pages +
                ", id=" + id +
                ", start_price=" + start_price +
                ", origin_country='" + origin_country + '\'' +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println("Incunabulum: ID-"+id+ " start_price: "+ start_price+
                ", origin_country: "+origin_country+
                ", year: "+year_publication+", no_pages: "+no_pages);
    }
}
