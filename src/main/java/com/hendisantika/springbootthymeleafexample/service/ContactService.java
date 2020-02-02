package com.hendisantika.springbootthymeleafexample.service;

import com.hendisantika.springbootthymeleafexample.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/02/20
 * Time: 11.59
 */
@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;


}
