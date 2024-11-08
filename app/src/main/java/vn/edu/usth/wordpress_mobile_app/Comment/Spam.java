package vn.edu.usth.wordpress_mobile_app.Comment;

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

public class Spam extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_spam, container, false);

        // Find RecyclerView and ensure it matches the ID in XML layout
        RecyclerView recyclerView = rootView.findViewById(R.id.recView);
        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment_approved layout.");
        }

        // Populate the comment list with sample data
        List<Comment> cmtList = new ArrayList<>();
        cmtList.add(new Comment("111", "222", "333"));
        cmtList.add(new Comment("2111", "222", "333"));
        cmtList.add(new Comment("3111", "222", "333"));
        cmtList.add(new Comment("4111", "222", "333"));

        // Set up the adapter and layout manager for RecyclerView
        RecAdapter recAdapter = new RecAdapter(cmtList);
        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
