package edu.training.srp.main;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Oven;
import edu.training.srp.entity.criteria.Criteria;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.service.ApplianceService;
import edu.training.srp.service.ServiceFactory;

public class Main {

    public static void main(String[] args) {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(SearchCriteria.Oven.CAPACITY.toString(), 3);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(SearchCriteria.Oven.HEIGHT.toString(), 200);
		criteriaOven.add(SearchCriteria.Oven.DEPTH.toString(), 300);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(SearchCriteria.TabletPC.class.getSimpleName());
		criteriaTabletPC.add(SearchCriteria.TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(SearchCriteria.TabletPC.MEMORY_ROM.toString(), 4);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);
	}
}
