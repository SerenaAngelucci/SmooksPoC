package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;

import java.util.ArrayList;
import java.util.List;

/**
 * @author C012313
 */
public class SpecialRequirementsDetailsBeanList {
	
	private List<SpecialReqDetails> specialRequirementDetailsList = new ArrayList<SpecialReqDetails>();

	public List<SpecialReqDetails> getSpecialRequirementDetailsList() {
		return specialRequirementDetailsList;
	}

	public void setSpecialRequirementDetailsList(List<SpecialReqDetails> specialRequirementDetailsList) {
		this.specialRequirementDetailsList = specialRequirementDetailsList;
	}
}
