package com.example.songr.Controllers;

import com.example.songr.Models.Album;
import com.example.songr.Repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository albumRepository;

@PostMapping("/albums")
public RedirectView addAlbum(String title,String artist,int songCount,int length,String imageUrl){
    Album newAlbum=new Album(title,artist,songCount,length,imageUrl);
    albumRepository.save(newAlbum);
    return new RedirectView("/albums");
}

    @GetMapping("/albums")
    public String albums(Model albumModel){
        List<Album> list=albumRepository.findAll();
        albumModel.addAttribute("list",list);


        return "albums";
    }
}