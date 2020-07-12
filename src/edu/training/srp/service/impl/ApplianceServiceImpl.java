package edu.training.srp.service.impl;

import edu.training.srp.dao.DAOFactory;
import edu.training.srp.entity.Appliance;
import edu.training.srp.dao.ApplianceDAO;
import edu.training.srp.dao.impl.ApplianceDAOImpl;
import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.service.ApplianceService;
import edu.training.srp.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService {

    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    @Override
    public Appliance find(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            System.err.println(criteria.getGroupSearchName() + ": Criteria isn't valid");
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        Appliance appliance = applianceDAO.find(criteria);

        return appliance;
    }
}
