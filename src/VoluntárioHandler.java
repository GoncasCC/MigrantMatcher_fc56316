import java.util.ArrayList;

public class VoluntárioHandler {
   
   
    public static Voluntário registaVoluntário(String telemovel){
        return Catálogo_voluntrários.addVoluntário(telemovel);
    }

    public static Ajuda identificaAjuda(String ajuda, int id){
        if(ajuda.equals("alojamento")){
            return new Alojamento(id);
        } else if (ajuda.equals("item")){
            return new Item(id);
        } else return null;
    }

    public static Ajuda setVolAj(Ajuda aj, Voluntário vol){
        aj.setVol(vol);
        vol.addAjuda(aj);
        return aj;
    }

    public static Alojamento indicaPessoas(Alojamento a, int n_pessoas){
        a.setN_pessoas(n_pessoas);
        return a;
    }

    public static Alojamento indicaRegiao(Alojamento a, String regiao){
        ArrayList<Regiao> list = Lista_regioes.getList();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNome().equals(regiao)){
                a.setReg(list.get(i));
                break;
            }
        }
        AlojamentosDisp.addALojamento(a);
        return a;
    }

    public static Item indicaDescrição(Item it, String desc){
        it.setDescricao(desc);
        ItemsDisp.addItem(it);
        return it;
    }
}
