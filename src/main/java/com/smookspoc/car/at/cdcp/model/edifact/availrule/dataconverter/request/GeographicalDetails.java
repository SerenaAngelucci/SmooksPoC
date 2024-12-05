/**
 * 
 */
package com.smookspoc.car.at.cdcp.model.edifact.availrule.dataconverter.request;

/**
 * @author C012313
 *
 */
public class GeographicalDetails {

  private String placeLocationQualifier;
  private String placeLocation;
  
  public String getPlaceLocationQualifier() {
    return placeLocationQualifier;
  }

  public void setPlaceLocationQualifier(String placeLocationQualifier) {
    this.placeLocationQualifier = placeLocationQualifier;
  }

  public String getPlaceLocation() {
    return placeLocation;
  }

  public void setPlaceLocation(String placeLocation) {
    this.placeLocation = placeLocation;
  }
  
}
