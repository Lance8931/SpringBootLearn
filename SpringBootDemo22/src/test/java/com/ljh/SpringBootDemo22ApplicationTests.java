package com.ljh;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo22ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private JavaMailSender mailSender;

	public void sendSimpleMail() throws Exception {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("lijh@aaaaachina.com");
		message.setTo("1838133252@qq.com");
		message.setSubject("主题：SpringBoot测试简单邮件");
		message.setText("测试邮件内容");
		mailSender.send(message);
	}

	public void sendAttachmentsMail() throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		helper.setFrom("lijh@aaaaachina.com");
		helper.setTo("1838133252@qq.com");
		helper.setSubject("主题：SpringBoot测试带有附件邮件");
		helper.setText("测试邮件内容");

		// file的根路径为E:\SpringBootDemo22\ 在开头有‘\’时，是用的根目录E:
		FileSystemResource file = new FileSystemResource(new File("src\\main\\resources\\static\\u272.png"));
		helper.addAttachment("附件1.png", file);

		mailSender.send(mimeMessage);
	}

	@Test
	public void sendInlineMail() throws Exception {
		MimeMessage mimeMessage = mailSender.createMimeMessage();

		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
		helper.setFrom("lijh@aaaaachina.com");
		helper.setTo("1838133252@qq.com");
		helper.setSubject("主题：SpringBoot测试嵌入静态资源邮件");
		helper.setText("<html><body><img src=\"cid:ceshi\"</body></html>", true);

		FileSystemResource file = new FileSystemResource(new File("src\\main\\resources\\static\\u272.png"));
		helper.addInline("ceshi", file);

		mailSender.send(mimeMessage);
	}
}
