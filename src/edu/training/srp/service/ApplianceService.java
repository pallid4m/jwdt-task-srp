package edu.training.srp.service;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.criteria.Criteria;

import java.util.List;

public interface ApplianceService {
    Appliance findFirst(Criteria criteria);
    List<Appliance> findAll(Criteria criteria);
}
