package Test;

import Service.CommandeService;
import bean.Commande;

import java.util.ArrayList;
import java.util.List;

public class CommandeTest {
    private static List<Commande> commandes=new ArrayList<>();
    
    private  static CommandeService commandeService=new CommandeService();
    public void init()
    {
        for(int i=1;i<=10;i++)
        {
            commandes.add(new Commande(Long.parseLong(i+""),i*3,"c"+1,i*2));
        }
    }
    public static void main(String[] args) {
        CommandeTest commandeTest=new CommandeTest();
        commandeTest.init();
        System.out.println("commandes = " +  commandeService.save("c1",1,commandes));
        System.out.println("results" + commandeService.receptionner("c1",0,commandes));
        System.out.println("results" + commandeService.findReceptionnerPartielement(commandes));
        System.out.println("results" + commandeService.delete("c1",commandes));
        System.out.println("results" + commandeService.findByQteTotalProduitCommandeGreaterThan(commandes,2));

    }
}
