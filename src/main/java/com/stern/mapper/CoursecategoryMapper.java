package com.stern.mapper;

import com.stern.pojo.Coursecategory;
import com.stern.pojo.CoursecategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 课程类型 -数据访问层
 */
@Component
public interface CoursecategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    long countByExample(CoursecategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int deleteByExample(CoursecategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer cateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int insert(Coursecategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int insertSelective(Coursecategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    List<Coursecategory> selectByExample(CoursecategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    Coursecategory selectByPrimaryKey(Integer cateId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Coursecategory record, @Param("example") CoursecategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Coursecategory record, @Param("example") CoursecategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Coursecategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table coursecategory
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Coursecategory record);
}