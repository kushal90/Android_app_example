package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.listView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_activity);
        ArrayList<Word> objectWords = new ArrayList<>();
        Word word1 = new Word("One", "Mone", R.raw.phrase_are_you_coming);
        objectWords.add(word1);
        Word word2 = new Word("Two", "Mtwo", R.raw.phrase_come_here);
        objectWords.add(word2);
        Word word3 = new Word("Three", "Mthree", R.raw.phrase_how_are_you_feeling);
        objectWords.add(word3);



        ListView listView = (ListView) findViewById(R.id.listView);
        //ArrayAdapter arrayadapter = new ArrayAdapter(this, R.layout.layout_word, objectWords);
        MyAdapter myAdapter = new MyAdapter(this, objectWords, R.color.category_phrases);
        listView.setAdapter(myAdapter);
    }
}
