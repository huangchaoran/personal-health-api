package cn.kmbeast.pojo.vo;

import cn.kmbeast.pojo.entity.UserHealth;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserHealthVO extends UserHealth {
    private String userName;
    private String name;
    private String unit;
    private String symbol;
    private String valueRange;

}
