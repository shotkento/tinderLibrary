/**
 * AndTinder v0.1 for Android
 *
 * @Author: Enrique López Mañas <eenriquelopez@gmail.com>
 * http://www.lopez-manas.com
 *
 * TAndTinder is a native library for Android that provide a
 * Tinder card like effect. A card can be constructed using an
 * image and displayed with animation effects, dismiss-to-like
 * and dismiss-to-unlike, and use different sorting mechanisms.
 *
 * AndTinder is compatible with API Level 13 and upwards
 *
 * @copyright: Enrique López Mañas
 * @license: Apache License 2.0
 */

package com.andtinder.model;

import android.graphics.drawable.Drawable;

public class CardModel {

    private String engTestWord;
    private String jpnTestWord;
    private Drawable cardLikeImageDrawable;
    private Drawable cardDislikeImageDrawable;

    private OnCardDimissedListener mOnCardDimissedListener = null;

    private OnClickListener mOnClickListener = null;

    public interface OnCardDimissedListener {
        void onLike();

        void onDislike();
    }

    public interface OnClickListener {
        void OnClickListener();
    }

    public CardModel() {
        this(null, null);
    }

    public CardModel(String engTestWord, String jpnTestWord) {
        this.engTestWord = engTestWord;
        this.jpnTestWord = jpnTestWord;
    }

    // public CardModel(String title, String description, Bitmap cardImage) {
    // this.title = title;
    // this.description = description;
    // this.cardImageDrawable = new BitmapDrawable(null, cardImage);
    // }

    public String getEngTestWord() {
        return engTestWord;
    }

    public void setEngTestWord(String engTestWord) {
        this.engTestWord = engTestWord;
    }

    public String getJpnTestWord() {
        return jpnTestWord;
    }

    public void setJpnTestWord(String jpnTestWord) {
        this.jpnTestWord = jpnTestWord;
    }

    // public Drawable getCardImageDrawable() {
    // return cardImageDrawable;
    // }
    //
    // public void setCardImageDrawable(Drawable cardImageDrawable) {
    // this.cardImageDrawable = cardImageDrawable;
    // }

    public Drawable getCardLikeImageDrawable() {
        return cardLikeImageDrawable;
    }

    public void setCardLikeImageDrawable(Drawable cardLikeImageDrawable) {
        this.cardLikeImageDrawable = cardLikeImageDrawable;
    }

    public Drawable getCardDislikeImageDrawable() {
        return cardDislikeImageDrawable;
    }

    public void setCardDislikeImageDrawable(Drawable cardDislikeImageDrawable) {
        this.cardDislikeImageDrawable = cardDislikeImageDrawable;
    }

    public void setOnCardDimissedListener(OnCardDimissedListener listener) {
        this.mOnCardDimissedListener = listener;
    }

    public OnCardDimissedListener getOnCardDimissedListener() {
        return this.mOnCardDimissedListener;
    }

    public void setOnClickListener(OnClickListener listener) {
        this.mOnClickListener = listener;
    }

    public OnClickListener getOnClickListener() {
        return this.mOnClickListener;
    }
}