/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2012-2023. All rights reserved.
 */

package org.alking.example.spring;

import org.alking.example.spring.beans.PetStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main
 *
 * @author s30025793
 * @since 2023/10/20
 */
public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("main...");

        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        PetStore petStore = context.getBean(PetStore.class);
        String name = petStore.getName();
        logger.info("petStore:{}, {}", petStore, name);
    }

}
