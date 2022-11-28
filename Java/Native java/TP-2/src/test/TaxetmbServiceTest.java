package test;

import bean.TaxeTmb;
import service.TaxetmbService;

import java.util.ArrayList;
import java.util.List;

public class TaxetmbServiceTest {
    private static List<TaxeTmb> taxeTmbs = new ArrayList<>();
    private static TaxetmbService taxetmbService=new TaxetmbService();
    public void init(){
        for(int i=0;i<=10;i++){
            taxeTmbs.add(new TaxeTmb(1,2020,
                    "e"+i,"ref"+i,i*2,i*3,0));
        }
    }

    public static int save(TaxeTmb taxetmb, List<TaxeTmb> taxeTmbs) {
        return taxetmbService.save(taxetmb, taxeTmbs);
    }

    public static TaxeTmb findByTerrainRefAndAnnee(String terrainRef, int annee, List<TaxeTmb> taxeTmbs) {
        return taxetmbService.findByTerrainRefAndAnnee(terrainRef, annee, taxeTmbs);
    }

    public static void main(String[] args) {
        TaxetmbServiceTest taxetmbServiceTest=new TaxetmbServiceTest();
        taxetmbServiceTest.init();
        TaxeTmb test= taxetmbServiceTest.findByTerrainRefAndAnnee("e1",2020,taxeTmbs);
        System.out.println("taxeTmb = " + test);
    }


}
