package bean;

public class Commande {
    private Long id;
    private  double qteTotalProduitCommande;
    private  String ref;

    public String getRef() {
        return ref;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", qteTotalProduitCommande=" + qteTotalProduitCommande +
                ", ref='" + ref + '\'' +
                ", qteTotalProduitReception=" + qteTotalProduitReception +
                '}';
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    private double qteTotalProduitReception;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Commande(Long id, double qteTotalProduitCommande, String ref, double qteTotalProduitReception) {
        this.id = id;
        this.qteTotalProduitCommande = qteTotalProduitCommande;
        this.ref = ref;
        this.qteTotalProduitReception = qteTotalProduitReception;
    }

    public double getQteTotalProduitCommande() {
        return qteTotalProduitCommande;
    }

    public void setQteTotalProduitCommande(double qteTotalProduitCommande) {
        this.qteTotalProduitCommande = qteTotalProduitCommande;
    }

    public double getQteTotalProduitReception() {
        return qteTotalProduitReception;
    }

    public Commande() {
    }

    public void setQteTotalProduitReception(double qteTotalProduitReception) {
        if(qteTotalProduitReception<=this.qteTotalProduitCommande)
        {
            this.qteTotalProduitReception = qteTotalProduitReception;
        }
    }
}
