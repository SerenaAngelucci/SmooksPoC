/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request;

import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.ReferenceIdentification;

public class Cri extends CriBox {

    private ReferenceIdentification referenceIdentification;

    public ReferenceIdentification getReferenceIdentification() {
        return referenceIdentification;
    }

    public Cri setReferenceIdentification(ReferenceIdentification referenceIdentification) {
        this.referenceIdentification = referenceIdentification;  return this;
    }
}