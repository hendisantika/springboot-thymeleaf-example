package com.hendisantika.springbootthymeleafexample.controller;

import com.hendisantika.springbootthymeleafexample.service.ContactService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/02/20
 * Time: 12.39
 */
@Controller
public class ContactController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final int ROW_PER_PAGE = 5;

    @Autowired
    private ContactService contactService;

    @Value("${msg.title}")
    private String title;

    @GetMapping(value = {"/", "/index"})
    public String index(Model model) {
        model.addAttribute("title", title);
        return "index";
    }

}
