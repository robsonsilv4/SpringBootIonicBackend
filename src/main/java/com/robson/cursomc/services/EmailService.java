package com.robson.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.robson.cursomc.domain.Pedido;

public interface EmailService {
	void senderOrderConfirmationEmail(Pedido obj);

	void sendMail(SimpleMailMessage msg);

	void sendOrderConfirmationHtmlEmail(Pedido obj);

	void sendHtmlEmail(MimeMessage msg);
}
