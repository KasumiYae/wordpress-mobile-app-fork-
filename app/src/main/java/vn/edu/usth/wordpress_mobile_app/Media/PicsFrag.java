package vn.edu.usth.wordpress_mobile_app.Media;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

public class PicsFrag extends Fragment {

    private static final String TAG = "PicsFrag";
    private static final String IMAGE_URL = "http://222.252.124.98:3000/media/images/";

    private List<Media> mediaList;
    private RecAdapter recAdapter;
    private RequestQueue requestQueue;

    public PicsFrag() {
        // Required empty public constructor
    }

    public static PicsFrag newInstance(String param1, String param2) {
        PicsFrag fragment = new PicsFrag();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // Use parameters if needed
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.media_fragment_pics, container, false);

        // Initialize RecyclerView
        RecyclerView recyclerView = rootView.findViewById(R.id.recViewMedia);
        if (recyclerView == null) {
            throw new RuntimeException("RecyclerView not found in fragment layout.");
        }

        // Initialize the list and adapter
        mediaList = new ArrayList<>();
        recAdapter = new RecAdapter(mediaList);
        recyclerView.setAdapter(recAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        // Initialize Volley request queue
        requestQueue = Volley.newRequestQueue(requireContext());

        // Fetch images from the server
        fetchImageUrls();

        return rootView;
    }

    private void fetchImageUrls() {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, IMAGE_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d(TAG, "Response received: " + response);
                        String[] res = response.substring(2, response.length() - 2).split("\",\"");

                        Log.d(TAG,res[0]);
                        for (String url : res){
                            mediaList.add(new Media(url));
                        }
                        // Notify adapter to update the RecyclerView
                        recAdapter.notifyDataSetChanged();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e(TAG, "Volley error: " + error.getMessage());
                    }
                });

        // Add the request to the RequestQueue
        requestQueue.add(stringRequest);
    }
}