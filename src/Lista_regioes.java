import java.util.ArrayList;


public class Lista_regioes {
    private static ArrayList<Regiao> list = new ArrayList<Regiao>();

    public static void addRegiao(String nome){
        list.add(new Regiao(nome));
    }

    public static ArrayList<Regiao> getList() {
        return list;
    }
}
