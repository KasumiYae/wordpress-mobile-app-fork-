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
import android.widget.TextView;

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

import vn.edu.usth.wordpress_mobile_app.Comment.Comment;
import vn.edu.usth.wordpress_mobile_app.Comment.RecAdapter;
import vn.edu.usth.wordpress_mobile_app.R;


public class PageFragment extends Fragment {
    private RequestQueue requestQueue;
    private List<Page> pageList;
    private RecAdapterPage recAdapterPage;
    private RecyclerView recyclerView;
    private TextView tv_data;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        // Initialize RecyclerView
        recyclerView = rootView.findViewById(R.id.pageView);
        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment_approved layout.");
        }

        // Initialize comment list and adapter
        pageList = new ArrayList<>();
        recAdapterPage = new RecAdapterPage(pageList);
        recyclerView.setAdapter(recAdapterPage);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Set up the Volley request queue
        requestQueue = Volley.newRequestQueue(requireContext());
        fetchComments();

        return rootView;
    }

    private void fetchComments() {
        String url = "http://192.168.1.36:3000/page";  // Replace with your actual URL

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    // Parse JSON array response
                    JSONArray jsonArray = new JSONArray(response);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject obj = jsonArray.getJSONObject(i);
                        String date = obj.getString("date");  // Adjust field names as needed
                        String title = obj.getString("title");
                        String content = obj.getString("content");
                        // Add new comment to list
                        pageList.add(new Page(title, content, date));
                    }

                    // Notify adapter about data change
                    recAdapterPage.notifyDataSetChanged();

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