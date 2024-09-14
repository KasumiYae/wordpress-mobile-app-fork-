package vn.edu.usth.wordpress_mobile_app.Page;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import vn.edu.usth.wordpress_mobile_app.R;


public class PageFragment extends Fragment {
    Button gotoPageHome, gotoPageIntroduction, gotoPageNews;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false);
    }
}