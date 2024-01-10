
package test1;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class UnderlyingXref {

    @SerializedName("UnderlyingXrefCode")
    private String mUnderlyingXrefCode;
    @SerializedName("UnderlyingXrefValue")
    private String mUnderlyingXrefValue;

    public String getUnderlyingXrefCode() {
        return mUnderlyingXrefCode;
    }

    public void setUnderlyingXrefCode(String underlyingXrefCode) {
        mUnderlyingXrefCode = underlyingXrefCode;
    }

    public String getUnderlyingXrefValue() {
        return mUnderlyingXrefValue;
    }

    public void setUnderlyingXrefValue(String underlyingXrefValue) {
        mUnderlyingXrefValue = underlyingXrefValue;
    }

}
