import java.util.ArrayList;

public class MigranteHandler {
    

    public static Migrante IniciaRegistoS(String nome, String num){
        Migrante m = new Migrante(nome, num, "sozinho");
        m.setF(new familia(0));
        Catalogo_migrantes_cabeças.addMigrante(m);
        return m;
    }


    public static familia iniciaRegistoF(int n_pessoas){
        return new familia(n_pessoas);
    }

    public static Migrante indicaCabeça(familia f, String nome, String num){
        Migrante m = new Migrante(nome, num, "familia");
        m.setF(f);
        f.addCabeça(m);
        Catalogo_migrantes_cabeças.addMigrante(m);
        return m;
    }

    public static familia indicaMembro(familia f, String nome, String num){
        Migrante m = new Migrante(nome, num, "familia");
        m.setF(f);
        f.addMembro(m);
        return f;
    }


    public static Regiao escRegiao(String reg, Migrante m){
        return m.escolheReg(reg);
    }


    public static ArrayList<Ajuda> getAjudasReg(Migrante m,Regiao reg){
        ArrayList<Ajuda> list = new ArrayList<Ajuda>();
        ArrayList<Alojamento> list_alo = AlojamentosDisp.getList();
        for(int i = 0; i<list_alo.size();i++){
            if(list_alo.get(i).getReg().getNome().equals(reg.getNome()) && list_alo.get(i).getN_pessoas() > m.getF().getPessoas()){
                list.add(list_alo.get(i));
            }
        }
        for(int i = 0; i<ItemsDisp.getList().size();i++){
            list.add(ItemsDisp.getList().get(i));
        }
        return list;

    }

    public static void EscolheAjuda(Migrante m, Ajuda a){
        AjudasRealizadas.add(a, m);
        AlojamentosDisp.removeAlojamento(a);
        ItemsDisp.removeItem(a);
    }


    




}
