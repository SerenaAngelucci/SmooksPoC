package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request;


import com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request.ProductInformationDetailsBeanList;

public class PrdBox {

  ProductInformationDetailsBeanList prdBean;
    
  public ProductInformationDetailsBeanList getPrdBean() {
      return prdBean;
  }
  public void setPrdBean(ProductInformationDetailsBeanList prdBean) {
      this.prdBean = prdBean;
  }
	
	
}
