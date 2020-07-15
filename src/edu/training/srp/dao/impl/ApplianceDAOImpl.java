package edu.training.srp.dao.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.ApplianceFactory;
import edu.training.srp.dao.ApplianceDAO;
import edu.training.srp.dao.util.ApplianceFileUtil;
import edu.training.srp.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final String APPLIANCES_DB = "resources/appliances_db.txt";

    @Override
    public Appliance findFirst(Criteria criteria) {
        Appliance appliance = null;
        try (Reader reader = new FileReader(APPLIANCES_DB); BufferedReader bufferedReader = new BufferedReader(reader)) {
            appliance = bufferedReader.lines()
                    .filter(row -> ApplianceFileUtil.classMatch(criteria, row))
                    .filter(row -> ApplianceFileUtil.paramsMatch(criteria, row))
                    .map(row -> {
                        String[] params = ApplianceFileUtil.parseParams(row);
                        return ApplianceFactory.createAppliance(criteria.getGroupSearchName(), params);
                    })
                    .findFirst().orElse(null);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return appliance;
    }

    @Override
    public List<Appliance> findAll(Criteria criteria) {
        List<Appliance> applianceList = new ArrayList<>();
        try (Reader reader = new FileReader(APPLIANCES_DB); BufferedReader bufferedReader = new BufferedReader(reader)) {
            applianceList = bufferedReader.lines()
                    .filter(row -> ApplianceFileUtil.classMatch(criteria, row))
                    .filter(row -> ApplianceFileUtil.paramsMatch(criteria, row))
                    .map(row -> {
                        String[] params = ApplianceFileUtil.parseParams(row);
                        return ApplianceFactory.createAppliance(criteria.getGroupSearchName(), params);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return applianceList;
    }
}
