package edu.training.srp.service.validation;

import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.entity.criteria.CriteriaType;

import java.util.Map;

public class Validator {

    private static final CriteriaType criteriaType = new CriteriaType();

    public static boolean criteriaValidator(Criteria criteria) {
        Map<String, Class<?>> typeRules = criteriaType.getRules(criteria.getGroupSearchName());
        Map<String, Object> criterias = criteria.getCriteria();
        for (Map.Entry<String, Object> criteriaItem : criterias.entrySet()) {
            String criteriaName = criteriaItem.getKey();
            Object criteriaValue = criteriaItem.getValue();
            if (criteriaValue.getClass() != typeRules.get(criteriaName)) {
                return false;
            }
        }
        return true;
    }
}
