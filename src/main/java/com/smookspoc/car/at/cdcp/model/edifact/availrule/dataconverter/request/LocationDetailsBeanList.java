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
public class LocationDetailsBeanList {
	
	private List<LocationDetails> locationlDetailsList = new ArrayList<LocationDetails>();

	public List<LocationDetails> getLocationlDetailsList() {
		return locationlDetailsList;
	}

	public void setLocationlDetailsList(List<LocationDetails> locationlDetailsList) {
		this.locationlDetailsList = locationlDetailsList;
	}

}
