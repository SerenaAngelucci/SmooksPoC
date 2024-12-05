package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request;


import com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request.RateIdentificationDetailsBeanList;

public class RtiBox {

  RateIdentificationDetailsBeanList rtiBean;
  
  public RateIdentificationDetailsBeanList getRtiBean() {
      return rtiBean;
  }
  public void setRtiBean(RateIdentificationDetailsBeanList rtiBean) {
      this.rtiBean = rtiBean;
  }
}
