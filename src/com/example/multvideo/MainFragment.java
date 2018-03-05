package com.example.multvideo;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;


@SuppressLint("NewApi") public class MainFragment extends Fragment{
	VideoView vv;
	String path;
	
	public MainFragment(String path){
		this.path = path;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_video, container, false);
		
		vv = (VideoView) rootView.findViewById(R.id.videoview);
		vv.setOnCompletionListener(new OnCompletionListener(){

			@Override
			public void onCompletion(MediaPlayer mp) {
				vv.setVideoPath(path);
				vv.start();
			}
			
		});
		return rootView;
	}
	
	@Override
	public void onResume() {
		super.onResume();
		vv.setVideoPath(path);
		vv.start();
	}
	
	@Override
	public void onPause() {
		super.onPause();
		vv.stopPlayback();
	}

}
