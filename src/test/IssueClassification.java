
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class IssueClassification {

    @SerializedName("ANNAProductDefinitionName")
    private String mANNAProductDefinitionName;

    public String getANNAProductDefinitionName() {
        return mANNAProductDefinitionName;
    }

    public void setANNAProductDefinitionName(String aNNAProductDefinitionName) {
        mANNAProductDefinitionName = aNNAProductDefinitionName;
    }

}
