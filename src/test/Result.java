
package test;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Result {

    @SerializedName("ContractInformation")
    private ContractInformation mContractInformation;
    @SerializedName("IssueClassification")
    private IssueClassification mIssueClassification;
    @SerializedName("OTCInformation")
    private OTCInformation mOTCInformation;
    @SerializedName("Product")
    private Product mProduct;
    @SerializedName("ProductSMCP")
    private List<ProductSMCP> mProductSMCP;
    @SerializedName("Settlement")
    private Settlement mSettlement;
    @SerializedName("UnderlyingInformation")
    private List<UnderlyingInformation> mUnderlyingInformation;
    @SerializedName("Xref")
    private Xref mXref;
    @SerializedName("_id")
    private String m_id;

    public ContractInformation getContractInformation() {
        return mContractInformation;
    }

    public void setContractInformation(ContractInformation contractInformation) {
        mContractInformation = contractInformation;
    }

    public IssueClassification getIssueClassification() {
        return mIssueClassification;
    }

    public void setIssueClassification(IssueClassification issueClassification) {
        mIssueClassification = issueClassification;
    }

    public OTCInformation getOTCInformation() {
        return mOTCInformation;
    }

    public void setOTCInformation(OTCInformation oTCInformation) {
        mOTCInformation = oTCInformation;
    }

    public Product getProduct() {
        return mProduct;
    }

    public void setProduct(Product product) {
        mProduct = product;
    }

    public List<ProductSMCP> getProductSMCP() {
        return mProductSMCP;
    }

    public void setProductSMCP(List<ProductSMCP> productSMCP) {
        mProductSMCP = productSMCP;
    }

    public Settlement getSettlement() {
        return mSettlement;
    }

    public void setSettlement(Settlement settlement) {
        mSettlement = settlement;
    }

    public List<UnderlyingInformation> getUnderlyingInformation() {
        return mUnderlyingInformation;
    }

    public void setUnderlyingInformation(List<UnderlyingInformation> underlyingInformation) {
        mUnderlyingInformation = underlyingInformation;
    }

    public Xref getXref() {
        return mXref;
    }

    public void setXref(Xref xref) {
        mXref = xref;
    }

    public String get_id() {
        return m_id;
    }

    public void set_id(String _id) {
        m_id = _id;
    }

}
