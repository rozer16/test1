
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Product {

    @SerializedName("CFICode")
    private String mCFICode;
    @SerializedName("Description")
    private String mDescription;
    @SerializedName("MarketSectorDescription")
    private String mMarketSectorDescription;
    @SerializedName("OperationalIndicator")
    private Boolean mOperationalIndicator;
    @SerializedName("SecurityTypeLevel1")
    private String mSecurityTypeLevel1;
    @SerializedName("SecurityTypeLevel2")
    private String mSecurityTypeLevel2;
    @SerializedName("ShortDescription")
    private String mShortDescription;

    public String getCFICode() {
        return mCFICode;
    }

    public void setCFICode(String cFICode) {
        mCFICode = cFICode;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getMarketSectorDescription() {
        return mMarketSectorDescription;
    }

    public void setMarketSectorDescription(String marketSectorDescription) {
        mMarketSectorDescription = marketSectorDescription;
    }

    public Boolean getOperationalIndicator() {
        return mOperationalIndicator;
    }

    public void setOperationalIndicator(Boolean operationalIndicator) {
        mOperationalIndicator = operationalIndicator;
    }

    public String getSecurityTypeLevel1() {
        return mSecurityTypeLevel1;
    }

    public void setSecurityTypeLevel1(String securityTypeLevel1) {
        mSecurityTypeLevel1 = securityTypeLevel1;
    }

    public String getSecurityTypeLevel2() {
        return mSecurityTypeLevel2;
    }

    public void setSecurityTypeLevel2(String securityTypeLevel2) {
        mSecurityTypeLevel2 = securityTypeLevel2;
    }

    public String getShortDescription() {
        return mShortDescription;
    }

    public void setShortDescription(String shortDescription) {
        mShortDescription = shortDescription;
    }

}
