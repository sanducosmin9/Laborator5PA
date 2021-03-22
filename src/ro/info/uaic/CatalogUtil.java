package ro.info.uaic;

import java.awt.*;
import java.io.*;
import java.net.URI;

public class CatalogUtil {

    public static void save(Catalog catalog)
            throws IOException {
        try (var outputStream = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            outputStream.writeObject(catalog);
        }
    }

    public static Catalog load(String path)
            throws InvalidCatalogException, IOException, ClassNotFoundException {
        try (var inputStream = new ObjectInputStream(
                new FileInputStream(path))) {
            return (Catalog) inputStream.readObject();
        }
    }

    public static void view(CatalogEntry item)
            throws IOException {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(item.getLocation()));
        } finally {

        }
    }


}
