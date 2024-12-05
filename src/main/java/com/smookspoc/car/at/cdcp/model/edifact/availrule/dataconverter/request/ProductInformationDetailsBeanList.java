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
public class ProductInformationDetailsBeanList {
	
	private List<ProductInformationDetails> productInformationDetailsList = new ArrayList<ProductInformationDetails>();

	public List<ProductInformationDetails> getProductInformationDetailsList() {
		return productInformationDetailsList;
	}

	public void setProductInformationDetailsList(List<ProductInformationDetails> productInformationDetailsList) {
		this.productInformationDetailsList = productInformationDetailsList;
	}

}
