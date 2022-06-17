import java.util.HashMap;

public class AjudasRealizadas {
    private static HashMap<Ajuda, Migrante> mapa = new HashMap<Ajuda, Migrante>();

    public static void add(Ajuda a, Migrante m){
        mapa.put(a, m);
    }

    public static HashMap<Ajuda, Migrante> getMapa() {
        return mapa;
    }

}
