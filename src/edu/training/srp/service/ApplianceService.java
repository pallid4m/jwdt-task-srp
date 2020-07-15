package edu.training.srp.service;

import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.service.exception.ServiceException;

import java.util.List;

public interface ApplianceService {
    List<Object> find(Criteria criteria) throws ServiceException;
}
