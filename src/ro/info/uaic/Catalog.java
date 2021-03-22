package ro.info.uaic;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {

    @Serial
    private static final long serialVersionUID = 6529685098267757690L;

    private String name;
    private String path;
    private List<CatalogEntry> items = new ArrayList<>();

    public Catalog() {
    }

    public Catalog(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void addEntry(CatalogEntry item){
        items.add(item);
    }

    public CatalogEntry findById(String id){

        return items.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);

        /*for(CatalogEntry item : items)
            if(item.getId().equals(id))
                return item;

        return null;    */
    }

    public void listEntries(){
        items.stream().forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", items=" + items +
                '}';
    }
}
