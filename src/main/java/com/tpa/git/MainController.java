package com.tpa.git;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(path = "/metodo1")
    public String reqMap01(){
        return "metodo1";
    }

}
