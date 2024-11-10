package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.HealthModelConfigMapper;
import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.PageResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.HealthModelConfigQueryDto;
import cn.kmbeast.pojo.entity.HealthModelConfig;
import cn.kmbeast.service.HealthModelConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HealthModelConfigServiceImpl implements HealthModelConfigService {
@Resource
  private HealthModelConfigMapper healthModelConfigMapper;

    @Override
    public Result<Void> save(HealthModelConfig healthModelConfig) {
        healthModelConfigMapper.save(healthModelConfig);
        return ApiResult.success();
    }

    @Override
    public Result<Void> update(HealthModelConfig healthModelConfig) {
        healthModelConfigMapper.update(healthModelConfig);
       return ApiResult.success();
    }

    @Override
    public Result<Void> batchDelete(List<Long> ids) {
        healthModelConfigMapper.batchDelete(ids);
        return ApiResult.success();
    }

    @Override
    public Result<List<HealthModelConfig>> query(HealthModelConfigQueryDto healthModelConfigQueryDto) {
        List<HealthModelConfig> healthModelConfigList=healthModelConfigMapper.query(healthModelConfigQueryDto);
        Integer totalCount=healthModelConfigMapper.queryCount(healthModelConfigQueryDto);
        return PageResult.success(healthModelConfigList,totalCount);
    }

}
