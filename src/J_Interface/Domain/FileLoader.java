package J_Interface.Domain;

public class FileLoader implements DataLoader, RemoveLoader {
    public FileLoader() {
    }

    public void load() {
        System.out.println("arquivo");
    }

    public void remove() {
        System.out.println("remove arquivo");
    }
}
