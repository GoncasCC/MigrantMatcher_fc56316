public class Item extends Ajuda {
    private String descricao;
   

public Item(int id){
   super(id);

}

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString(){
        return "Voluntário: " + getVol().getTelemovel() + " oferece um item! Descrição: " + descricao + " id:" + getId();
        }
    
   
    
}
