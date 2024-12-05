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
public class RateTypeIdentificationBeanList {

  private List<String> rateTypeIdentificationList = new ArrayList<String>();

  public List<String> getRateTypeIdentificationList() {
    return rateTypeIdentificationList;
  }

  public void setRateTypeIdentificationList(List<String> rateTypeIdentificationList) {
    this.rateTypeIdentificationList = rateTypeIdentificationList;
  }


}
