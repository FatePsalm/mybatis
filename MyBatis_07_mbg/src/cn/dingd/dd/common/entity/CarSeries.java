package cn.dingd.dd.common.entity;

public class CarSeries {
    /**
     * 
     */
    private Integer id;

    /**
     * 车系ID
     */
    private String seriesId;

    /**
     * 品牌ID
     */
    private String brandsId;

    /**
     * 车系名
     */
    private String seriesName;

    /**
     * 指导价
     */
    private String guideMoney;

    /**
     * 车系展示图
     */
    private String seriesImg;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 车系ID
     * @return series_id 车系ID
     */
    public String getSeriesId() {
        return seriesId;
    }

    /**
     * 车系ID
     * @param seriesId 车系ID
     */
    public void setSeriesId(String seriesId) {
        this.seriesId = seriesId == null ? null : seriesId.trim();
    }

    /**
     * 品牌ID
     * @return brands_id 品牌ID
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
     * 车系名
     * @return series_name 车系名
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * 车系名
     * @param seriesName 车系名
     */
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName == null ? null : seriesName.trim();
    }

    /**
     * 指导价
     * @return guide_money 指导价
     */
    public String getGuideMoney() {
        return guideMoney;
    }

    /**
     * 指导价
     * @param guideMoney 指导价
     */
    public void setGuideMoney(String guideMoney) {
        this.guideMoney = guideMoney == null ? null : guideMoney.trim();
    }

    /**
     * 车系展示图
     * @return series_img 车系展示图
     */
    public String getSeriesImg() {
        return seriesImg;
    }

    /**
     * 车系展示图
     * @param seriesImg 车系展示图
     */
    public void setSeriesImg(String seriesImg) {
        this.seriesImg = seriesImg == null ? null : seriesImg.trim();
    }
}