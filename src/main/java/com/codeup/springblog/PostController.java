package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String showPosts() {
         return "posts/index";
    }

    @GetMapping("posts/{id}")
    public String showPostsId(@PathVariable long id, Model model){
        model.addAttribute( "singlePosts" ,new Post("title", "description"))
        return "posts/index";
    }

    @GetMapping("posts/create")
    public String formPosts() {
        return "form for posts";
    }

    @PostMapping("/posts/create")
    public String postPost() {
        return "posts/show";
    }
}
