package edu.training.srp.service.impl;

import edu.training.srp.dao.DAOFactory;
import edu.training.srp.entity.Appliance;
import edu.training.srp.dao.ApplianceDAO;
import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.service.ApplianceService;
import edu.training.srp.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public Appliance findFirst(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            System.err.println(criteria.getGroupSearchName() + ": Criteria isn't valid");
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        Appliance appliance = applianceDAO.findFirst(criteria);

        return appliance;
    }

    @Override
    public List<Appliance> findAll(Criteria criteria) {
        if (!Validator.criteriaValidator(criteria)) {
            System.err.println(criteria.getGroupSearchName() + ": Criteria isn't valid");
            return null;
        }

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        List<Appliance> applianceList = applianceDAO.findAll(criteria);

        return applianceList;
    }
}
