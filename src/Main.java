public class Main {
    public static void main(String[] args) {
        Lista_regioes.addRegiao("Evora");
        Lista_regioes.addRegiao("Lisboa");
        Lista_regioes.addRegiao("Porto");
        Lista_regioes.addRegiao("Sines");
        Lista_regioes.addRegiao("Braga");
        
        
        MigrantMatcherV mmv = new MigrantMatcherV();
        MigrantMatcherM mmm = new MigrantMatcherM();
        
        
        Voluntário manel = mmv.newVol("927554595");
        Voluntário diana = mmv.newVol("967065931");
        Voluntário martim = mmv.newVol("937654928");
        
        
        Ajuda aj_manel = mmv.getHelp(manel, "alojamento");
        Ajuda aj2_manel = mmv.getHelp(manel, "alojamento");
        Ajuda aj_diana = mmv.getHelp(diana, "item");
        Ajuda aj_martim = mmv.getHelp(martim, "alojamento");
        
        
        Alojamento al_manel = mmv.regiao((mmv.pessoas((Alojamento) aj_manel, 16)), "Lisboa");
        Alojamento al2_manel = mmv.regiao((mmv.pessoas((Alojamento) aj2_manel, 3)), "Braga");
        Item it_diana = mmv.item((Item) aj_diana, "Impressora 3d");
        Alojamento al_martim =mmv.regiao((mmv.pessoas((Alojamento) aj_martim, 10)), "Braga");

        System.out.println(AlojamentosDisp.getList().toString());
        System.out.println(ItemsDisp.getList().toString());

        

        Migrante luis = mmm.registoSozinho("luis", "987654321");
        familia ferreira = mmm.registoFamilia(4);
        Migrante ana = mmm.getCabeça(ferreira, "ana", "925302864");
        mmm.getMembro(ferreira, "teresa", "974637293");
        mmm.getMembro(ferreira, "carolina", "9427818317");
        mmm.getMembro(ferreira, "Otavio", "9731636381");

        Regiao reg1 = mmm.getRegiao("Lisboa", luis );
        Regiao reg2 = mmm.getRegiao("Braga", ana);

        mmm.confirmaAjuda(luis,(mmm.getAjudasDisp(luis, reg1)).get(0));
        mmm.confirmaAjuda(ana,(mmm.getAjudasDisp(ana, reg2)).get(0));


        System.out.println(AjudasRealizadas.getMapa().toString());
        System.out.println(AlojamentosDisp.getList().toString());
        System.out.println(ItemsDisp.getList().toString());







        


    }
}
