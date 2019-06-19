package com.shrestha.kush.codefellowship;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class CodeFellowshipController {

    @GetMapping("/")
    public String getCodeFellows(Principal p, Model m){
        AppUser currentUser = (AppUser) ((UsernamePasswordAuthenticationToken) p).getPrincipal();
        m.addAttribute("principal", currentUser);
        return "codefellows";
    }

}
