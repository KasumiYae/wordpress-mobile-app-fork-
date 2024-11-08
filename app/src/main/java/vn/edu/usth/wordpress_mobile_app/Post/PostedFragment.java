package vn.edu.usth.wordpress_mobile_app.Post;

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

public class PostedFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PostedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PostedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PostedFragment newInstance(String param1, String param2) {
        PostedFragment fragment = new PostedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        List<PostItemDetail> PostList = new ArrayList<>();
        PostList.add(new PostItemDetail("January 1, 2024", "Hello World1", "Hello World1"));
        PostList.add(new PostItemDetail("January 2, 2024", "Hello World2", "Hello World2"));
        PostList.add(new PostItemDetail("January 3, 2024", "Hello World3", "Hello World3"));
        PostList.add(new PostItemDetail("January 4, 2024", "Hello World4", "Hello World4"));
        PostList.add(new PostItemDetail("January 5, 2024", "Hello World5", "Hello World5"));
        PostList.add(new PostItemDetail("January 6, 2024", "Hello World6", "Hello World6"));

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.post_fragment_posted, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.posted_rv);
        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment_approved layout.");
        }

        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(PostList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }




}