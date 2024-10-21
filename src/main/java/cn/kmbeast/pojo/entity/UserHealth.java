package cn.kmbeast.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserHealth {
    private Integer id;
    /**
     * 用户健康表的id
     */
    private Integer userId;
    /**
     * 建表的用户的id
     */
    private Integer healthModelConfigId;
    /**
     * 此用户健康表内的健康模型id
     */
    private String value;
    /**
     * 用户输入的值
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 用户建立此表的时间
     */
}
