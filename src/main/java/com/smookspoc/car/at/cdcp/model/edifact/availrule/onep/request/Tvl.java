/**
 * This class was generated by Smooks EJC (http://www.smooks.org).
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request;


import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.CompanyIdentification;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.ProductDateAndTime;
import com.smookspoc.car.at.cdcp.model.edifact.availrule.onep.request.field.TvlLocation;

public class Tvl extends TvlBox {

    private ProductDateAndTime productDateAndTime;
    private TvlLocation tvlLocation;
    private CompanyIdentification companyIdentification;

    public ProductDateAndTime getProductDateAndTime() {
        return productDateAndTime;
    }

    public Tvl setProductDateAndTime(ProductDateAndTime productDateAndTime) {
        this.productDateAndTime = productDateAndTime;  return this;
    }

    public TvlLocation getTvlLocation() {
        return tvlLocation;
    }

    public Tvl setTvlLocation(TvlLocation tvlLocation) {
        this.tvlLocation = tvlLocation;  return this;
    }

    public CompanyIdentification getCompanyIdentification() {
        return companyIdentification;
    }

    public Tvl setCompanyIdentification(CompanyIdentification companyIdentification) {
        this.companyIdentification = companyIdentification;  return this;
    }
}