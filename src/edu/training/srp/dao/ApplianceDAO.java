package edu.training.srp.dao;

import edu.training.srp.dao.exception.DAOException;
import edu.training.srp.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    List<Object> find(Criteria criteria) throws DAOException;
}
