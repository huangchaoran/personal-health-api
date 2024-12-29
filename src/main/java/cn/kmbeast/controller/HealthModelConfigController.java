package cn.kmbeast.controller;

import cn.kmbeast.aop.Pager;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.HealthModelConfigQueryDto;
import cn.kmbeast.pojo.entity.HealthModelConfig;
import cn.kmbeast.pojo.vo.ChartVO;
import cn.kmbeast.service.HealthModelConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 健康模型的 Controller
 */
@RestController
@RequestMapping(value = "/health-model-config")
public class HealthModelConfigController {

    @Resource
    private HealthModelConfigService healthModelConfigService;

    /**
     * 健康模型新增
     *
     * @param healthModelConfig 新增数据
     * @return Result<Void> 通用响应体
     */
    @PostMapping(value = "/save")
    public Result<Void> save(@RequestBody HealthModelConfig healthModelConfig) {
        return healthModelConfigService.save(healthModelConfig);
    }

    /**
     * 健康模型删除
     *
     * @param ids 要删除的健康模型ID列表
     * @return Result<Void> 通用响应体
     */
    @PostMapping(value = "/batchDelete")
    public Result<Void> batchDelete(@RequestBody List<Long> ids) {
        return healthModelConfigService.batchDelete(ids);
    }

    /**
     * 健康模型修改
     *
     * @param healthModelConfig 参数
     * @return Result<Void> 响应
     */
    @PutMapping(value = "/update")
    public Result<Void> update(@RequestBody HealthModelConfig healthModelConfig) {
        return healthModelConfigService.update(healthModelConfig);
    }



    /**
     * 健康模型查询
     *
     * @param healthModelConfigQueryDto 查询参数
     * @return Result<List < HealthModelConfig>> 通用响应
     */
    @Pager
    @PostMapping(value = "/query")
    public Result<List<HealthModelConfig>> query(@RequestBody HealthModelConfigQueryDto healthModelConfigQueryDto) {
        return healthModelConfigService.query(healthModelConfigQueryDto);
    }


}
