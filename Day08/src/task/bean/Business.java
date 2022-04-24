package task.bean;

/**
 * @ Classname Business
 * @ Description TODO
 * @ Date 2022/4/24 14:51
 * @ Created by 落尘
 */
public class Business extends User{
    //店铺普名称
    private String shopName;
    //地址
    private String address;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
