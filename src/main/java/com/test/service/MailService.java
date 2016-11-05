package com.test.service;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.test.model.entity.User;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
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

    void sendMessage(HttpServletRequest request, Long userId, String email) throws Exception;
    SimpleMailMessage constructMessage(HttpServletRequest request, User user,String token, String email);
}