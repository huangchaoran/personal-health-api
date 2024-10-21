package cn.kmbeast.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Tags {

    private Integer id;
    /**
     * tag的id
     */
    private String name;
    /**
     * tag的名字
     */
}

