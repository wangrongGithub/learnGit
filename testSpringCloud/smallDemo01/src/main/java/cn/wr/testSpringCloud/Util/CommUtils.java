package cn.wr.testSpringCloud.Util;

import javax.servlet.http.HttpServletResponse;

/**
 * @author wangrong.lucky
 * @description 收费周期
 * @email wangrong.lucky@bytedance.com
 * @date 2020/7/19$
 **/
public class CommUtils {

    // JSON格式化
    public static String printDataJason(HttpServletResponse response,
                                        Object item) {
        try {

            JsonUtils.renderString(response, item);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 随机生成6位随机验证码
     *
     */
    public static String createRandomVcode(int len) {
        // 验证码
        String vcode = "";
        for (int i = 0; i < len; i++) {
            vcode = vcode + (int) (Math.random() * 9);
        }
        return vcode;
    }
}
