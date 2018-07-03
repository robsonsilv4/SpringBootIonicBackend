package com.robson.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.robson.cursomc.domain.Cliente;
import com.robson.cursomc.domain.Pedido;

public interface EmailService {
	void senderOrderConfirmationEmail(Pedido obj);

	void sendMail(SimpleMailMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPass);
}
