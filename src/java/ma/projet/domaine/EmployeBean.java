package ma.projet.domaine;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import ma.projet.beans.Employe;
import ma.projet.service.EmployeService;

@ManagedBean(name = "employeBean")
@ViewScoped
public class EmployeBean implements Serializable {

    private Employe employe;

    @Inject
    private EmployeService employeService;

    private List<Employe> employes;
    private Employe newEmploye;

    public List<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public Employe getNewEmploye() {
        return newEmploye;
    }

    public void setNewEmploye(Employe newEmploye) {
        this.newEmploye = newEmploye;
    }

    public void loadEmployes() {
        employes = employeService.getAll();
    }

    public void addEmploye() {
        employeService.create(newEmploye);

        newEmploye = new Employe();

    }

    public void setEmployeService(EmployeService employeService) {
        this.employeService = employeService;
    }

    public EmployeService getEmployeService() {
        return employeService;
    }
}
