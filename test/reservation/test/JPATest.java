/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import reservation.entity.Adresse;
import reservation.entity.Chambre;
import reservation.entity.Hotel;

/**
 *
 * @author formation
 */
public class JPATest {
    
    @Test
    public void genererTables()
    {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
    }
//    @Test
    public void recupChambreId1()
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
        EntityManager em = factory.createEntityManager();
        Chambre chambre = em.find(Chambre.class, 1L);
        
        System.out.println(String.format("Chambre : id = %d nom:= %s prix=%9.2f hotel = %s", chambre.getId(),chambre.getNom(),chambre.getPrix(), chambre.getHotel().getNom()));
    }
//    @Test
    public void ajouterHotel()
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Hotel h = new Hotel();
        Adresse a = new Adresse();
        
        a.setCodePostal(93000L);
        a.setLocalite("Bobigny");
        a.setPays("France");
        a.setRue("Jabroni Drive");
        h.setNom("Smackdown");
        h.setAdresse(a);
        
        em.getTransaction().begin();
        
        em.persist(h);
        
        em.getTransaction().commit();
                
    
    }

//  @Test
    public void ajouterChambre() {
       EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       Chambre c = new Chambre();
       c.setNom("Suite royale");
       c.setPrix(20000.0);
       c.setDescription("C'est pas cher");
       
       
       em.getTransaction().begin();
       
       em.persist(c);
       
       em.getTransaction().commit();
    }

}
 