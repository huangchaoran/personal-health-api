package cn.kmbeast.service.impl;

import cn.kmbeast.context.LocalThreadHolder;
import cn.kmbeast.mapper.HealthModelConfigMapper;
import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.PageResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.base.QueryDto;
import cn.kmbeast.pojo.dto.query.extend.HealthModelConfigQueryDto;
import cn.kmbeast.pojo.dto.query.extend.UserQueryDto;
import cn.kmbeast.pojo.em.RoleEnum;
import cn.kmbeast.pojo.entity.HealthModelConfig;
import cn.kmbeast.pojo.entity.User;
import cn.kmbeast.pojo.vo.ChartVO;
import cn.kmbeast.service.HealthModelConfigService;
import cn.kmbeast.utils.DateUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 健康资讯业务逻辑实现
 */
@Service
public class HealthModelConfigServiceImpl implements HealthModelConfigService {

    @Resource
    private HealthModelConfigMapper healthModelConfigMapper;

    /**
     * 健康资讯新增
     *
     * @param healthModelConfig 参数
     * @return Result<Void>
     */
    @Override
    public Result<Void> save(HealthModelConfig healthModelConfig) {
        healthModelConfigMapper.save(healthModelConfig);
        return ApiResult.success();
    }

    /**
     * 健康资讯删除
     *
     * @param ids 参数
     * @return Result<Void>
     */
    @Override
    public Result<Void> batchDelete(List<Long> ids) {
        healthModelConfigMapper.batchDelete(ids);
        return ApiResult.success();
    }

    /**
     * 健康资讯修改
     *
     * @param healthModelConfig 参数
     * @return Result<Void>
     */
    @Override
    public Result<Void> update(HealthModelConfig healthModelConfig) {
        healthModelConfigMapper.update(healthModelConfig);
        return ApiResult.success();
    }

    /**
     * 健康资讯查询
     *
     * @param healthModelConfigQueryDto 查询参数
     * @return Result<List < HealthModelConfig>>
     */
    @Override
    public Result<List<HealthModelConfig>> query(HealthModelConfigQueryDto healthModelConfigQueryDto) {
        List<HealthModelConfig> NewsList;
        if (LocalThreadHolder.getRoleId().equals(RoleEnum.ADMIN.getRole())) {
            NewsList = healthModelConfigMapper.queryAdmin(healthModelConfigQueryDto);
        } else {
            NewsList = healthModelConfigMapper.query(healthModelConfigQueryDto);
        }
        Integer totalCount = healthModelConfigMapper.queryCount(healthModelConfigQueryDto);
        return PageResult.success(NewsList, totalCount);
    }

}
