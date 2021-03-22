package ro.info.uaic;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main app = new Main();
        /*app.testCreateSave();
        app.testLoadView();
        app.testDataException();*/
        boolean quit = true;
        while(quit)
        {
            quit = app.shell();
        }
    }

    private void testDataException(){
        var movie = new Movie("1", "film", "idk");
        try{
            movie.setRating(15);
        }catch (InvalidDataException exception){
            System.out.println(exception);
        }
    }

    private void testCreateSave() {
        Catalog catalog =
                new Catalog("JUMP", "d:/cataloage/catalog.ser");

        var movie = new Movie("1", "film", "d:/cataloage/catalog.ser");
        var book = new Book("2", "carte", "d:/cataloage/catalog.ser");
        catalog.addEntry(movie);
        catalog.addEntry(book);

        try{
            CatalogUtil.save(catalog);
        }
        catch (IOException exception){
            System.err.println("Eroare la Input/Output " + exception);
        }
    }

    private void testLoadView() {
        try{
            Catalog catalog = CatalogUtil.load("d:/cataloage/catalog.ser");
            CatalogUtil.view(catalog.findById("1"));
        }
        catch (IOException exception){
            System.err.println("Eroare la Input/Output " + exception);
        }
        catch (InvalidCatalogException exception){
            System.err.println("Catalog invalid " + exception);
        }
        catch (ClassNotFoundException exception){
            System.err.println("Clasa invalida " + exception);
        }
    }

    private boolean shell(){

        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        switch (string){
            case "add":
                System.out.println("add");
                break;
            case "list":
                System.out.println("list");
                break;
            case "play":
                System.out.println("play");
                break;
            case "save":
                System.out.println("save");
                break;
            case "load":
                System.out.println("load");
                break;
            case "quit":
                System.out.println("quit");
                return false;
            default:
                System.out.println("Invalid command.");
                System.out.println("The commands are: add, list, play, save and load.");
        }
        return true;




    }

}
