/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request;

import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.SpecialRequirementDetails;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.SpecialRequirementTypeDetails;


public class Ssr extends SsrBox {

    private SpecialRequirementTypeDetails specialRequirementTypeDetails;
    private SpecialRequirementDetails specialRequirementDetails;

    public SpecialRequirementTypeDetails getSpecialRequirementTypeDetails() {
        return specialRequirementTypeDetails;
    }

    public Ssr setSpecialRequirementTypeDetails(SpecialRequirementTypeDetails specialRequirementTypeDetails) {
        this.specialRequirementTypeDetails = specialRequirementTypeDetails;  return this;
    }

    public SpecialRequirementDetails getSpecialRequirementDetails() {
        return specialRequirementDetails;
    }

    public Ssr setSpecialRequirementDetails(SpecialRequirementDetails specialRequirementDetails) {
        this.specialRequirementDetails = specialRequirementDetails;  return this;
    }
}