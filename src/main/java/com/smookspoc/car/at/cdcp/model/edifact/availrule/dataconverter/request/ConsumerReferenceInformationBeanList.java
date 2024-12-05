package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;

import java.util.ArrayList;
import java.util.List;

/**
 * @author C012313
 *
 */
public class ConsumerReferenceInformationBeanList {

  private List<ConsumerReferenceIdentification> consumerReferenceIdentificationList =
      new ArrayList<ConsumerReferenceIdentification>();

  public List<ConsumerReferenceIdentification> getConsumerReferenceIdentificationList() {
    return consumerReferenceIdentificationList;
  }

  public void setConsumerReferenceIdentificationList(
      List<ConsumerReferenceIdentification> consumerReferenceIdentificationList) {
    this.consumerReferenceIdentificationList = consumerReferenceIdentificationList;
  }



}
