package com.SpringBoot.Complete;

import com.sun.mail.smtp.SMTPTransport;
import java.security.Security;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSend {

	@SuppressWarnings("restriction")
	public void Send(int count) throws AddressException, MessagingException {

		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());

		Properties props = System.getProperties();
		props.setProperty("mail.smtps.host", "smtp.gmail.com");
		props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.setProperty("mail.smtp.socketFactory.fallback", "false");
		props.setProperty("mail.smtp.port", "465");
		props.setProperty("mail.smtp.socketFactory.port", "465");
		props.setProperty("mail.smtps.auth", "true");

		props.put("mail.smtps.quitwait", "false");

		Session session = Session.getInstance(props, null);

		final MimeMessage msg = new MimeMessage(session);

		msg.setFrom(new InternetAddress("abhilashmedi147@gmail.com"));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("abhilash.medi@ggktech.com", false));

		msg.setSubject("Automated Mail");
		msg.setText("Mail " + count, "utf-8");
		msg.setSentDate(new Date());

		SMTPTransport t = (SMTPTransport) session.getTransport("smtps");

		t.connect("smtp.gmail.com", "abhilashmedi147@gmail.com", "SUPERMACHI");
		t.sendMessage(msg, msg.getAllRecipients());
		t.close();
	}
}