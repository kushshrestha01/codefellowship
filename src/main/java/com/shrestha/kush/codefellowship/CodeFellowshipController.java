package com.shrestha.kush.codefellowship;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class CodeFellowshipController {

    @GetMapping("/")
    public String getCodeFellows(Principal p, Model m){
        System.out.println(p.getName());
        m.addAttribute("principal", p);
        return "codefellows";
    }

}
