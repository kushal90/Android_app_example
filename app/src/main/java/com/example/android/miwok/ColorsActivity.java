package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_activity);

        /*ArrayList<Word> color_words = new ArrayList<>();
        color_words.add(new Word("Red","Wetetti"));
        color_words.add(new Word("Green","Chokokki"));
        color_words.add(new Word("Brown","Takaakki"));
        color_words.add(new Word("Gray","Topoppi"));
        color_words.add(new Word("Black","Kululli"));
        color_words.add(new Word("White","Kelelli"));
        color_words.add(new Word("Dusty yellow","Topiisa"));
        color_words.add(new Word("Mustard yellow","Chiwiita"));
        MyAdapter myAdapter = new MyAdapter(this, R.layout.layout_word, color_words);
        ListView listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(myAdapter);*/
    }
}
