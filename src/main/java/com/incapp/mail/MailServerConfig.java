package com.incapp.mail;

import java.util.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import lombok.Data;

//@Configuration
//@Data
public class MailServerConfig {

//
//    @Bean
//    public JavaMailSender mailSender(org.springframework.core.env.Environment env) {
//
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//
//        mailSender.setHost(env.getProperty("spring.mail.host"));
//        mailSender.setPort(Integer.parseInt(env.getProperty("spring.mail.port")));
//
//        mailSender.setUsername(env.getProperty("spring.mail.username"));
//        mailSender.setPassword(env.getProperty("spring.mail.password"));
//
//        Properties props = mailSender.getJavaMailProperties();
//        props.put("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.auth", env.getProperty("spring.mail.properties.mail.smtp.auth"));
//        props.put("mail.smtp.starttls.enable", env.getProperty("spring.mail.properties.mail.smtp.starttls.enable"));
//        props.put("mail.smtp.starttls.required", env.getProperty("spring.mail.properties.mail.smtp.starttls.required"));
//        props.put("mail.debug", "false");
//
//        return mailSender;
//    }
}
