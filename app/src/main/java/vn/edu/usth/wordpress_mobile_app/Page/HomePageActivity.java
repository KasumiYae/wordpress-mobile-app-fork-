package vn.edu.usth.wordpress_mobile_app.Page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import vn.edu.usth.wordpress_mobile_app.R;

public class HomePageActivity extends AppCompatActivity {
    private ImageButton homepage;
    private TextView tv_data;
    RequestQueue requestQueue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_home_activity);
        homepage = findViewById(R.id.backHomePage);
        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        requestQueue = Volley.newRequestQueue(HomePageActivity.this);
        String url = "http://192.168.1.4:3000/post";


        tv_data = findViewById(R.id.tv_data);
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject obj = new JSONObject(response);
                    String name = obj.getString("content");
                    tv_data.setText(name);

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

//                Toast.makeText(HomePageActivity.this, "CallApiDone", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                tv_data.setText( "CallApiError");
            }
        });

        requestQueue.add(stringRequest);

    }
}