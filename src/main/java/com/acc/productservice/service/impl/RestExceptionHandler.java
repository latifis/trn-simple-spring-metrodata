package com.acc.productservice.service.impl;

import com.acc.productservice.exception.CustomException;
import com.acc.productservice.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//@ControllerAdvice
//public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler(CustomException.class)
//    public ResponseEntity<ErrorMessage> customException(CustomException customException){
//        return new ResponseEntity<>(new ErrorMessage().builder()
//                .error(customException.getError())
//                .message(customException.getMessage())
//                .build()
//                , HttpStatus.valueOf(customException.getStatus()));
//    }
//
//}
