import java.util.ArrayList;

public class MigrantMatcherM {
    public MigrantMatcherM(){

    }

    public Migrante registoSozinho(String nome, String num){
       return  MigranteHandler.IniciaRegistoS(nome, num);
    }

    public familia registoFamilia(int n_pessoas){
        return MigranteHandler.iniciaRegistoF(n_pessoas);
    }

    public Migrante getCabeça(familia f, String nome, String num){
        return MigranteHandler.indicaCabeça(f, nome, num);
    }

    public familia getMembro(familia f, String nome, String num){
        return MigranteHandler.indicaMembro(f, nome, num);
    }

    public Regiao getRegiao(String reg, Migrante m){
        return MigranteHandler.escRegiao(reg, m);
    }

    public ArrayList<Ajuda> getAjudasDisp(Migrante m, Regiao reg){
        return MigranteHandler.getAjudasReg(m, reg);
    }

    public void confirmaAjuda(Migrante m, Ajuda A){
        MigranteHandler.EscolheAjuda(m, A);
    }


    
}
