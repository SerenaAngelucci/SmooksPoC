/**
 * 
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;


import java.util.ArrayList;
import java.util.List;

/**
 * @author C012313
 *
 */
public class RateIdentificationDetailsBeanList {
	
	private List<RateIdentificationDetailsBean> rateIdentificationDetailsList = new ArrayList<RateIdentificationDetailsBean>();

	public List<RateIdentificationDetailsBean> getRateIdentificationDetailsList() {
		return rateIdentificationDetailsList;
	}

	public void setRateIdentificationDetailsList(List<RateIdentificationDetailsBean> rateIdentificationDetailsList) {
		this.rateIdentificationDetailsList = rateIdentificationDetailsList;
	}

	
}
