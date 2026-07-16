package org.alking.example.spring.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(InstantiationTracingBeanPostProcessor.class);


    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        LOGGER.info("postProcessBeforeInitialization {}, {}", beanName, bean);
        return bean; // we could potentially return any object reference here...
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) {
        LOGGER.info("postProcessAfterInitialization {}, {}", beanName, bean);
        return bean;
    }
}
