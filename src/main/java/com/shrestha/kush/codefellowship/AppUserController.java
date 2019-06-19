package com.shrestha.kush.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AppUserController {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    PasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/users")
    public RedirectView createUser(String username, String password, String firstName, String lastName, String birthday, String bio) {
        AppUser newUser = new AppUser(username, bCryptPasswordEncoder.encode(password),firstName, lastName, birthday, bio);
        appUserRepository.save(newUser);

        // maybe autologin?
        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new ArrayList<>());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new RedirectView("/");
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/signup")
    public String getsignup(){
        return "signup";
    }

    @PostMapping("/signup")
    public RedirectView createNewUser(String username, String password, String firstname, String lastname, String birthday, String bio) {
        AppUser newUser = new AppUser(username, bCryptPasswordEncoder.encode(password),firstname, lastname, birthday, bio);
        appUserRepository.save(newUser);

        // maybe autologin?
        Authentication authentication = new UsernamePasswordAuthenticationToken(newUser, null, new ArrayList<>());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return new RedirectView("/");
    }

    @GetMapping("/user/{id}")
    public String applicationUser(@PathVariable Long id, Model m) {
        AppUser userId = appUserRepository.findById(id).get();
        if(userId != null) {
            m.addAttribute("userinfo", userId);
            return "individualprofile";
        } else {
            return "nousererror";
        }
    }
}