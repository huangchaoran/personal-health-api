package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.HealthModelConfigQueryDto;
import cn.kmbeast.pojo.entity.HealthModelConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HealthModelConfigMapper {

    void save(HealthModelConfig healthModelConfig);

    void update(HealthModelConfig healthModelConfig);

    void batchDelete(@Param(value = "ids") List<Long> ids);

    List<HealthModelConfig> queryAdmin(HealthModelConfigQueryDto healthModelConfigQueryDto);

    List<HealthModelConfig> query(HealthModelConfigQueryDto healthModelConfigQueryDto);

    Integer queryCount(HealthModelConfigQueryDto healthModelConfigQueryDto);

}
