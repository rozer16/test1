
package test1;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class SMCRequest {

    @SerializedName("ContractInformation.ContractSize")
    private Long mContractInformationContractSize;
    @SerializedName("ContractInformation.ExerciseType")
    private String mContractInformationExerciseType;
    @SerializedName("ContractInformation.ExpirationDate")
    private ContractInformationExpirationDate mContractInformationExpirationDate;
    @SerializedName("ContractInformation.ISDAContractSpecificationCode")
    private String mContractInformationISDAContractSpecificationCode;
    @SerializedName("EffectiveDate")
    private String mEffectiveDate;
    @SerializedName("ExchangeListingInfo.SettlementCurrency")
    private String mExchangeListingInfoSettlementCurrency;
    @SerializedName("IssueClassification.ANNAProductDefinitionName")
    private String mIssueClassificationANNAProductDefinitionName;
    @SerializedName("MifidReporting.ESMASeniority")
    private String mMifidReportingESMASeniority;
    @SerializedName("OTCInformation.NotionalCurrencyCode")
    private String mOTCInformationNotionalCurrencyCode;
    @SerializedName("OTCInformation.NotionalSchedule")
    private String mOTCInformationNotionalSchedule;
    @SerializedName("OTCInformation.OtherNotionalCurrencyCode")
    private String mOTCInformationOtherNotionalCurrencyCode;
    @SerializedName("OTCInformation.ProductLevel")
    private String mOTCInformationProductLevel;
    @SerializedName("OTCInformation.ReturnPayoutTrigger")
    private String mOTCInformationReturnPayoutTrigger;
    @SerializedName("OTCInformation.ValuationMethodTrigger")
    private String mOTCInformationValuationMethodTrigger;
    @SerializedName("Product.MarketSectorDescription")
    private String mProductMarketSectorDescription;
    @SerializedName("Product.SecurityTypeLevel1")
    private String mProductSecurityTypeLevel1;
    @SerializedName("Product.SecurityTypeLevel2")
    private String mProductSecurityTypeLevel2;
    @SerializedName("Settlement.DeliveryMethod")
    private String mSettlementDeliveryMethod;
    @SerializedName("UnderlyingInformation")
    private List<UnderlyingInformation> mUnderlyingInformation;
    @SerializedName("UnderlyingXref")
    private List<UnderlyingXref> mUnderlyingXref;

    public Long getContractInformationContractSize() {
        return mContractInformationContractSize;
    }

    public void setContractInformationContractSize(Long contractInformationContractSize) {
        mContractInformationContractSize = contractInformationContractSize;
    }

    public String getContractInformationExerciseType() {
        return mContractInformationExerciseType;
    }

    public void setContractInformationExerciseType(String contractInformationExerciseType) {
        mContractInformationExerciseType = contractInformationExerciseType;
    }

    public ContractInformationExpirationDate getContractInformationExpirationDate() {
        return mContractInformationExpirationDate;
    }

    public void setContractInformationExpirationDate(ContractInformationExpirationDate contractInformationExpirationDate) {
        mContractInformationExpirationDate = contractInformationExpirationDate;
    }

    public String getContractInformationISDAContractSpecificationCode() {
        return mContractInformationISDAContractSpecificationCode;
    }

    public void setContractInformationISDAContractSpecificationCode(String contractInformationISDAContractSpecificationCode) {
        mContractInformationISDAContractSpecificationCode = contractInformationISDAContractSpecificationCode;
    }

    public String getEffectiveDate() {
        return mEffectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        mEffectiveDate = effectiveDate;
    }

    public String getExchangeListingInfoSettlementCurrency() {
        return mExchangeListingInfoSettlementCurrency;
    }

    public void setExchangeListingInfoSettlementCurrency(String exchangeListingInfoSettlementCurrency) {
        mExchangeListingInfoSettlementCurrency = exchangeListingInfoSettlementCurrency;
    }

    public String getIssueClassificationANNAProductDefinitionName() {
        return mIssueClassificationANNAProductDefinitionName;
    }

    public void setIssueClassificationANNAProductDefinitionName(String issueClassificationANNAProductDefinitionName) {
        mIssueClassificationANNAProductDefinitionName = issueClassificationANNAProductDefinitionName;
    }

    public String getMifidReportingESMASeniority() {
        return mMifidReportingESMASeniority;
    }

    public void setMifidReportingESMASeniority(String mifidReportingESMASeniority) {
        mMifidReportingESMASeniority = mifidReportingESMASeniority;
    }

    public String getOTCInformationNotionalCurrencyCode() {
        return mOTCInformationNotionalCurrencyCode;
    }

    public void setOTCInformationNotionalCurrencyCode(String oTCInformationNotionalCurrencyCode) {
        mOTCInformationNotionalCurrencyCode = oTCInformationNotionalCurrencyCode;
    }

    public String getOTCInformationNotionalSchedule() {
        return mOTCInformationNotionalSchedule;
    }

    public void setOTCInformationNotionalSchedule(String oTCInformationNotionalSchedule) {
        mOTCInformationNotionalSchedule = oTCInformationNotionalSchedule;
    }

    public String getOTCInformationOtherNotionalCurrencyCode() {
        return mOTCInformationOtherNotionalCurrencyCode;
    }

    public void setOTCInformationOtherNotionalCurrencyCode(String oTCInformationOtherNotionalCurrencyCode) {
        mOTCInformationOtherNotionalCurrencyCode = oTCInformationOtherNotionalCurrencyCode;
    }

    public String getOTCInformationProductLevel() {
        return mOTCInformationProductLevel;
    }

    public void setOTCInformationProductLevel(String oTCInformationProductLevel) {
        mOTCInformationProductLevel = oTCInformationProductLevel;
    }

    public String getOTCInformationReturnPayoutTrigger() {
        return mOTCInformationReturnPayoutTrigger;
    }

    public void setOTCInformationReturnPayoutTrigger(String oTCInformationReturnPayoutTrigger) {
        mOTCInformationReturnPayoutTrigger = oTCInformationReturnPayoutTrigger;
    }

    public String getOTCInformationValuationMethodTrigger() {
        return mOTCInformationValuationMethodTrigger;
    }

    public void setOTCInformationValuationMethodTrigger(String oTCInformationValuationMethodTrigger) {
        mOTCInformationValuationMethodTrigger = oTCInformationValuationMethodTrigger;
    }

    public String getProductMarketSectorDescription() {
        return mProductMarketSectorDescription;
    }

    public void setProductMarketSectorDescription(String productMarketSectorDescription) {
        mProductMarketSectorDescription = productMarketSectorDescription;
    }

    public String getProductSecurityTypeLevel1() {
        return mProductSecurityTypeLevel1;
    }

    public void setProductSecurityTypeLevel1(String productSecurityTypeLevel1) {
        mProductSecurityTypeLevel1 = productSecurityTypeLevel1;
    }

    public String getProductSecurityTypeLevel2() {
        return mProductSecurityTypeLevel2;
    }

    public void setProductSecurityTypeLevel2(String productSecurityTypeLevel2) {
        mProductSecurityTypeLevel2 = productSecurityTypeLevel2;
    }

    public String getSettlementDeliveryMethod() {
        return mSettlementDeliveryMethod;
    }

    public void setSettlementDeliveryMethod(String settlementDeliveryMethod) {
        mSettlementDeliveryMethod = settlementDeliveryMethod;
    }

    public List<UnderlyingInformation> getUnderlyingInformation() {
        return mUnderlyingInformation;
    }

    public void setUnderlyingInformation(List<UnderlyingInformation> underlyingInformation) {
        mUnderlyingInformation = underlyingInformation;
    }

    public List<UnderlyingXref> getUnderlyingXref() {
        return mUnderlyingXref;
    }

    public void setUnderlyingXref(List<UnderlyingXref> underlyingXref) {
        mUnderlyingXref = underlyingXref;
    }

}
