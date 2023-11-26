package ma.projet.domaine;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import ma.projet.beans.Service;
import ma.projet.service.ServiceService;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean(name = "serviceBean")
public class ServiceBean implements Serializable {
    

    private PieChartModel pieModel;

    @Inject
    private ServiceService serviceService;

    @PostConstruct
    public void init() {
        createPieModel();
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    private void createPieModel() {
        
}
}