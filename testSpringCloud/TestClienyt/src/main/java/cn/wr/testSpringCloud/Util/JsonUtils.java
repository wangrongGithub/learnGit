package cn.wr.testSpringCloud.Util;


import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangrong.lucky
 * @description 收费周期
 * @email wangrong.lucky@bytedance.com
 * @date 2020/7/19$
 **/
public class JsonUtils {
    public JsonUtils() {
    }

    public static String renderString(HttpServletResponse response, Object object) {
        return renderString(response, JsonMapper.toJsonString(object), "application/json");
    }

    public static String renderString(HttpServletResponse response, String string, String type) {
        try {
            response.setContentType(type);
            response.setCharacterEncoding("utf-8");
            response.getWriter().print(string);
            return null;
        } catch (IOException var4) {
            return null;
        }
    }
}
