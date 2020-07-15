package edu.training.srp.dao;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceDAO {
    Appliance findFirst(Criteria criteria);
    List<Appliance> findAll(Criteria criteria);
}
