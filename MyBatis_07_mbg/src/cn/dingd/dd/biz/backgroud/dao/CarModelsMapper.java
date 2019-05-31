package cn.dingd.dd.biz.backgroud.dao;

import cn.dingd.dd.common.entity.CarModels;
import cn.dingd.dd.common.entity.CarModelsExample;
import cn.dingd.dd.common.entity.CarModelsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarModelsMapper {
    /**
     *
     * @mbggenerated 2018-06-19
     */
    int countByExample(CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int deleteByExample(CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int insert(CarModelsWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int insertSelective(CarModelsWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    List<CarModelsWithBLOBs> selectByExampleWithBLOBs(CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    List<CarModels> selectByExample(CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    CarModelsWithBLOBs selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExampleSelective(@Param("record") CarModelsWithBLOBs record, @Param("example") CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExampleWithBLOBs(@Param("record") CarModelsWithBLOBs record, @Param("example") CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByExample(@Param("record") CarModels record, @Param("example") CarModelsExample example);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKeySelective(CarModelsWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKeyWithBLOBs(CarModelsWithBLOBs record);

    /**
     *
     * @mbggenerated 2018-06-19
     */
    int updateByPrimaryKey(CarModels record);
}