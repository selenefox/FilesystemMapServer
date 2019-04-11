package com.sevilinma.fsms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.sevilinma.fsms.controller","com.sevilinma.fsms.manager","com.sevilinma.fsms.dao","com.sevilinma.fsms.server"})
@SpringBootApplication
public class FSMSCore extends SpringBootServletInitializer {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(FSMSCore.class);
        SpringApplication.run(FSMSCore.class, args);
        logger.info("********STARTING SUCCESS********");
    }
}
