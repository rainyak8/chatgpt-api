package cn.rainyak.chatgpt.application;

/**
 * 微信验证服务
 */
public interface IWeiXinValidateService {

    boolean checkSign(String signature, String timestamp, String nonce);

}
