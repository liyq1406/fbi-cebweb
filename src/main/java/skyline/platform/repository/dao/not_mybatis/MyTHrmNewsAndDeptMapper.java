package skyline.platform.repository.dao.not_mybatis;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import skyline.platform.repository.model.model_show.MyTHrmNewsAndDept;
import java.util.List;

@Component
public interface MyTHrmNewsAndDeptMapper {
    //首页上的新闻查询
    @Select("select top(8) * from t_hrm_news ")
    List<MyTHrmNewsAndDept> getNewsAndDeptForIndex();

}