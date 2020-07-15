package edu.training.srp.main;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Laptop;
import edu.training.srp.entity.Oven;
import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.service.ApplianceService;
import edu.training.srp.service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
		List<Appliance> applianceList;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop.add(SearchCriteria.Laptop.MEMORY_ROM.toString(), 8000);

		applianceList = service.findAll(criteriaLaptop);
		applianceList.forEach(PrintApplianceInfo::print);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "red");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 15);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 8000);

		applianceList = service.findAll(criteriaTabletPC);
		applianceList.forEach(PrintApplianceInfo::print);
	}
}
