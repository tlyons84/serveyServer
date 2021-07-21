package com.serveyserver.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rest")
public class ServeyGeneratorController {
    public void createAQuestion(){}

    public void createAServey(){}

    public void deleteAQuestion(){}

    public void deleteAServey(){}

    public void updateAQuestion(){}

    public void updateAServey(){}

}
