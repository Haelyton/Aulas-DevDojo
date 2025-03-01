package J_Interface.Domain;

public class DataBaseLoader implements DataLoader, RemoveLoader {
    public DataBaseLoader() {
    }

    public void load() {
        System.out.println("teste");
    }

    public void remove() {
        System.out.println("removendo do banco");
    }
}