package com.edupointbd.amirul.navbuttondemo.homeFragmentpakage;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edupointbd.amirul.navbuttondemo.R;

/**
 * Created by Amirul on 22-Apr-18.
 */

public class ItemOneFragment extends Fragment {

    public static ItemOneFragment newInstance(){
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_item_one,container,false);
    }
}
