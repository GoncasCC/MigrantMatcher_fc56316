
import java.util.ArrayList;

public class familia {
    private int pessoas;
    private Migrante cabeça;
    private ArrayList<Migrante> list = new ArrayList<Migrante>();


    public familia(int pessoas){
        this.pessoas = pessoas;
    }

    public void addCabeça(Migrante m){
        cabeça = m;
    }

    public void addMembro(Migrante M){
        list.add(M);
    }

    public int getPessoas() {
        return pessoas;
    }

}

