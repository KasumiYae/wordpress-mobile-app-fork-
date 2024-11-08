package vn.edu.usth.wordpress_mobile_app.Page;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.wordpress_mobile_app.R;


public class PageFragment extends Fragment {
//    private RelativeLayout gotoPageHome, gotoPageIntroduction, gotoPageNews;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.page_cards, container, false);
//        gotoPageHome = view.findViewById(R.id.home_page);
//        gotoPageHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), HomePageActivity.class);
//                startActivity(intent);
//            }
//        });

        // Find RecyclerView and ensure it matches the ID in XML layout
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.pageView);
        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment_approved layout.");
        }
        // Populate the comment list with sample data
        List<Page> pageList = new ArrayList<>();
        pageList.add(new Page("111", "222", "333"));
        pageList.add(new Page("2111", "222", "333"));
        pageList.add(new Page("3111", "222", "333"));
        pageList.add(new Page("4111", "222", "333"));
        // Set up the adapter and layout manager for RecyclerView
        RecAdapterPage recAdapter = new RecAdapterPage(pageList);
        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}