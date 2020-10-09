package com.Lesson4Service.ServiceL4.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
    Исключение, которое выбрасывается при отсутствии запрашиваемой информации
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{
}
