import java.util.ArrayList;

public class Migrante {
    private Boolean sozinho;
    private String nome;
    private String num;
    private familia f;

    public Migrante(String nome, String num, String estado){
        if(estado.equals("sozinho")){
            this.sozinho = true;
        } else if(estado.equals("familia")){
             this.sozinho = false;
        } else{};
        this.nome = nome;
        this.num = num;
    }

    public void setF(familia f) {
        this.f = f;
    }

    public Regiao escolheReg(String reg){
        ArrayList<Regiao> list = Lista_regioes.getList();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNome().equals(reg)){
                return list.get(i);
            }       
        }
        return null;
    }

    public familia getF() {
        return f;
    }

   
    public String toString() {
        return "Migrante " + nome;        
    }

    

     

    


}
