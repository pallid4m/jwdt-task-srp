package edu.training.srp.service.impl;

import edu.training.srp.dao.DAOFactory;
import edu.training.srp.dao.exception.DAOException;
import edu.training.srp.dao.ApplianceDAO;
import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.service.ApplianceService;
import edu.training.srp.service.exception.ServiceException;
import edu.training.srp.service.validation.Validator;

import java.util.List;

public class ApplianceServiceImpl implements ApplianceService {

    @Override
    public List<Object> find(Criteria criteria) throws ServiceException {
        if (!Validator.criteriaValidator(criteria)) {
            throw new ServiceException("Criteria isn't valid");
        }

        List<Object> applianceList;

        DAOFactory factory = DAOFactory.getInstance();
        ApplianceDAO applianceDAO = factory.getApplianceDAO();

        try {
            applianceList = applianceDAO.find(criteria);
        } catch (DAOException e) {
            throw new ServiceException(e);
        }

        return applianceList;
    }
}
