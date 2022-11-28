package service;
import bean.TaxeTmb;

import java.util.ArrayList;
import java.util.List;

public class TaxetmbService {

    public int save(TaxeTmb taxetmb, List<TaxeTmb> taxeTmbs) {
        TaxeTmb taxeTmb = findByTerrainRefAndAnnee(taxetmb.getTerrainRef(), taxetmb.getAnnee(),taxeTmbs);
        if (taxeTmb != null) {
            return -1;
        } else {
            taxeTmb.setMontantBase(taxetmb.getTerrainSurface()* taxeTmb.getTauxTaxTmb());
            taxeTmbs.add(taxetmb);
            return 1;
        }
    }


    public TaxeTmb findByTerrainRefAndAnnee(String terrainRef , int annee,List<TaxeTmb> taxeTmbs) {
        for (TaxeTmb taxetmb : taxeTmbs) {
            if (taxetmb.getTerrainRef().equals(terrainRef) && taxetmb.getAnnee() == annee) {
                   return taxetmb;
            }
        }
        return null;
    }
    public List<TaxeTmb> findByRedevableCin(String redevableCin,List<TaxeTmb> taxeTmbs)
    {
        List<TaxeTmb> results = new ArrayList<TaxeTmb>();
        for (TaxeTmb taxetmb : taxeTmbs) {
            if (taxetmb.getRedevableCin().equals(redevableCin)) {
                results.add(taxetmb);
            }
        }
        return results;
    }
    public List<TaxeTmb> findByAnnee(int annee,List<TaxeTmb> taxeTmbs)
    {
        List<TaxeTmb> results = new ArrayList<TaxeTmb>();
        for (TaxeTmb taxetmb : taxeTmbs) {
            if (taxetmb.getAnnee()==annee) {
                results.add(taxetmb);
            }
        }
        return results;
    }

    public double taxeTmbSummontantBase(int anneeMin, int anneeMax, List<TaxeTmb> taxeTmbs) {
        double nvmontantBase =0;
        for (TaxeTmb taxetmb : taxeTmbs) {
            if(taxetmb.getAnnee()>=anneeMin && taxetmb.getAnnee()<=anneeMax) {

                nvmontantBase += taxetmb.getMontantBase();
            }
        }
        return nvmontantBase;
    }
}
