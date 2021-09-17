package extension;

import com.mashibing.analysis.selfaware.MyAwareProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description  MyClassPathXmlApplicationContext <BR>
 * <p>
 * author: zhao.song
 * date: created in 15:32  2021/8/25
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String... configLocations) {
		super(configLocations);

	}

	@Override
	protected void initPropertySources() {
		System.out.println("set required properties : username");
		getEnvironment().setRequiredProperties("username");
//		getEnvironment().validateRequiredProperties();
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
//		super.setAllowBeanDefinitionOverriding(false);
//		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
		// 添加自定义的BeanFactoryPostProcessor,或者通过xml的方式
//		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
//		super.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
		// 自定义自己的Aware处理器(继承BeanPostProcessor)
		beanFactory.addBeanPostProcessor(new MyAwareProcessor());
	}


	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.postProcessBeanFactory(beanFactory);
		System.out.println("扩展实现postProcessBeanFactory");
	}
}
