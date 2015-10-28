package skyline.platform.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.platform.repository.model.THrmDeptTeam;
import skyline.platform.repository.model.THrmDeptTeamExample;

public interface THrmDeptTeamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    int countByExample(THrmDeptTeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    int deleteByExample(THrmDeptTeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    int insert(THrmDeptTeam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    int insertSelective(THrmDeptTeam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    List<THrmDeptTeam> selectByExample(THrmDeptTeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    int updateByExampleSelective(@Param("record") THrmDeptTeam record, @Param("example") THrmDeptTeamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_dept_team
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    int updateByExample(@Param("record") THrmDeptTeam record, @Param("example") THrmDeptTeamExample example);
}