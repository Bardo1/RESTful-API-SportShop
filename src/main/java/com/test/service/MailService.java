package com.test.service;

import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Павел on 28.09.2016.
 */
@Service
public interface MailService {

    SimpleMailMessage sendMessage(HttpServletRequest request, Long userId, String email) throws Exception;
}
