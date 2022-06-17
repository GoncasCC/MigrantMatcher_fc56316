import java.util.ArrayList;

public class ItemsDisp {
    private static ArrayList<Item> list = new ArrayList<Item>();

    public static void addItem(Item a){
     list.add(a);
    }

    public static void removeItem(Ajuda a){
        for(int i = 0; i<list.size();i++){
            if(a.getId() == list.get(i).getId()){
                list.remove(i);
            }
        }
   }


    public static ArrayList<Item> getList() {
        return list;
    }
 
    
    
}
