package service;


public class Main {
    public static void main(String[] args) {

        //PAINTINGS
        System.out.println("Show all paintings");
        System.out.println(PaintingService.getAllPaintings());
        System.out.println("Inserting painting...");
        PaintingService.insertPainting(1000,"Lithuania",20,25);
        System.out.println("Show all paintings");
        System.out.println(PaintingService.getAllPaintings());
        System.out.println("Deleting painting...");
        PaintingService.deletePainting(3);
        System.out.println("Show all paintings");
        System.out.println(PaintingService.getAllPaintings());

        //SCULPTURES
        SculptureService.createTableSculpture();
        System.out.println("Inserting data in sculpture...");
        SculptureService.insertSculpture(671,"Ireland",60,"lead");
        SculptureService.insertSculpture(3650,"Marocco",909,"mahogany");
        System.out.println("Show all sculptures:");
        System.out.println(SculptureService.getAllSculptures());
        System.out.println("Deleting sculpture...");
        SculptureService.deleteSculpture(1);
        System.out.println("Show all sculptures:");
        System.out.println(SculptureService.getAllSculptures());

        //INCUNABULUM
        IncunabulumService.createTableIncunabulum();
        System.out.println("Inserting data in incunabulum...");
        IncunabulumService.insertIncunabulum(7500,"Turkey",1485,2592);
        IncunabulumService.insertIncunabulum(4016,"Austria",1498,807);
        System.out.println("Show all incunabula:");
        System.out.println(IncunabulumService.getAllIncunabula());
        System.out.println("Updating incunabulum...");
        IncunabulumService.updateIncunabulum(1,8000);
        System.out.println("Show all incunabula:");
        System.out.println(IncunabulumService.getAllIncunabula());

        //PERSON
          PersonService.createTablePerson();
          System.out.println("Inserting data into person...");
          PersonService.insertPerson("Carr","Fyiodor","+90999","nothing@new");
          PersonService.insertPerson("Joster","Helena","4045","no@idea");
          PersonService.insertPerson("Gorst","Bremar","82103","fencing@instructor");
          System.out.println("Show all people:");
          System.out.println(PersonService.getAllPersons());
          System.out.println("Updating and deleting from person...");
          PersonService.updatePerson("Joster","sparkof@creativity");
          PersonService.deletePerson("Carr");
          System.out.println("Show all people:");
          System.out.println(PersonService.getAllPersons());




    }

}
