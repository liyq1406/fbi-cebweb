package skyline.platform.repository.dao.not_mybatis;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import skyline.platform.repository.model.THrmNews;
import skyline.platform.repository.model.model_show.MyTHrmNewsAndDept;
import java.util.List;

@Component
public interface MyTHrmNewsAndDeptMapper {
    //首页上的新闻查询
    List<MyTHrmNewsAndDept> getNewsAndDeptForIndex(String nowDate);
    //首页上的新闻图片
    List<MyTHrmNewsAndDept> getNewsImgForIndex();

}