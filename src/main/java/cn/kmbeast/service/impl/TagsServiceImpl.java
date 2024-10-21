package cn.kmbeast.service.impl;

import cn.kmbeast.mapper.TagsMapper;
import cn.kmbeast.pojo.api.ApiResult;
import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.TagsQueryDto;
import cn.kmbeast.pojo.entity.Tags;
import cn.kmbeast.service.TagsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标签业务逻辑实现层
 */
@Service
public class TagsServiceImpl implements TagsService {

@Resource
private TagsMapper tagsMapper;
    @Override
    public Result<Void> save(Tags tags) {
        tagsMapper.save(tags);
        return ApiResult.success();
    }

    @Override
    public Result<Void> batchDelete(List<Long> ids) {
        tagsMapper.batchDelete(ids);
        return ApiResult.success();
    }

    @Override
    public Result<Void> update(Tags tags) {
        tagsMapper.update(tags);
        return ApiResult.success();
    }

    @Override
    public Result<List<Tags>> query(TagsQueryDto tagsQueryDto) {
        tagsMapper.query(tagsQueryDto);
        return ApiResult.success();
    }
}
