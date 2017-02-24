package com.SpringBoot.Complete;

import javax.mail.MessagingException;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JobController {

	@RequestMapping("/send")
	@ResponseBody
	private String send() {

		System.out.println("Send");
		return "Hello";
	}

	int count = 0;

	final int a = 90;

	@Scheduled(cron = "* * * * * ?")
	@ConditionalOnProperty("90==" + a)
	private void schedule() {

		System.out.println("Where");
		if (count > 7) {
			System.out.println("Here");
		} else {
			try {
				Thread.sleep(3000);
				System.out.println(count++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		/*
		 * try { FTPUploader ftpUploader = new FTPUploader("182.73.153.94",
		 * "abhilash.medi@ggktech.com", "@bh1l@sh");
		 * ftpUploader.uploadFile("D:\\logger.log", "log.log", "/netlogon/");
		 * ftpUploader.disconnect(); System.out.println("Done"); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */

		/*
		 * MailSend mail = new MailSend();
		 * 
		 * try { mail.Send(count); } catch (MessagingException e) {
		 * e.printStackTrace(); }
		 */

	}
}
