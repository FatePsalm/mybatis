package cn.dingd.dd.biz.backgroud.dao;

import cn.dingd.dd.common.entity.CarSeries;
import cn.dingd.dd.common.entity.CarSeriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarSeriesMapper {
    /**
     *
     * @mbggenerated 2018-06-19
     */
    int countByExample(CarSeriesExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int deleteByExample(CarSeriesExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int insert(CarSeries record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int insertSelective(CarSeries record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    List<CarSeries> selectByExample(CarSeriesExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    CarSeries selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExampleSelective(@Param("record") CarSeries record, @Param("example") CarSeriesExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExample(@Param("record") CarSeries record, @Param("example") CarSeriesExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKeySelective(CarSeries record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKey(CarSeries record);
}