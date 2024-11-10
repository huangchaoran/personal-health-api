package cn.kmbeast.service;

import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.HealthModelConfigQueryDto;
import cn.kmbeast.pojo.entity.HealthModelConfig;

import java.util.List;

public interface HealthModelConfigService {
    Result<Void> save(HealthModelConfig healthModelConfig);

    Result<Void> update(HealthModelConfig healthModelConfig);

    Result<Void> batchDelete(List<Long> ids);

    Result<List<HealthModelConfig>> query(HealthModelConfigQueryDto healthModelConfigQueryDto);
}
