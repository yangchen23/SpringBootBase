package com.atguigu.task;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class SpringBoot14TaskApplicationTests {

    @Resource
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        //邮件设置
        message.setSubject("通知-今晚开会");
        message.setText("今晚7:30开会");
        message.setTo("18395478393@163.com");
        message.setFrom("279781635@qq.com");
        mailSender.send(message);
    }

    @Test
    public void test02() throws MessagingException {
        //1、创建一个复杂的消息邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        //邮件设置
        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天8点开会</b>",true);
        helper.setTo("18395478393@163.com");
        helper.setFrom("279781635@qq.com");

        //上传文件
        helper.addAttachment("壁纸1.jpg",new File("C:\\Users\\18395\\Pictures\\Saved Pictures\\壁纸1.jpg"));
        helper.addAttachment("壁纸2.jpg",new File("C:\\Users\\18395\\Pictures\\Saved Pictures\\壁纸2.jpg"));

        mailSender.send(mimeMessage);
    }

}
