package io.pisceshub.muchat.server.common.vo.user;

import io.pisceshub.muchat.common.core.enums.ChatType;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author xiaochangbai
 * @date 2023-06-15 21:44
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatSessionInfoResp implements Serializable {


    /**
     * 对方的id：好友id或群id
     */
    private Long targetId;


    /**
     * 聊天类型
     */
    private ChatType chatType;

    /**
     * 好友昵称或群名称
     */
    private String name;


    /**
     * 头像
     */
    private String headImage;


    /**
     * 未读消息数量
     */
    private Long unReadCount;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatSessionInfoResp that = (ChatSessionInfoResp) o;
        return Objects.equals(targetId, that.targetId) && chatType == that.chatType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetId, chatType);
    }
}
