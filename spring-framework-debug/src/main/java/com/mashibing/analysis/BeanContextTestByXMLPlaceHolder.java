package com.mashibing.analysis;

import com.mashibing.analysis.selfConverter.MyGenericConverter;
import com.mashibing.analysis.selfConverter.Student;
import com.mashibing.analysis.selfeditor.Customer;
import com.mashibing.analysis.selftag.User;
import extension.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.List;

/**
 * description  ctrl+alt+o 快速清除无效的导入import <BR>
 * <p>
 * author: zhao.song
 * date: created in 21:33  2021/8/22
 * company: TRS信息技术有限公司
 * version 1.0
 */
public class BeanContextTestByXMLPlaceHolder {

	public static void main(String[] args) throws NoSuchFieldException {
		// 1.自定义标签解析
		validateCustomTagLoading();

		// 2.自定义属性编辑器
//		validateCustomPropertyEditorLoading();

		// 3.自定义Aware
//		validateCustomAware();

		// 4.复杂的转换器ConversionService(暂未解决)
//		complexConverterByConversionService();
	}

	// 验证:自定义标签解析
	private static void validateCustomTagLoading() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
//		ApplicationContext ac = new MyClassPathXmlApplicationContext("spring-${username}.xml");
		User oUser = (User) ac.getBean("msb");
		System.out.println(oUser);
	}

	// 验证:自定义属性编辑器
	private static void validateCustomPropertyEditorLoading() {
		ApplicationContext ac2 = new ClassPathXmlApplicationContext("selfeditor.xml");
		Customer cus = ac2.getBean(Customer.class);
		System.out.println(cus);
		System.out.println(cus.myAware);
	}

	// 验证:自定义Aware
	private static void validateCustomAware() {
		ApplicationContext ac2 = new MyClassPathXmlApplicationContext("selfeditor.xml");
		Customer cus = ac2.getBean(Customer.class);
		System.out.println(cus);
		System.out.println(cus.myAware);
	}

	// 验证: conversionService(一些小bug, 暂未处理完成)
	@Deprecated
	private static void complexConverterByConversionService() throws NoSuchFieldException {
		DefaultConversionService conversionService = new DefaultConversionService();
		conversionService.addConverter(new MyGenericConverter());

		Student student = new Student();
		student.setName("1:2");

//		List<String> list = (List<String>) conversionService.convert(student.getName(), new TypeDescriptor(Student.class.getDeclaredField("name"))
//				, new TypeDescriptor(ResolvableType.forRawClass(List.class),String.class,null));
//		System.out.println(list.toString());
	}
}
