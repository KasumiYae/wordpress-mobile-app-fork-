package vn.edu.usth.wordpress_mobile_app;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageButton siteIconButton;
    private TextView titleTextView, linkTextView;
    private ImageView postIcon, pageIcon, mediaIcon, commentIcon, profileIcon, settingIcon, wordpressIcon;
    private ImageView plusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
//        siteIconButton = findViewById(R.id.site_icon);
//        titleTextView = findViewById(R.id.title);
//        linkTextView = findViewById(R.id.link);
//        postIcon = findViewById(R.id.post_icon);
//        pageIcon = findViewById(R.id.page_icon);
//        mediaIcon = findViewById(R.id.media_icon);
//        commentIcon = findViewById(R.id.comment_icon);
//        profileIcon = findViewById(R.id.profile_icon);
//        settingIcon = findViewById(R.id.setting_icon);
//        wordpressIcon = findViewById(R.id.wordpress_icon);
//        plusButton = findViewById(R.id.plus_icon);
    }
}