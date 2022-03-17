package com.zhou.spring.demo.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Classname MyBeanFactoryProcessor
 * @Description
 * @Date 2022/3/6 21:30
 * @Created by zhou
 */
@Configuration
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Autowired
	private MyTestConfig config;

	public MyBeanFactoryProcessor() {
		System.out.println("MyBeanFactoryProcessor noConstructor");
	}

	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println(" postProcessBeanFactory ");
		BeanDefinition test = beanFactory.getBeanDefinition("test");
		MutablePropertyValues pv = test.getPropertyValues();
		System.out.println("attribute :"+pv);
		if(pv.contains("age")){
			pv.addPropertyValue("age",25);
		}
	}
}
