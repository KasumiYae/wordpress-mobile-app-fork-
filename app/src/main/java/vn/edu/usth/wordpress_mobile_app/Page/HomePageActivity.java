package vn.edu.usth.wordpress_mobile_app.Page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.wordpress_mobile_app.R;

public class HomePageActivity extends AppCompatActivity {
    ImageButton buttonback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_fragment);

        buttonback = findViewById(R.id.back1);
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePageActivity.this, PageFragment.class);
                startActivity(intent);
            }
        });
    }
}