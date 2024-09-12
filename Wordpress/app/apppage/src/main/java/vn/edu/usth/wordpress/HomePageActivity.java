package vn.edu.usth.wordpress;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class HomePageActivity extends AppCompatActivity {
    private ImageButton btnback1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btnback1 = findViewById(R.id.back1);
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, PageFragment.class);
                startActivity(intent);
            }
        });
    }
}