
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class UnderlyingInformation {

    @SerializedName("ISOUnderlying")
    private String mISOUnderlying;
    @SerializedName("UnderlyingSecurityId")
    private String mUnderlyingSecurityId;
    @SerializedName("UnderlyingTermUnit")
    private String mUnderlyingTermUnit;
    @SerializedName("UnderlyingTermValue")
    private Long mUnderlyingTermValue;
    @SerializedName("UnderlyingType")
    private String mUnderlyingType;

    public String getISOUnderlying() {
        return mISOUnderlying;
    }

    public void setISOUnderlying(String iSOUnderlying) {
        mISOUnderlying = iSOUnderlying;
    }

    public String getUnderlyingSecurityId() {
        return mUnderlyingSecurityId;
    }

    public void setUnderlyingSecurityId(String underlyingSecurityId) {
        mUnderlyingSecurityId = underlyingSecurityId;
    }

    public String getUnderlyingTermUnit() {
        return mUnderlyingTermUnit;
    }

    public void setUnderlyingTermUnit(String underlyingTermUnit) {
        mUnderlyingTermUnit = underlyingTermUnit;
    }

    public Long getUnderlyingTermValue() {
        return mUnderlyingTermValue;
    }

    public void setUnderlyingTermValue(Long underlyingTermValue) {
        mUnderlyingTermValue = underlyingTermValue;
    }

    public String getUnderlyingType() {
        return mUnderlyingType;
    }

    public void setUnderlyingType(String underlyingType) {
        mUnderlyingType = underlyingType;
    }

}
