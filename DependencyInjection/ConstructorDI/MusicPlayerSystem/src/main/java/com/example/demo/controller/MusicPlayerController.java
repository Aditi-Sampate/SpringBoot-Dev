package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MusicPlayerService;
import com.example.demo.serviceImpl.AppleMusicServiceImpl;
import com.example.demo.serviceImpl.LocalMusicServiceImpl;
import com.example.demo.serviceImpl.SpotifyMusicServiceImpl;

@RestController
@RequestMapping("music")
public class MusicPlayerController {

	
	
	private LocalMusicServiceImpl localMusicService;
	private SpotifyMusicServiceImpl spotifyMusicService;
	private AppleMusicServiceImpl appleMusicService;


	MusicPlayerController(AppleMusicServiceImpl appleMusicService, LocalMusicServiceImpl localMusicService, SpotifyMusicServiceImpl spotifyMusicService)
	{
		this.appleMusicService = appleMusicService;
		this.localMusicService = localMusicService;
		this.spotifyMusicService = spotifyMusicService;
		
	}
	
	
	@GetMapping("/{type}")
	public String playMusic(@PathVariable String type)
	{
		MusicPlayerService musicPlayerService = null;
		
		switch(type)
		{
		   case "apple":
			   musicPlayerService = appleMusicService;
			   break;
			   
		   case "local":
			   musicPlayerService = localMusicService;
			   break;
			   
		   case "spotify":
			   musicPlayerService = spotifyMusicService;
		
		}
		
		return musicPlayerService.playSong() + "-------->"+ musicPlayerService.pauseSong() + "-------->"+ musicPlayerService.stopSong();
	}
	
}
