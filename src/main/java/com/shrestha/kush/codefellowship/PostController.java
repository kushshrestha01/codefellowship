package com.shrestha.kush.codefellowship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

@Controller
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @GetMapping("/post/add")
    public String getPost(){
        return "createpost";
    }

    @PostMapping("/createpost")
    public RedirectView createPost(String body, Timestamp createAt, Principal p){
        Calendar calendar = Calendar.getInstance();
        createAt = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
        Post newPost = new Post(body, createAt);

        AppUser me = appUserRepository.findByUsername(p.getName());
        newPost.user = me;

        postRepository.save(newPost);
        return new RedirectView("/");
    }
}
