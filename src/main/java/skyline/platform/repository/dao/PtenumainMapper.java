package skyline.platform.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import skyline.platform.repository.model.Ptenumain;
import skyline.platform.repository.model.PtenumainExample;

public interface PtenumainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int countByExample(PtenumainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int deleteByExample(PtenumainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int deleteByPrimaryKey(String enutype);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int insert(Ptenumain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int insertSelective(Ptenumain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    List<Ptenumain> selectByExample(PtenumainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    Ptenumain selectByPrimaryKey(String enutype);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int updateByExampleSelective(@Param("record") Ptenumain record, @Param("example") PtenumainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int updateByExample(@Param("record") Ptenumain record, @Param("example") PtenumainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int updateByPrimaryKeySelective(Ptenumain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PTENUMAIN
     *
     * @mbggenerated Tue Jun 23 18:13:29 CST 2015
     */
    int updateByPrimaryKey(Ptenumain record);
}