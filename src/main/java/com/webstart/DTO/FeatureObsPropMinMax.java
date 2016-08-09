package com.webstart.DTO;


import java.math.BigDecimal;

public class FeatureObsPropMinMax {
    private Integer featureofinterestid;
    private String identifier;
    private String name;
    private Long obspropertyid;
    private String obspropertName;
    private BigDecimal minval;
    private BigDecimal maxval;

    public FeatureObsPropMinMax() {
    }

    public Long getObspropertyid() {
        return obspropertyid;
    }

    public void setObspropertyid(Long obspropertyid) {
        this.obspropertyid = obspropertyid;
    }

    public String getObspropertName() {
        return obspropertName;
    }

    public void setObspropertName(String obspropertName) {
        this.obspropertName = obspropertName;
    }

    public BigDecimal getMinval() {
        return minval;
    }

    public void setMinval(BigDecimal minval) {
        this.minval = minval;
    }

    public BigDecimal getMaxval() {
        return maxval;
    }

    public void setMaxval(BigDecimal maxval) {
        this.maxval = maxval;
    }


    public Integer getFeatureofinterestid() {
        return featureofinterestid;
    }

    public void setFeatureofinterestid(Integer featureofinterestid) {
        this.featureofinterestid = featureofinterestid;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}