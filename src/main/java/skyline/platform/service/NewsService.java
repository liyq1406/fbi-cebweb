package skyline.platform.service;


import org.apache.taglibs.standard.tag.common.xml.ForEachTag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import skyline.platform.repository.dao.THrmNewsMapper;
import skyline.platform.repository.dao.not_mybatis.MyTHrmImagesMapper;
import skyline.platform.repository.dao.not_mybatis.MyTHrmNewsAndDeptMapper;
import skyline.platform.repository.model.THrmImages;
import skyline.platform.repository.model.THrmNews;
import skyline.platform.repository.model.model_show.MyTHrmNewsAndDept;


import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2015/10/23.
 */
@Service
public class NewsService {
    private static final Logger logger = LoggerFactory.getLogger(NewsService.class);

    @Resource
    private MyTHrmNewsAndDeptMapper myTHrmNewsAndDeptMapper;
    @Resource
    private MyTHrmImagesMapper myTHrmImagesMapper;
    //获得新闻
    public List<MyTHrmNewsAndDept> getNewsAndDeptForIndex(){
        try {
            return myTHrmNewsAndDeptMapper.getNewsAndDeptForIndex(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        } catch (Exception e) {
            logger.error(this.getClass().getName()+"-->getNewsAndDeptForIndex:"+e.toString());
            return null;
        }
    }
    //获得图片新闻
    public List<MyTHrmNewsAndDept> getNewsImgForIndex(){
        try {
            return myTHrmNewsAndDeptMapper.getNewsImgForIndex();
        } catch (Exception e) {
            logger.error(this.getClass().getName()+"-->getNewsImgForIndex:"+e.toString());
            return null;
        }
    }
    //获得首页上的图片
    public List<THrmImages> getImagesFotIndex(){
        try {
            List<THrmImages> imageList = new ArrayList<THrmImages>();
            List<THrmImages> imageList1 = new ArrayList<THrmImages>();
            List<THrmImages> imageList2 = new ArrayList<THrmImages>();
            List<THrmImages> imageList3 = new ArrayList<THrmImages>();
            List<THrmImages> imageList4 = new ArrayList<THrmImages>();
            imageList = myTHrmImagesMapper.getImagesFotIndex();
            int len = imageList.size();
            if(len>0){
                for (int i = 0; i <len ; i++) {
                    if ("1".equals(imageList.get(i).getPosition())) {
                        imageList1.add(imageList.get(i));
                    } else if ("2".equals(imageList.get(i).getPosition())) {
                        imageList2.add(imageList.get(i));
                    } else if ("3".equals(imageList.get(i).getPosition())) {
                        imageList3.add(imageList.get(i));
                    } else if ("4".equals(imageList.get(i).getPosition())) {
                        imageList4.add(imageList.get(i));
                    }
                }
                imageList2.add(imageList1.get(0));
                imageList2.add(imageList3.get(0));
                imageList2.add(imageList4.get(0));
            }else{
                return null;
            }

            return imageList2;
        } catch (Exception e) {
            logger.error(this.getClass().getName()+"-->getImagesFotIndex:"+e.toString());
            return null;
        }
    }
}
