package com.andtinder.view;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.andtinder.R;
import com.andtinder.model.CardModel;

public final class SimpleCardStackAdapter extends CardStackAdapter {
    private TextView mJpnTestWord;
    private CardModel mModel;

    public SimpleCardStackAdapter(Context mContext) {
        super(mContext);
    }

    @Override
    public View getCardView(int position, CardModel model, View convertView,
            ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.std_card_inner, parent,
                    false);
            assert convertView != null;
        }
        mModel = model;

        ((TextView) convertView.findViewById(R.id.engTestWord)).setText(model
                .getEngTestWord());
        mJpnTestWord = ((TextView) convertView.findViewById(R.id.jpnTestWord));

        Handler handler = new Handler();
        Runnable displayJpnWord = new JpnTestWordHandler();
        handler.postDelayed(displayJpnWord, 1000);

        return convertView;
    }

    class JpnTestWordHandler implements Runnable {
        public void run() {
            mJpnTestWord.setText(mModel.getJpnTestWord());

        }
    }
}
