package cn.rainyak.chatgpt.domain.security.model.vo;

import org.apache.shiro.authc.AuthenticationToken;
// 用来存放领域模型的信息，这里是Token 的对象信息，可以设置用户ID、用户密码
public class JwtToken implements AuthenticationToken {
    private String jwt;
    public JwtToken(String jwt) {
        this.jwt = jwt;
    }
    /**
     * 等同于账户
     */
    @Override
    public Object getPrincipal() {
        return jwt;
    }
    /**
     * 等同于密码
     */
    @Override
    public Object getCredentials() {
        return jwt;
    }
}
