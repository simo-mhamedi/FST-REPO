package bean;

public class TaxeTmb {
    private long id;
    private int annee;
    private String redevableCin;
    private String terrainRef;
    private double terrainSurface;
    private double tauxTaxTmb;
    private double montantBase;

    public TaxeTmb() {
    }

    public TaxeTmb(long id, int annee, String redevableCin, String terrainRef, double terrainSurface, double tauxTaxTmb, double montantBase) {
        this.id = id;
        this.annee = annee;
        this.redevableCin = redevableCin;
        this.terrainRef = terrainRef;
        this.terrainSurface = terrainSurface;
        this.tauxTaxTmb = tauxTaxTmb;
        this.montantBase = montantBase;
    }

    public long getId() {
        return id;
    }

    public int getAnnee() {
        return annee;
    }

    public String getRedevableCin() {
        return redevableCin;
    }

    public String getTerrainRef() {
        return terrainRef;
    }

    public double getTerrainSurface() {
        return terrainSurface;
    }

    public double getTauxTaxTmb() {
        return tauxTaxTmb;
    }

    public double getMontantBase() {
        return montantBase;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setRedevableCin(String redevableCin) {
        this.redevableCin = redevableCin;
    }

    public void setTerrainRef(String terrainRef) {
        this.terrainRef = terrainRef;
    }

    public void setTerrainSurface(double terrainSurface) {
        this.terrainSurface = terrainSurface;
    }

    public void setTauxTaxTmb(double tauxTaxTmb) {
        this.tauxTaxTmb = tauxTaxTmb;
    }

    public void setMontantBase(double montantBase) {
        this.montantBase = montantBase;
    }

    @Override
    public String toString() {
        return "TaxeTmb{" +
                "id=" + id +
                ", annee=" + annee +
                ", redevableCin='" + redevableCin + '\'' +
                ", terrainRef='" + terrainRef + '\'' +
                ", terrainSurface=" + terrainSurface +
                ", tauxTaxTmb=" + tauxTaxTmb +
                ", montantBase=" + montantBase +
                '}';
    }
}


