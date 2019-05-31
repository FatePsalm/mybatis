package cn.dingd.dd.common.entity;

public class CarBrands {
    /**
     * 汽车品牌ID
     */
    private Integer id;

    /**
     * 首字母
     */
    private String brandsHead;

    /**
     * 品牌ID
     */
    private String brandsId;

    /**
     * 品牌名
     */
    private String brandsName;

    /**
     * Logo图片本地地址
     */
    private String logoImge;

    /**
     * 汽车品牌ID
     * @return id 汽车品牌ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 汽车品牌ID
     * @param id 汽车品牌ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 首字母
     * @return brands_head 首字母
     */
    public String getBrandsHead() {
        return brandsHead;
    }

    /**
     * 首字母
     * @param brandsHead 首字母
     */
    public void setBrandsHead(String brandsHead) {
        this.brandsHead = brandsHead == null ? null : brandsHead.trim();
    }

    /**
     * 品牌ID
     * @return brands_Id 品牌ID
     */
    public String getBrandsId() {
        return brandsId;
    }

    /**
     * 品牌ID
     * @param brandsId 品牌ID
     */
    public void setBrandsId(String brandsId) {
        this.brandsId = brandsId == null ? null : brandsId.trim();
    }

    /**
     * 品牌名
     * @return brands_Name 品牌名
     */
    public String getBrandsName() {
        return brandsName;
    }

    /**
     * 品牌名
     * @param brandsName 品牌名
     */
    public void setBrandsName(String brandsName) {
        this.brandsName = brandsName == null ? null : brandsName.trim();
    }

    /**
     * Logo图片本地地址
     * @return Logo_Imge Logo图片本地地址
     */
    public String getLogoImge() {
        return logoImge;
    }

    /**
     * Logo图片本地地址
     * @param logoImge Logo图片本地地址
     */
    public void setLogoImge(String logoImge) {
        this.logoImge = logoImge == null ? null : logoImge.trim();
    }
}