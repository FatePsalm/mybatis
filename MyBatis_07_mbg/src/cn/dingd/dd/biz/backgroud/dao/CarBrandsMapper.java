package cn.dingd.dd.biz.backgroud.dao;

import cn.dingd.dd.common.entity.CarBrands;
import cn.dingd.dd.common.entity.CarBrandsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarBrandsMapper {
    /**
     *
     * @mbggenerated 2018-06-19
     */
    int countByExample(CarBrandsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int deleteByExample(CarBrandsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int insert(CarBrands record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int insertSelective(CarBrands record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    List<CarBrands> selectByExample(CarBrandsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    CarBrands selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExampleSelective(@Param("record") CarBrands record, @Param("example") CarBrandsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExample(@Param("record") CarBrands record, @Param("example") CarBrandsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKeySelective(CarBrands record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKey(CarBrands record);
}