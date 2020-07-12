package edu.training.srp.service;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.criteria.Criteria;

public interface ApplianceService {
    Appliance find(Criteria criteria);
}
