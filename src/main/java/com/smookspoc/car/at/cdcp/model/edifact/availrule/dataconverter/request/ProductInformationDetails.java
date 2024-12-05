/**
 * 
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;


/**
 * @author C012313
 *
 */
public class ProductInformationDetails {
	
	private String productIdentificationElement;
	private String characteristicIdentificationElement;
	
	
	public String getProductIdentificationElement() {
		return productIdentificationElement;
	}
	public void setProductIdentificationElement(String productIdentificationElement) {
		this.productIdentificationElement = productIdentificationElement;
	}
	public String getCharacteristicIdentificationElement() {
		return characteristicIdentificationElement;
	}
	public void setCharacteristicIdentificationElement(String characteristicIdentificationElement) {
		this.characteristicIdentificationElement = characteristicIdentificationElement;
	}

}
