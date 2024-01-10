
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Xref {

    @SerializedName("ISN")
    private String mISN;
    @SerializedName("UPI")
    private String mUPI;

    public String getISN() {
        return mISN;
    }

    public void setISN(String iSN) {
        mISN = iSN;
    }

    public String getUPI() {
        return mUPI;
    }

    public void setUPI(String uPI) {
        mUPI = uPI;
    }

}
