package skyline.platform.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import skyline.platform.common.JsonTransformer;

import static spark.Spark.get;
import static spark.Spark.post;

/**
 * Created by huzy on 2015/10/22.
 */
@Component
public class NewsRoutes implements RouteRegister{
    private static final Logger logger = LoggerFactory.getLogger(NewsRoutes.class);
    private static final String GET_INDEX_NEWS = "/platform/index/news";

    @Override
    public void regist() {
        get(GET_INDEX_NEWS, (request, response) -> {

            try {
                logger.info(POST_METHOD);

            } catch (Exception e) {
//                大都会人寿  倍如意
                logger.error(POST_METHOD + ":" + e);
            }
            response.type("application/json");
            return null;
        }, new JsonTransformer());
    }
}
