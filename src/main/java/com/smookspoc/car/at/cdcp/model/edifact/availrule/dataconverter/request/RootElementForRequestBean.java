/**
 * 
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;

/**
 * @author C012313
 *
 */
public class RootElementForRequestBean {

	ConsumerReferenceInformationBeanList criBean;
	GeographicalDetailsBeanList pliBean;
	ProductInformationDetailsBeanList prdBean;
	//RateIdentificationDetailsBeanList rtiBean;
	RateTypeIdentificationBeanList rtcBean;
	LocationDetailsBeanList tvlBean;
	SpecialRequirementsDetailsBeanList ssrBean;

	public ConsumerReferenceInformationBeanList getCriBean() {
		return criBean;
	}

	public void setCriBean(ConsumerReferenceInformationBeanList criBean) {
		this.criBean = criBean;
	}

	public GeographicalDetailsBeanList getPliBean() {
		return pliBean;
	}

	public void setPliBean(GeographicalDetailsBeanList pliBean) {
		this.pliBean = pliBean;
	}

	public ProductInformationDetailsBeanList getPrdBean() {
		return prdBean;
	}

	public void setPrdBean(ProductInformationDetailsBeanList prdBean) {
		this.prdBean = prdBean;
	}

	public RateTypeIdentificationBeanList getRtcBean() {
		return rtcBean;
	}

	public void setRtcBean(RateTypeIdentificationBeanList rtcBean) {
		this.rtcBean = rtcBean;
	}

	public LocationDetailsBeanList getTvlBean() {
		return tvlBean;
	}

	public void setTvlBean(LocationDetailsBeanList tvlBean) {
		this.tvlBean = tvlBean;
	}

	public SpecialRequirementsDetailsBeanList getSsrBean() {
		return ssrBean;
	}

	public void setSsrBean(SpecialRequirementsDetailsBeanList ssrBean) {
		this.ssrBean = ssrBean;
	}
	
}
