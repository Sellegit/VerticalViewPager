package fr.castorflex.android.views;

import android.support.v4.view.PagerAdapter;

public interface OnAdapterChangeListener {
    public void onAdapterChanged(PagerAdapter oldAdapter, PagerAdapter newAdapter);
}
