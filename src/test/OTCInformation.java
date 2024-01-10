
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OTCInformation {

    @SerializedName("ContractCurrencyIndicator")
    private String mContractCurrencyIndicator;
    @SerializedName("NotionalCurrencyCode")
    private String mNotionalCurrencyCode;
    @SerializedName("NotionalSchedule")
    private String mNotionalSchedule;
    @SerializedName("ProductLevel")
    private String mProductLevel;
    @SerializedName("TermUnitOfContract")
    private String mTermUnitOfContract;
    @SerializedName("TermValueOfContract")
    private Long mTermValueOfContract;

    public String getContractCurrencyIndicator() {
        return mContractCurrencyIndicator;
    }

    public void setContractCurrencyIndicator(String contractCurrencyIndicator) {
        mContractCurrencyIndicator = contractCurrencyIndicator;
    }

    public String getNotionalCurrencyCode() {
        return mNotionalCurrencyCode;
    }

    public void setNotionalCurrencyCode(String notionalCurrencyCode) {
        mNotionalCurrencyCode = notionalCurrencyCode;
    }

    public String getNotionalSchedule() {
        return mNotionalSchedule;
    }

    public void setNotionalSchedule(String notionalSchedule) {
        mNotionalSchedule = notionalSchedule;
    }

    public String getProductLevel() {
        return mProductLevel;
    }

    public void setProductLevel(String productLevel) {
        mProductLevel = productLevel;
    }

    public String getTermUnitOfContract() {
        return mTermUnitOfContract;
    }

    public void setTermUnitOfContract(String termUnitOfContract) {
        mTermUnitOfContract = termUnitOfContract;
    }

    public Long getTermValueOfContract() {
        return mTermValueOfContract;
    }

    public void setTermValueOfContract(Long termValueOfContract) {
        mTermValueOfContract = termValueOfContract;
    }

}
