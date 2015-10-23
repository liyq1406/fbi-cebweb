package skyline.platform.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.platform.repository.model.THrmBranchDept;
import skyline.platform.repository.model.THrmBranchDeptExample;

public interface THrmBranchDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    int countByExample(THrmBranchDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    int deleteByExample(THrmBranchDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    int insert(THrmBranchDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    int insertSelective(THrmBranchDept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    List<THrmBranchDept> selectByExample(THrmBranchDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    int updateByExampleSelective(@Param("record") THrmBranchDept record, @Param("example") THrmBranchDeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_hrm_branch_dept
     *
     * @mbggenerated Thu Oct 22 15:53:55 CST 2015
     */
    int updateByExample(@Param("record") THrmBranchDept record, @Param("example") THrmBranchDeptExample example);
}