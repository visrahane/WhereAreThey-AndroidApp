package com.vis.entertainment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vis.entertainment.R;

import org.json.JSONObject;

public class ReviewsFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.reviews, container, false);
        return view;
    }
    @Override
    public void updateInfo(JSONObject details){ }
}
