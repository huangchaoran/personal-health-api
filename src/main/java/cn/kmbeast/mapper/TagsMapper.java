package cn.kmbeast.mapper;
import cn.kmbeast.pojo.dto.query.extend.TagsQueryDto;
import cn.kmbeast.pojo.entity.Tags;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TagsMapper {
    void save(Tags tags);

  void batchDelete(@Param(value = "ids") List<Long> ids);

    void update(Tags tags);
    List<Long> query(TagsQueryDto tagsQueryDto);





}
