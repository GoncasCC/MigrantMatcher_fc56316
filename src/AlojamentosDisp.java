import java.util.ArrayList;

public class AlojamentosDisp {
   private static ArrayList<Alojamento> list = new ArrayList<Alojamento>();

   public static void addALojamento(Alojamento a){
    list.add(a);
   }

   public static ArrayList<Alojamento> getList() {
       return list;
   }

   public static void removeAlojamento(Ajuda a){
        for(int i = 0; i<list.size();i++){
            if(a.getId() == list.get(i).getId()){
                list.remove(i);
            }
        }
   }


   public String toString() {
       return list.toString(); 
   }
}
