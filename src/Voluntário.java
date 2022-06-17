import java.util.ArrayList;

public class Voluntário {
        private String telemovel;
        private ArrayList<Ajuda> ajudas = new ArrayList<Ajuda>();

        public Voluntário(String tele){
            telemovel = tele;
        }

        public String getTelemovel() {
            return telemovel;
        }

        public ArrayList<Ajuda> getAjudas() {
            return ajudas;
        }

        public void addAjuda(Ajuda a){
            ajudas.add(a);
        }
}
