package ma.projet.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

import ma.projet.beans.Service;

public class ServiceService extends AbstractFacade<Service> {

    @Override
    protected Class<Service> getEntityClass() {
        return Service.class;
    }

    public Service getServiceByName(String informatique) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
