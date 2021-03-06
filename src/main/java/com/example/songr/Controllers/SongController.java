package com.example.songr.Controllers;

import com.example.songr.Models.Album;
import com.example.songr.Models.Song;
import com.example.songr.Repositories.AlbumRepository;
import com.example.songr.Repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class SongController {
@Autowired
    private SongRepository songRepository;

@Autowired
    private AlbumRepository albumRepository;

@PostMapping("/songs")
    public RedirectView addSong(String title,int length,int trackNumber,String albumTitle){
    Album newAlbum= albumRepository.findAlbumByTitle(albumTitle);
    Song newSong= new Song(newAlbum,title,length,trackNumber);
    songRepository.save(newSong);
    return new RedirectView("/songs");
}

    @GetMapping("/songs")
    public String albums(Model songModel){
        List<Song> list=songRepository.findAll();
        songModel.addAttribute("list",list);


        return "songs";
    }
}
