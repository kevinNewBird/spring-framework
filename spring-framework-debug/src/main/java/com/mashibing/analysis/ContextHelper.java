package com.mashibing.analysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  ContextHelper <BR>
 * <p>
 * author: zhao.song
 * date: created in 8:58  2021/10/29
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class ContextHelper {

    /**
     * description   使用配置文件或配置+注解结合的方式  <BR>
     *
     * @param oXMLName:
     * @return {@link ApplicationContext}
     * @author zhao.song  2021/12/11  21:59
     */
    public static ApplicationContext invokeCustomXML(String oXMLName) {
        return new ClassPathXmlApplicationContext(oXMLName);
    }

    /**
     * description   使用纯注解的方式  <BR>
     *
     * @param configurationClass:
     * @return {@link ApplicationContext}
     * @author zhao.song  2021/12/11  21:58
     */
    public static ApplicationContext invokeByAnnotation(Class<?> configurationClass) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(configurationClass);
        ac.refresh();
        return ac;
    }
}
