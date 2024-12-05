/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field;

public class PaymentDetails {


    private String fopIdentification;
    private String paymentTypeIdentification;
    private String serviceToBePaid;
    private String monetaryAmount;
    private String currencyCoded;
    private String referenceNumber;
    private String date;
    private String placeIdentification;

    public String getFopIdentification() {
        return fopIdentification;
    }

    public PaymentDetails setFopIdentification(String fopIdentification) {
        this.fopIdentification = fopIdentification;  return this;
    }

    public String getPaymentTypeIdentification() {
        return paymentTypeIdentification;
    }

    public PaymentDetails setPaymentTypeIdentification(String paymentTypeIdentification) {
        this.paymentTypeIdentification = paymentTypeIdentification;  return this;
    }

    public String getServiceToBePaid() {
        return serviceToBePaid;
    }

    public PaymentDetails setServiceToBePaid(String serviceToBePaid) {
        this.serviceToBePaid = serviceToBePaid;  return this;
    }

    public String getMonetaryAmount() {
        return monetaryAmount;
    }

    public PaymentDetails setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;  return this;
    }

    public String getCurrencyCoded() {
        return currencyCoded;
    }

    public PaymentDetails setCurrencyCoded(String currencyCoded) {
        this.currencyCoded = currencyCoded;  return this;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public PaymentDetails setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;  return this;
    }

    public String getDate() {
        return date;
    }

    public PaymentDetails setDate(String date) {
        this.date = date;  return this;
    }

    public String getPlaceIdentification() {
        return placeIdentification;
    }

    public PaymentDetails setPlaceIdentification(String placeIdentification) {
        this.placeIdentification = placeIdentification;  return this;
    }
}