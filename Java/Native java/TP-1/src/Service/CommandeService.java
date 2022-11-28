package Service;

import bean.Commande;

import java.util.ArrayList;
import java.util.List;

public class CommandeService {
   public Commande findByReference(String reference, List<Commande> commandes)
   {
       System.out.println(reference);

       for (Commande commande : commandes) {
           System.out.println(commande);

           if(commande.getRef().equals(reference))
           {

               return commande;
           }
       }
       return null;
   }
   public int save(String reference, double qteTotalProduitCommande,List<Commande> commandes)
   {
        Commande check=findByReference(reference,commandes);
        if(check!=null)
        {
            return -1;
        }
        else {
            Commande myCommande = new Commande();
            myCommande.setQteTotalProduitReception(0);
            commandes.add(myCommande);
            return 1;
        }

   }
   public int receptionner(String referenceCommande, double qte,List<Commande> commandes)
   {
       Commande check=findByReference(referenceCommande,commandes);
       if(check==null)
       {
           return -1;
       }

       else if(check.getQteTotalProduitReception()+qte>check.getQteTotalProduitCommande())
       {
           return -2;
       }
       else{
           check.setQteTotalProduitCommande(qte+ check.getQteTotalProduitReception());
           return 1;
       }

   }
   public List<Commande> findReceptionnerPartielement(List<Commande> commandes)
   {
      List<Commande> results=new ArrayList<>();
       for (Commande commande : commandes) {
           if(commande.getQteTotalProduitReception()>0 && commande.getQteTotalProduitReception()<commande.getQteTotalProduitCommande())
           {
               results.add(commande);
           }
       }
       return results;
   }

   public int delete(String referenceCommande ,List<Commande> commandes)
   {
       Commande check=findByReference(referenceCommande,commandes);
       if(check==null)
       {
           return -1;
       }
       else if (check.getQteTotalProduitReception()!=0)
       {
           return -2;
       }
       else {
           commandes.remove(check);
           return 1;
       }
   }
   public List<Commande> findByQteTotalProduitCommandeGreaterThan(List<Commande> commandes,double qteTotalProduitCommande)
   {
       List<Commande> results=new ArrayList<>();
       for (Commande commande : commandes) {
           if(commande.getQteTotalProduitCommande()>qteTotalProduitCommande)
           {
               results.add(commande);
           }
       }
       return results;
   }
}
