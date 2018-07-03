package com.robson.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import com.robson.cursomc.domain.Pedido;

public class SmtpEmailService extends AbstractEmailService {
	@Autowired
	MailSender mailSender;

	private static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);

	@Override
	public void sendMail(SimpleMailMessage msg) {
		LOG.info("Enviando email...");
		mailSender.send(msg);
		LOG.info("Email enviado");
	}

	@Override
	public void sendOrderConfirmationHtmlEmail(Pedido obj) {
	
	}

	@Override
	public void sendHtmlEmail(MimeMessage msg) {
	
	}
}
