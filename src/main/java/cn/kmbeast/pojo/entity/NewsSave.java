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

public class NewsSave {
    private Integer id;
    /**
     * 咨询文章收藏的主键id
     */
    private Integer userId;
    /**‘
     * 收藏用户的id
     */
    private Integer newsId;
    /**
     * 被收藏文章的id
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 咨询文章收藏的时间
     */

}
