package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.MusicPlayerService;

@Service
public class SpotifyMusicServiceImpl implements MusicPlayerService{

	@Override
	public String playSong() {
		// TODO Auto-generated method stub
		return MessageConstants.SPOTIFY_MUSIC_PLAY;
	}

	@Override
	public String pauseSong() {
		// TODO Auto-generated method stub
		return MessageConstants.SPOTIFY_MUSIC_PAUSE;
	}

	@Override
	public String stopSong() {
		// TODO Auto-generated method stub
		return MessageConstants.SPOTIFY_MUSIC_STOP;
	}

}
