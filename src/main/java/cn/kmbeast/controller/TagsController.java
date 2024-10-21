package cn.kmbeast.controller;

import cn.kmbeast.pojo.api.Result;
import cn.kmbeast.pojo.dto.query.extend.TagsQueryDto;
import cn.kmbeast.pojo.entity.Tags;
import cn.kmbeast.service.TagsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 标签的controller控制层
 */
@RestController
@RequestMapping(value = "/Tags")
public class TagsController {
    @Resource
    private TagsService tagsService;
    /**
     * 将新增操作路由至/save
     *
     * @param tags 新增Tag
     * @return 响应体
     */
    @PostMapping(value = "/save")
    public Result<Void> save(@RequestBody Tags tags) {
        return tagsService.save(tags);
    }
    /**
     *
     * @param ids 批量删除的列表id
     * @return 响应体
     */
    @PostMapping(value = "/batchDelete")
    public Result<Void> batchDelete(@RequestBody List<Long>ids) {
        return tagsService.batchDelete(ids);
    }

    /**
     *
     * @param tags 要更新的Tag
     * @return 响应实体
     */
    @PostMapping(value = "/update")
    public Result<Void> update(@RequestBody Tags tags) {
        return tagsService.update(tags);
    }

    /**
     *
     * @param tagsQueryDto 查询条件（查询参数）
     * @return 查询结果 Tag集合
     */
    @PostMapping(value = "/query")
    public Result<List<Tags>> query(@RequestBody TagsQueryDto tagsQueryDto) {
        return tagsService.query(tagsQueryDto);
    }
}
