package cn.kmbeast.pojo.vo;

import cn.kmbeast.pojo.entity.News;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NewsVO extends News {
    private String tagName;
}