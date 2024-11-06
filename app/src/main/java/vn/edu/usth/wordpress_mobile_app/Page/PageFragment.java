package vn.edu.usth.wordpress_mobile_app.Page;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import vn.edu.usth.wordpress_mobile_app.R;


public class PageFragment extends Fragment {
    private RelativeLayout gotoPageHome, gotoPageIntroduction, gotoPageNews;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        gotoPageHome = view.findViewById(R.id.home_page);
        gotoPageHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), HomePageActivity.class);
                startActivity(intent);
            }
        });
        gotoPageIntroduction = view.findViewById(R.id.introduction);
        gotoPageIntroduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), IntroductionActivity.class);
                startActivity(intent);
            }
        });
        gotoPageNews = view.findViewById(R.id.news);
        gotoPageNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NewsActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}