package com.hendisantika.springbootthymeleafexample.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 02/02/20
 * Time: 11.56
 */
public class ResourceAlreadyExistsException extends Exception {

    public ResourceAlreadyExistsException() {
    }

    public ResourceAlreadyExistsException(String msg) {
        super(msg);
    }
}