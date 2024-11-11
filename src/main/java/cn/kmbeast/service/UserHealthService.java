package cn.kmbeast.service;

import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.UserHealthQueryDto;
import cn.kmbeast.pojo.entity.UserHealth;
import cn.kmbeast.pojo.vo.UserHealthVO;

import java.util.List;

public interface UserHealthService {
    Result<Void> save(UserHealth userHealth);
    Result<Void> update(UserHealth userHealth);
    Result<Void> batchDelete(List<Long> ids);
    Result<List<UserHealthVO>> query(UserHealthQueryDto userhealthQueryDto);
}
