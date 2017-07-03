package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.textContainer;

/**
 * Created by shivani on 6/14/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int sectionColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int msectionColor) {
        super(context, 0, words);
        sectionColor = msectionColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.list_item, parent, false);

        }

        Word currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);


        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);


        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView pic = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            pic.setImageResource(currentWord.getImageId());
            pic.setVisibility(View.VISIBLE);
        } else {
            pic.setVisibility(View.GONE);
        }

        View dd = listItemView.findViewById(textContainer);
        int color= ContextCompat.getColor(getContext(),sectionColor);
        dd.setBackgroundColor(color);
        return listItemView;

    }
}

