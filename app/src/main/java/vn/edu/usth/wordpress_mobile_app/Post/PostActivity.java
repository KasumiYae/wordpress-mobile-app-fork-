package vn.edu.usth.wordpress_mobile_app.Post;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.wordpress_mobile_app.R;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_post);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PostFragmentAdapter adapter = new PostFragmentAdapter(getSupportFragmentManager());

        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(4);
        pager.setAdapter(adapter);
        TabLayout tabLayout =findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);

//        ImageButton btnback = findViewById(R.id.back);
//        btnback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(PostActivity.this ,MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}