import java.util.ArrayList;

public class Catálogo_voluntrários {
    private static ArrayList<Voluntário> list = new ArrayList<Voluntário>();


    public static Voluntário addVoluntário(String telemovel){
        Voluntário v = new Voluntário(telemovel);
        list.add(v);
        return v;
    }

    public static ArrayList<Voluntário> getList() {
        return list;
    }
}
