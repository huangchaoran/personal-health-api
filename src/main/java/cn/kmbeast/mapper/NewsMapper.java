package cn.kmbeast.mapper;

import cn.kmbeast.pojo.dto.query.extend.NewsQueryDto;
import cn.kmbeast.pojo.entity.News;
import cn.kmbeast.pojo.vo.NewsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NewsMapper {

        void save(News news);

        void update(News news);

        void batchDelete(@Param(value = "ids") List<Long> ids);

        List<NewsVO> query(NewsQueryDto newsQueryDto);

        Integer queryCount(NewsQueryDto newsQueryDto);
}

