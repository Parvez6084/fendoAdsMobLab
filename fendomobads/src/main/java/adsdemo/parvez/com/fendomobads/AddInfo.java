package adsdemo.parvez.com.fendomobads;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddInfo {

    @SerializedName("add_id")
    @Expose
    private String addId;

    @SerializedName("adverser_id")
    @Expose
    private String adverserId;

    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("link")
    @Expose
    private String link;

    @SerializedName("cpc")
    @Expose
    private float cpc;

    @SerializedName("remaining_balance")
    @Expose
    private float remainingBalance;

    @SerializedName("current_date_time")
    @Expose
    private String currentDateTime;

    @SerializedName("publisher_id")
    @Expose
    private String publisherId;

    @SerializedName("is_active")
    @Expose
    private String isActive;

    @SerializedName("user_name")
    @Expose
    private String userName;

    @SerializedName("app_id")
    @Expose
    private String appId;

    @SerializedName("package_name")
    @Expose
    private String packageName;

    @SerializedName("add_unit_id")
    @Expose
    private String addUnitId;

    @SerializedName("ad_type")
    @Expose
    private String addType;

    @SerializedName("is_clicked")
    @Expose
    private String is_clicked;

    public String getIs_clicked() {
        return is_clicked;
    }

    public void setIs_clicked(String is_clicked) {
        this.is_clicked = is_clicked;
    }



    public String getAddId() {
        return addId;
    }

    public void setAddId(String addId) {
        this.addId = addId;
    }

    public String getAdverserId() {
        return adverserId;
    }

    public void setAdverserId(String adverserId) {
        this.adverserId = adverserId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public float getCpc() {
        return cpc;
    }

    public void setCpc(float cpc) {
        this.cpc = cpc;
    }

    public float getRemainingBalance() {
        return remainingBalance;
    }

    public void setRemainingBalance(float remainingBalance) {
        this.remainingBalance = remainingBalance;
    }

    public String getCurrentDateTime() {
        return currentDateTime;
    }

    public void setCurrentDateTime(String currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }


    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }


    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


    public String getAddUnitId() {
        return addUnitId;
    }

    public void setAddUnitId(String addUnitId) {
        this.addUnitId = addUnitId;
    }


    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }
}
