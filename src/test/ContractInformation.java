
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ContractInformation {

    @SerializedName("ContractSize")
    private Double mContractSize;
    @SerializedName("ExpirationDate")
    private String mExpirationDate;
    @SerializedName("IsCommodityDerivative")
    private Boolean mIsCommodityDerivative;

    public Double getContractSize() {
        return mContractSize;
    }

    public void setContractSize(Double contractSize) {
        mContractSize = contractSize;
    }

    public String getExpirationDate() {
        return mExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        mExpirationDate = expirationDate;
    }

    public Boolean getIsCommodityDerivative() {
        return mIsCommodityDerivative;
    }

    public void setIsCommodityDerivative(Boolean isCommodityDerivative) {
        mIsCommodityDerivative = isCommodityDerivative;
    }

}
