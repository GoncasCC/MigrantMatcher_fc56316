public class Alojamento extends Ajuda {
    private int n_pessoas;
    private Regiao reg;
    

    public Alojamento(int id){
       super(id);
    }

    public int getN_pessoas() {
        return n_pessoas;
    }

    public void setN_pessoas(int n_pessoas) {
        this.n_pessoas = n_pessoas;
    }

    public void setReg(Regiao reg) {
        this.reg = reg;
    }

    public Regiao getReg() {
        return reg;
    }

    public String toString(){
        return "Voluntário: " + getVol().getTelemovel() + " oferece alojamento para " + n_pessoas + " pessoas. Regiao: " + reg.getNome() + " id:" + getId();
        }
    
    

   
    
}
