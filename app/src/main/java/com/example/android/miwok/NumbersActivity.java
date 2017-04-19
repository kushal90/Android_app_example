package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    @Override
    protected void onStop() {
        super.onStop();
        if (mMediaPlayer != null)
        mMediaPlayer.setOnCompletionListener(mOnCompletionListener);
    }

   /* @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }*/

    private MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mOnCompletionListener= new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_activity);


        final ArrayList<Word> objectWords = new ArrayList<>();
        Word word1 = new Word("One", "Mone", R.drawable.number_one, R.raw.number_one);
        objectWords.add(word1);
        Word word2 = new Word("Two", "Mtwo", R.drawable.number_two, R.raw.number_two);
        objectWords.add(word2);
        Word word3 = new Word("Three", "Mthree", R.drawable.number_three,R.raw.number_three);
        objectWords.add(word3);

        ListView listView = (ListView) findViewById(R.id.listView);
        //ArrayAdapter arrayadapter = new ArrayAdapter(this, R.layout.layout_word, objectWords);
        MyAdapter myAdapter = new MyAdapter(this, objectWords, R.color.category_numbers);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                releaseMediaPlayer();
                int soundId = objectWords.get(i).getSoundid();
                Log.v("NumbersActivity.java",""+objectWords.get(i));
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, soundId);
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mOnCompletionListener);
            }
        });
        listView.setAdapter(myAdapter);
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
