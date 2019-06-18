package com.shrestha.kush.codefellowship;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CodeFellowshipController {

    @GetMapping("/codefellows")
    public String getCodeFellows(){
        return "Code Fellows";
    }

}
