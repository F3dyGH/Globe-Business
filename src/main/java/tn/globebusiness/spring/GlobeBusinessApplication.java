package tn.globebusiness.spring;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@SpringBootApplication
public class GlobeBusinessApplication {
	
	@Autowired
	JavaMailSender mailSender;
	

	public static void main(String[] args) {
		SpringApplication.run(GlobeBusinessApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {

		sendEmailWithAttachment("ayoubdhamer5@gmail.com",
				"This is Email Body with Attachment...",
				"This email has attachment",
				"D:\\ayoub\\Downloads\\images.jpg");
		
		/*sendSimpleEmail("ayoubdhamer5@gmail.com",
				"This is the Email Body",
				"This is the email Subject");*/
		
	}

	public void sendSimpleEmail(String toEmail, String body, String subject) {
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("ayoubdhamer5@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);

		mailSender.send(message);
		System.out.println("Mail Send...");
	}
	
	public void sendEmailWithAttachment(String toEmail, String body, String subject, String attachment)
			throws MessagingException {

		MimeMessage mimeMessage = mailSender.createMimeMessage();

		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);

		mimeMessageHelper.setFrom("ayoubdhamer5@gmail.com");
		mimeMessageHelper.setTo(toEmail);
		mimeMessageHelper.setText(body);
		mimeMessageHelper.setSubject(subject);

		FileSystemResource fileSystem = new FileSystemResource(new File(attachment));

		mimeMessageHelper.addAttachment(fileSystem.getFilename(), fileSystem);

		mailSender.send(mimeMessage);
		System.out.println("Mail Send...");

	}
}
