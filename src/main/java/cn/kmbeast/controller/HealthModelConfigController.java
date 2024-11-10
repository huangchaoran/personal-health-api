package cn.kmbeast.controller;

import cn.kmbeast.aop.Pager;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.HealthModelConfigQueryDto;
import cn.kmbeast.pojo.entity.HealthModelConfig;
import cn.kmbeast.service.HealthModelConfigService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/healthModelConfig")
public class HealthModelConfigController {
    @Resource
    private HealthModelConfigService healthModelConfigService;

    @RequestMapping(value = "/save")
    public Result<Void> save(@RequestBody HealthModelConfig healthModelConfig) {
        return healthModelConfigService.save(healthModelConfig);
    }
    @RequestMapping(value = "batchDelete")
    public Result<Void> batchDelete(@RequestBody List<Long> ids) {
        return healthModelConfigService.batchDelete(ids);
    }
    @RequestMapping(value = "/update")
    public Result<Void> update(@RequestBody HealthModelConfig healthModelConfig) {
        return healthModelConfigService.update(healthModelConfig);
    }
    @Pager
    @PostMapping(value = "/query")
    public Result<List<HealthModelConfig>> query(@RequestBody HealthModelConfigQueryDto healthModelConfigQueryDto) {
        return healthModelConfigService.query(healthModelConfigQueryDto);
    }
    }

