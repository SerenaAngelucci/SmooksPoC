package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;

/**
 * @author C012313
 *
 */
public class ConsumerReferenceIdentification {

  private String referenceQualifier;
  private String referenceNumber;
  private String partyNumber;

  public String getReferenceQualifier() {
    return referenceQualifier;
  }

  public void setReferenceQualifier(String referenceQualifier) {
    this.referenceQualifier = referenceQualifier;
  }

  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public String getPartyNumber() {
    return partyNumber;
  }

  public void setPartyNumber(String partyNumber) {
    this.partyNumber = partyNumber;
  }



}
