import encription.AES;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

public class AEStest {
    @Test
    public void test(){
        String ip = "123.156.148.121";
        //key预处理为16字节
        String key = StringUtils.rightPad(ip, 16);
        System.out.println("密钥："+key);

        String username = "souta1";
        System.out.println("明文:"+username);

        String encrypt = AES.encryptToBase64(username, key);
        System.out.println("加密后："+encrypt);
        String decrypt = AES.decryptFromBase64(encrypt, key);
        System.out.println("解密后："+decrypt);
    }
}
