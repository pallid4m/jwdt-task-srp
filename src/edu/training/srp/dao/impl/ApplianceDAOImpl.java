package edu.training.srp.dao.impl;

import edu.training.srp.dao.exception.DAOException;
import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.ApplianceFactory;
import edu.training.srp.dao.ApplianceDAO;
import edu.training.srp.dao.util.ApplianceFileUtil;
import edu.training.srp.entity.criteria.Criteria;

import java.io.Reader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final String APPLIANCES_DB = "resources/appliances_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) throws DAOException {
        List<Appliance> applianceList;
        try (Reader reader = new FileReader(APPLIANCES_DB); BufferedReader bufferedReader = new BufferedReader(reader)) {
            applianceList = bufferedReader.lines()
                    .filter(row -> ApplianceFileUtil.classMatch(criteria, row))
                    .filter(row -> ApplianceFileUtil.paramsMatch(criteria, row))
                    .map(row -> {
                        String[] params = ApplianceFileUtil.parseParams(row);
                        return ApplianceFactory.getInstance().createAppliance(criteria.getGroupSearchName(), params);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new DAOException(e);
        }
        return applianceList;
    }
}
