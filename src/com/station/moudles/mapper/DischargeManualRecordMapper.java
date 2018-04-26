/*
 * @ClassName DischargeManualRecordMapper
 * @Description 
 * @version 1.0
 * @Date 2018-04-10 10:01:22
 */
package com.station.moudles.mapper;

import com.station.moudles.entity.DischargeManualRecord;

public interface DischargeManualRecordMapper {
    /**
     * @Title deleteByPrimaryKey
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @Title insert
     * @param record
     * @return int
     */
    int insert(DischargeManualRecord record);

    /**
     * @Title insertSelective
     * @param record
     * @return int
     */
    int insertSelective(DischargeManualRecord record);

    /**
     * @Title selectByPrimaryKey
     * @param id
     * @return DischargeManualRecord
     */
    DischargeManualRecord selectByPrimaryKey(Integer id);

    /**
     * @Title updateByPrimaryKeySelective
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(DischargeManualRecord record);

    /**
     * @Title updateByPrimaryKey
     * @param record
     * @return int
     */
    int updateByPrimaryKey(DischargeManualRecord record);
}