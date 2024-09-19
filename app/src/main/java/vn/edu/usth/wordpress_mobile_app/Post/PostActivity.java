package vn.edu.usth.wordpress_mobile_app.Post;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.wordpress_mobile_app.R;

public class PostActivity extends AppCompatActivity {

    private ImageButton btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);
        
        PostFragmentAdapter adapter = new PostFragmentAdapter(getSupportFragmentManager());

        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(4);
        pager.setAdapter(adapter);

        TabLayout tabLayout =findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

        btnback = findViewById(R.id.back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}