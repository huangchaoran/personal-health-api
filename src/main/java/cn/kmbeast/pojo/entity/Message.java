package cn.kmbeast.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Message {
    private Integer id;
    /**
     * 消息表的主键
     */
    private String content;
    /**
     * 消息的内容
     */
    private Integer messageType;
    /**
     * 消息的类型
     */
    private Integer receiverID;
    /**
     * 接受者的id
     */
    private Integer senderID;
    /**
     * 发送者的id
     */
    private boolean isRead;
    /**
     * 是否已读
     * 已读为1
     * 未读为0
     */
    private Integer contentID;
    /**
     * 内容id（被评论，评论被点赞）
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
    /**
     * 消息的发送时间
     */

}
