package model;

public class Bid {
    private Person bidder;
    private float sum;
    private Item item;

    public Bid(Person bidder, float sum, Item item){
        this.bidder = bidder;
        this.sum = sum;
        this.item = item;
    }

    public void info(){
        System.out.println("\nBid:\n");
        System.out.println(bidder);
        System.out.println("has offered " + sum +" for:");
        item.printInfo();
    }
}
