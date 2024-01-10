
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProductSMCP {

    @SerializedName("SMCP")
    private String mSMCP;
    @SerializedName("SMCPStatus")
    private Boolean mSMCPStatus;

    public String getSMCP() {
        return mSMCP;
    }

    public void setSMCP(String sMCP) {
        mSMCP = sMCP;
    }

    public Boolean getSMCPStatus() {
        return mSMCPStatus;
    }

    public void setSMCPStatus(Boolean sMCPStatus) {
        mSMCPStatus = sMCPStatus;
    }

}
