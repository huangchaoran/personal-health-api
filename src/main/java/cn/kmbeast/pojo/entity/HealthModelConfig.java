package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//健康模型
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class HealthModelConfig {

    private Integer id;/*模型表的主键*/
    private Integer userId;/*用户id*/
    private String name;/*用户姓名*/
    private String detail;/*图标*/
    private String cover;/*封面*/
    private String unit;/*单位*/
    private String symbol;/*模型*/
    private String valueRange;/*正常范围*/
}
