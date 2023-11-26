import ma.projet.beans.Service;
import ma.projet.service.ServiceService;
import ma.projet.util.HibernateUtil;

public class TestService {

    public static void main(String[] args) {
        // Créer une instance de ServiceService
        ServiceService serviceService = new ServiceService();

        // Créer un service
        Service service1 = new Service();
        service1.setNom("Informatique");

        Service service2 = new Service();
        service2.setNom("Ressources Humaines");

        // Enregistrer les services
        serviceService.create(service1);
        serviceService.create(service2);

        // Afficher les services
        System.out.println("Services créés avec succès!");

        // Fermer la session Hibernate
        HibernateUtil.getSessionFactory().close();
    }
}
