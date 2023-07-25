package com.songportal.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int lengthInSeconds;
    private String imageUrl;

    // Constructor
    public Album(String title, String artist, int songCount, int lengthInSeconds, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthInSeconds = lengthInSeconds;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void setLengthInSeconds(int lengthInSeconds) {
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // I still haven't decided which albums or artists I want I still have to get hello world to work but based on the demo and a video I watched I think this is close to whats needed.
    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", songCount=" + songCount +
                ", lengthInSeconds=" + lengthInSeconds +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
    @Controller
    public class AlbumController {

        @GetMapping("/albums")
        public String showAlbums(Model model) {
            // Create three hardcoded album instances
            Album album1 = new Album("Album Title 1", "Artist Name 1", 10, 3600, "https://example.com/album-art-1.jpg");
            Album album2 = new Album("Album Title 2", "Artist Name 2", 12, 3000, "https://example.com/album-art-2.jpg");
            Album album3 = new Album("Album Title 3", "Artist Name 3", 8, 2700, "https://example.com/album-art-3.jpg");

            // Add albums to the model
            model.addAttribute("album1", album1);
            model.addAttribute("album2", album2);
            model.addAttribute("album3", album3);

            // Return the name of the Thymeleaf template to be rendered (e.g., albums.html)
            return "albums";
        }
    }



    // I still need to decide which album Im going to use.
    public class Main {
        public static void main(String[] args) {
            Album album1 = new Album("Album Title", "Enter Shikari", 10, 3600, "");
            System.out.println(album1);


            System.out.println("Album Title: " + album1.getTitle());
            System.out.println("Enter Shikari: " + album1.getArtist());
            System.out.println("Number of Songs: " + album1.getSongCount());
            System.out.println("Length (seconds): " + album1.getLengthInSeconds());
            System.out.println("Album Art URL: " + album1.getImageUrl());
        }
    }
}
}
