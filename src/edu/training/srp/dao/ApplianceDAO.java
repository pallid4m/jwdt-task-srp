package edu.training.srp.dao;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.criteria.Criteria;

public interface ApplianceDAO {
    Appliance find(Criteria criteria);
}
