package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albums {
    @GetMapping("/albums")
    public String albums(Model albumModel){

        Album album1=new Album("title1","artist1",3,360,"http/imageurl1.com");
        Album album2=new Album("title2","artist2",3,360,"http/imageurl2.com");
        Album album3=new Album("title3","artist3",5,360,"http/imageurl3.com");
        Album[] list={album1,album2,album3};
albumModel.addAttribute("list",list);
        return "albums.html";
    }
}
