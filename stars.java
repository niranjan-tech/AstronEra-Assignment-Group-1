package com.example.learnstar;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Vector;
//this file is used to set videos using recylclerview
public class stars extends AppCompatActivity
{
    RecyclerView recyclerView;
    Vector<youTubeVideos> youtubeVideos = new Vector<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stars);
        //initialising id for recyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"120%\" src=\"https://www" + ".youtube.com/embed/AgDy1F27nss\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"120%\" src=\"https://www" +".youtube.com/embed/rHCNWMOpndo\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new youTubeVideos("<iframe width=\"100%\" height=\"120%\" src=\"https://www" +".youtube.com/embed//KWg50irSJcA\" frameborder=\"0\" allowfullscreen></iframe>") );
        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);
        recyclerView.setAdapter(videoAdapter);
    }
}