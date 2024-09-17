package vn.edu.usth.wordpress_mobile_app.Comment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.wordpress_mobile_app.Post.PostFragmentAdapter;
import vn.edu.usth.wordpress_mobile_app.R;

public class CommentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_comment);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        ViewPager pager = findViewById(R.id.View_pager);
        pager.setOffscreenPageLimit(4);
        pager.setAdapter(adapter);

        TabLayout tabLayout =findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(pager);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.comment_layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        ImageView backIcon = findViewById(R.id.back);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
