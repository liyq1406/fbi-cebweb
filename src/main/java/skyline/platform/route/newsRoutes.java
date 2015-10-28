package skyline.platform.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import skyline.platform.common.JsonTransformer;
import skyline.platform.repository.model.THrmImages;
import skyline.platform.repository.model.model_show.MyTHrmNewsAndDept;
import skyline.platform.service.NewsService;

import java.util.ArrayList;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by huzy on 2015/10/22.
 */
@Component
public class NewsRoutes implements RouteRegister{
    private static final Logger logger = LoggerFactory.getLogger(NewsRoutes.class);
    private static final String GET_INDEX_NEWS = "/platform/index/news";

    @Autowired
    private NewsService newsService;

    @Override
    public void regist() {
        //获得首页
        get(GET_INDEX_NEWS, (request, response) -> {
            List tHrmNews = new ArrayList();
            List<MyTHrmNewsAndDept> tHrmNewsAndDeptList =new ArrayList<MyTHrmNewsAndDept>();
            List<MyTHrmNewsAndDept> tHrmNewsImgList =new ArrayList<MyTHrmNewsAndDept>();
            List<THrmImages> tHrmImagesList = new ArrayList<THrmImages>();
                try {
                    //获得首页新闻
                    tHrmNewsAndDeptList = newsService.getNewsAndDeptForIndex();
                    //获得首页新闻图片
                    tHrmNewsImgList = newsService.getNewsImgForIndex();
                    //获得首页的图片
                    tHrmImagesList = newsService.getImagesFotIndex();
                    //把内容放到一个list里面
                    tHrmNews.add(0,tHrmNewsAndDeptList);
                    tHrmNews.add(1,tHrmNewsImgList);
                    tHrmNews.add(2,tHrmImagesList);
                logger.info(GET_METHOD);

            } catch (Exception e) {
                logger.error(POST_METHOD + ":" + e);
            }
            response.type("application/json");
            return tHrmNews;
        }, new JsonTransformer());



    }
}
