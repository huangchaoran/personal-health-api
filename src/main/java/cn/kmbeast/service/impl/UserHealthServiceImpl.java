package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.UserHealthMapper;
import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.UserHealthQueryDto;
import cn.kmbeast.pojo.entity.UserHealth;
import cn.kmbeast.pojo.vo.UserHealthVO;
import cn.kmbeast.service.UserHealthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserHealthServiceImpl implements UserHealthService {
@Resource
private UserHealthMapper userHealthMapper;
    @Override
    public Result<Void> save(UserHealth userHealth) {
        userHealthMapper.save(userHealth);
        return ApiResult.success();
    }

    @Override
    public Result<Void> update(UserHealth userHealth) {
        userHealthMapper.update(userHealth);
        return ApiResult.success();
    }

    @Override
    public Result<Void> batchDelete(List<Long> ids) {
        userHealthMapper.batchDelete(ids);
        return ApiResult.success();
    }

    @Override
    public Result<List<UserHealthVO>> query(UserHealthQueryDto userhealthQueryDto) {
      List<UserHealthVO> userHealthList = userHealthMapper.query(userhealthQueryDto);
      Integer total = userHealthMapper.queryCount(userhealthQueryDto);
        return ApiResult.success(userHealthList, total);
        /**
         * Result<Void>和 Result<<List<UserHealthVO>>的区别
         * Result<Void>为不返回数据的响应基类,将后端返回给结果同意包装成状态码（404等等）和消息（“操作失败”），
         * 并不需要返回给前端数据，如进行插入，删除，更新请求时，只需要知道操作成功与否（即状态码和消息）
         * 不需要后端再返回数据给前端
         *
         * Result<<List<UserHealthVO>>为返回数据的响应基类，如前端发送查询请求时，后端不仅要返回查询的操作成功与否有还要
         * 将符合条件的数据返回给前端，即将元素为UserHealthVO（将符合条件的数据包装成一条UserHealthVO类）的
         * List<<List<UserHealthVO>>(所有符合条件数据包装成一条条UserHealthVO类组成的列表)
         **/
    }
}


