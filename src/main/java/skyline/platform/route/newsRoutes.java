package skyline.platform.route;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import skyline.platform.common.JsonTransformer;

import java.text.SimpleDateFormat;
import java.util.*;

import static spark.Spark.get;

/**
 * Created by huzy on 2015/10/22.
 */
@Component
public class newsRoutes implements RouteRegister{
    private static final Logger logger = LoggerFactory.getLogger(newsRoutes.class);
    private static final String GET_INDEX_NEWS = "/index/news";

    @Override
    public void regist() {
        get(GET_INDEX_NEWS, (request, response) -> {
            System.out.print("------÷¥––¡À----------");
            return null;
            //response.type("application/json");
        }, new JsonTransformer());
    }
}
