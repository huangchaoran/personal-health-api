package cn.kmbeast.pojo.dto.query.extend;

import cn.kmbeast.pojo.dto.query.base.QueryDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class HealthModelConfigQueryDto extends QueryDto {
    private  Integer userId;
    /**
     * 用户ID
     */
    private String name;
    /**
     * 用户创建的模型的名称
     */
    private String detail;
    /**
     * 用户配置模型的简介
     */
    private String unit;
    /**
     * 用户配置模型的单位
     */
    private String symbol;
    /**
     * 用户模型的符号
     */
}
