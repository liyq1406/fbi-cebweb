package skyline.platform.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import skyline.platform.repository.dao.not_mybatis.MyTHrmNewsAndDeptMapper;
import skyline.platform.repository.model.model_show.MyTHrmNewsAndDept;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/10/23.
 */
@Service
public class NewsService {
    private static final Logger logger = LoggerFactory.getLogger(NewsService.class);

    @Resource
    private MyTHrmNewsAndDeptMapper myTHrmNewsAndDeptMapper;

    public List<MyTHrmNewsAndDept> getNewsAndDeptForIndex(int pageNo,int PageSize){
        try {
            return myTHrmNewsAndDeptMapper.getNewsAndDeptForIndex();
        } catch (Exception e) {
            logger.error(this.getClass().getName()+":"+e.toString());
            return null;
        }

    }

}
