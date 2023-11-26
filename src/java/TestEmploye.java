import java.util.Date;
import ma.projet.beans.Employe;
import ma.projet.beans.Service;
import ma.projet.service.EmployeService;
import ma.projet.service.ServiceService;
import ma.projet.util.HibernateUtil;

public class TestEmploye {

    public static void main(String[] args) {
        // Créer une instance de ServiceService
        ServiceService serviceService = new ServiceService();

        // Récupérer le service "Informatique" depuis la base de données
        Service informatiqueService = serviceService.getServiceByName("Informatique");

        // Créer une instance d'EmployeService
        EmployeService employeService = new EmployeService();

        // Créer un employé
        Employe employe1 = new Employe();
        employe1.setNom("Fatima");
        employe1.setPrenom("Zouhair");
        employe1.setDateNaissance(new Date());
        employe1.setService(informatiqueService);

        Employe employe2 = new Employe();
        employe2.setNom("Youssef");
        employe2.setPrenom("El Mansouri");
        employe2.setDateNaissance(new Date());
        employe2.setService(informatiqueService);

        Employe employe3 = new Employe();
        employe3.setNom("Amina");
        employe3.setPrenom("Chaoui");
        employe3.setDateNaissance(new Date());
        employe3.setService(informatiqueService);

        // Enregistrer les employés
        employeService.create(employe1);
        employeService.create(employe2);
        employeService.create(employe3);

        // Afficher les employés
        System.out.println("Employés créés avec succès!");

        // Fermer la session Hibernate
        HibernateUtil.getSessionFactory().close();
    }
}
