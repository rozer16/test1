
package test;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Settlement {

    @SerializedName("DeliveryMethod")
    private String mDeliveryMethod;

    public String getDeliveryMethod() {
        return mDeliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        mDeliveryMethod = deliveryMethod;
    }

}
