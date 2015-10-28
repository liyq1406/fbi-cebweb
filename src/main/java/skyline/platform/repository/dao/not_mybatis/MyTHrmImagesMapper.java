package skyline.platform.repository.dao.not_mybatis;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import skyline.platform.repository.model.THrmImages;

import java.util.List;

@Component
public interface MyTHrmImagesMapper {
    @Select(" select * from (\n" +
            "  select *,row_number() over(partition by position order by createdTime desc) as rn from t_hrm_images\n" +
            ") as a where rn<=4 AND dept_id='000000' AND isenable ='1' ")
    List<THrmImages> getImagesFotIndex();


}