package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Seeyon on 2017-11-16.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mBackgroundColor;

    public WordAdapter(Context context, ArrayList<Word> words, int backgroundColor) {
        super(context, 0, words);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);

        // 刚开始渲染的时候没有可重用的view，需要自己创建
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item, parent, false);
        }

        TextView miworkTextView = convertView.findViewById(R.id.miwork_text_view);
        TextView defaultTextView = convertView.findViewById(R.id.default_text_view);
        ImageView imageView = convertView.findViewById(R.id.image);

        miworkTextView.setText(word.getMiworkTranslation());
        defaultTextView.setText(word.getDefaultTranslation());

        if (word.getImgResId() != -1) {
            imageView.setImageResource(word.getImgResId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        LinearLayout listItemText = convertView.findViewById(R.id.list_item_text);
        listItemText.setBackgroundResource(mBackgroundColor);

        return convertView;
    }
}
