package com.shrestha.kush.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class CodeFellowshipController {

    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("/")
    public String getCodeFellows(Principal p, Model m){

        AppUser me = appUserRepository.findByUsername(p.getName());

        m.addAttribute("principal", me);
        return "codefellows";
    }

}
