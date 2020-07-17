package edu.training.srp.dao;

import edu.training.srp.dao.exception.DAOException;
import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Appliance> find(Criteria criteria) throws DAOException;
}
