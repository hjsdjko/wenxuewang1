package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshuoOrderEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 小说购买 服务类
 */
public interface XiaoshuoOrderService extends IService<XiaoshuoOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}