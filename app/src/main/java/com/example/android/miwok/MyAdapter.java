package com.example.android.miwok;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Build;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.content;
import static android.R.attr.contextClickable;
import static android.R.attr.layout;
import static android.R.attr.resource;
import static android.R.attr.text;
import static android.support.v4.content.ContextCompat.getColor;

/**
 * Created by kkuma on 31/03/2017.
 */

class MyAdapter extends ArrayAdapter<Word> {

    private int backgroundColorId;

    MyAdapter(@NonNull Context context, @NonNull ArrayList<Word> objects, int colorId) {
        super(context, 0, objects);
        backgroundColorId = colorId;

    }


    @Override
    public @NonNull
    View getView(int position, @Nullable View convertView,
                 @NonNull ViewGroup parent) {

        View view;
        TextView text1;
        TextView text2;
        ImageView img;
        final Word item = getItem(position);

        LayoutInflater inflater = LayoutInflater.from(getContext());
        if (convertView == null) {
            view = inflater.inflate(R.layout.layout_word, parent, false);
        } else {
            view = convertView;
        }

        View layout1 = view.findViewById(R.id.itemLayout);
        text1 = (TextView) view.findViewById(R.id.engText);
        text2 = (TextView) view.findViewById(R.id.miwokText);
        img = (ImageView) view.findViewById(R.id.image_id);

        assert item != null;
        text1.setText(item.getEnglishWord());
        text2.setText(item.getMiwokWord());
        int color = getContext().getResources().getColor(backgroundColorId);
        layout1.setBackgroundColor(color);
        if (getContext() instanceof PhrasesActivity) {
            img.setVisibility(View.GONE);
        }
        else {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(item.getImageId());
        }
        /*layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), item.getSoundid());
                mediaPlayer.start();
            }
        });*/
        return view;
    }


}
