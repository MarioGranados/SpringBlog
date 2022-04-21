package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String showPosts(Model model) {

        ArrayList<Post> allPosts = new ArrayList<>();
        allPosts.add(new Post("doggos", "i have some puppies"));
        allPosts.add(new Post("Lost my car", "I lost my car and can't find it help"));
        allPosts.add(new Post("I'm not from this planet...", "I need help getting back to my planet"));
        model.addAttribute("posts", allPosts);
        return "posts/index";
    }

    @GetMapping("posts/{id}")
    public String showPostsId(@PathVariable long id, Model model){
        model.addAttribute( "singlePosts" ,new Post("title", "description"));
        return "posts/show";
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
