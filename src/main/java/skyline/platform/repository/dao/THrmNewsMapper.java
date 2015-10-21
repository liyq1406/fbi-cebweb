package skyline.platform.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.platform.repository.model.THrmNews;
import skyline.platform.repository.model.THrmNewsExample;
import skyline.platform.repository.model.THrmNewsWithBLOBs;

public interface THrmNewsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int countByExample(THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int deleteByExample(THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int deleteByPrimaryKey(byte[] id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int insert(THrmNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int insertSelective(THrmNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    List<THrmNewsWithBLOBs> selectByExampleWithBLOBs(THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    List<THrmNews> selectByExample(THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    THrmNewsWithBLOBs selectByPrimaryKey(byte[] id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByExampleSelective(@Param("record") THrmNewsWithBLOBs record, @Param("example") THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") THrmNewsWithBLOBs record, @Param("example") THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByExample(@Param("record") THrmNews record, @Param("example") THrmNewsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByPrimaryKeySelective(THrmNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(THrmNewsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_news
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByPrimaryKey(THrmNews record);
}