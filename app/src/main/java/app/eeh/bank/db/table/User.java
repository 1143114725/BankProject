package app.eeh.bank.db.table;

/**
 * @author EraJieZhang
 * @data 2021-2-15
 */

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class User {
    /**
     * 主键自增长
     */
    @Id(autoincrement = true)
    private Long id;
    /**
     * 用户名/账号
     */
    private String userId;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 绑定QQ
     */
    private String bindingQQ;
    /**
     * 绑定微信
     */
    private String bindingWeChat;
    /**
     * 绑定邮箱
     */
    private String bindingEmail;
    /**
     * 头像
     */
    private String headPortrait;
    /**
     * 个人信息
     */
    private String userMessage;
    /**
     * 是否可用 0 不可用  1   可用
     */
    private int enable;
    @Generated(hash = 1735045514)
    public User(Long id, String userId, String nickName, String passWord,
            String bindingQQ, String bindingWeChat, String bindingEmail,
            String headPortrait, String userMessage, int enable) {
        this.id = id;
        this.userId = userId;
        this.nickName = nickName;
        this.passWord = passWord;
        this.bindingQQ = bindingQQ;
        this.bindingWeChat = bindingWeChat;
        this.bindingEmail = bindingEmail;
        this.headPortrait = headPortrait;
        this.userMessage = userMessage;
        this.enable = enable;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserId() {
        return this.userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getNickName() {
        return this.nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getPassWord() {
        return this.passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getBindingQQ() {
        return this.bindingQQ;
    }
    public void setBindingQQ(String bindingQQ) {
        this.bindingQQ = bindingQQ;
    }
    public String getBindingWeChat() {
        return this.bindingWeChat;
    }
    public void setBindingWeChat(String bindingWeChat) {
        this.bindingWeChat = bindingWeChat;
    }
    public String getBindingEmail() {
        return this.bindingEmail;
    }
    public void setBindingEmail(String bindingEmail) {
        this.bindingEmail = bindingEmail;
    }
    public String getHeadPortrait() {
        return this.headPortrait;
    }
    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }
    public String getUserMessage() {
        return this.userMessage;
    }
    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
    public int getEnable() {
        return this.enable;
    }
    public void setEnable(int enable) {
        this.enable = enable;
    }


}