package cn.kmbeast.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javafx.scene.text.Text;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class News {
    private Integer id;
    /**
     * 健康咨询表的主键
     */
    private String name;
    /**
     * 咨询文章的标题
     */
    private String content;
    /**
     * 咨询的内容
     */
    private Integer tagId;
    /**
     * 咨询的id
     */
    private String cover;
    /**
     * 咨询的封面
     */
    private String readerIds;
    /**
     * 阅读者的id列表以“,”连接
     */
    private boolean isTop;
    /**
     * 是否推荐是的话为1不是的话为0
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 咨询文章发送到时间
     */

}
