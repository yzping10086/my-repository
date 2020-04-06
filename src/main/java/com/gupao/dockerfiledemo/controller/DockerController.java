package com.gupao.dockerfiledemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dockerfile")
@Slf4j
public class DockerController {
    @ResponseBody
    String dockerfile() {
        log.info("INFO: logger for mycontroller 8082");
        return "hello docker 8082" ;
    }
    @GetMapping("/list")
    String dockerfile1() {
        log.info("INFO: logger for list 8082");
        return "hello docker dockerfile list" ;
    }

}
