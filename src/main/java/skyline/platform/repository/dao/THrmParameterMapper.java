package skyline.platform.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.platform.repository.model.THrmParameter;
import skyline.platform.repository.model.THrmParameterExample;

public interface THrmParameterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int countByExample(THrmParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int deleteByExample(THrmParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int insert(THrmParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int insertSelective(THrmParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    List<THrmParameter> selectByExample(THrmParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByExampleSelective(@Param("record") THrmParameter record, @Param("example") THrmParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_parameter
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    int updateByExample(@Param("record") THrmParameter record, @Param("example") THrmParameterExample example);
}