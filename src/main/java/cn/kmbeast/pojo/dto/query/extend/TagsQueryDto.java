package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class TagsQueryDto extends QueryDto {
    /**
     * 将标签名传进来进行模糊查询
     */
    private String name;

}
