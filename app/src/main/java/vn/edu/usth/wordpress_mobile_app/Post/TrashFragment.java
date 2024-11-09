package vn.edu.usth.wordpress_mobile_app.Post;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import vn.edu.usth.wordpress_mobile_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrashFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrashFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TrashFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrashFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TrashFragment newInstance(String param1, String param2) {
        TrashFragment fragment = new TrashFragment();
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


    private RequestQueue requestQueue;
    private List<PostItemDetail> postList;
    private RecyclerAdapter recyclerAdapter;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.post_fragment_trash, container, false);
        recyclerView = view.findViewById(R.id.trash_rv);

        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment_approved layout.");
        }

        // Initialize comment list and adapter
        postList = new ArrayList<>();
        recyclerAdapter = new RecyclerAdapter(postList);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Set up the Volley request queue
        requestQueue = Volley.newRequestQueue(requireContext());
        fetchPosts();

        return view;
    }

    private void fetchPosts() {
        String url = "http://222.252.124.98:3000/post";  // Replace with your actual URL

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    // Parse JSON array response
                    JSONArray jsonArray = new JSONArray(response);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject obj = jsonArray.getJSONObject(i);
                        String cate = obj.getString("cate");
                        if(cate.equals("trash")){
                            String date = obj.getString("date");  // Adjust field names as needed
                            String title = obj.getString("title");
                            String content = obj.getString("content");
                            // Add new comment to list
                            postList.add(new PostItemDetail(date, title, content));
                        }
                    }

                    // Notify adapter about data change
                    recyclerAdapter.notifyDataSetChanged();

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();  // Handle the error here (e.g., show a message to the user)
            }
        });

        // Add the request to the RequestQueue
        requestQueue.add(stringRequest);
    }
}