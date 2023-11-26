package ma.projet.service;

import java.util.List;
import ma.projet.beans.Employe;
import ma.projet.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeService extends AbstractFacade<Employe> {

    @Override
    protected Class<Employe> getEntityClass() {
       return Employe.class;
       
    }
   
}