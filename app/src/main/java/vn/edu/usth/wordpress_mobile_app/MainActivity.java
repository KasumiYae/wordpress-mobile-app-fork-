package vn.edu.usth.wordpress_mobile_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.wordpress_mobile_app.Account.AccountActivity;
import vn.edu.usth.wordpress_mobile_app.Account.Blog_SettingActivity;
import vn.edu.usth.wordpress_mobile_app.Comment.CommentActivity;
import vn.edu.usth.wordpress_mobile_app.Media.MediaActivity;
import vn.edu.usth.wordpress_mobile_app.Page.PageActivity;
import vn.edu.usth.wordpress_mobile_app.Post.PostActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton siteIconButton, downButton;
    private TextView titleTextView, linkTextView;
    private ImageView postIcon, pageIcon, mediaIcon, commentIcon, profileIcon, settingIcon, wordpressIcon;
    private ImageView plusButton;
    private RelativeLayout post,page,media,comment,profile,setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        siteIconButton = findViewById(R.id.site_icon);
        downButton = findViewById(R.id.down);
        titleTextView = findViewById(R.id.title);
        linkTextView = findViewById(R.id.link);
        post = findViewById(R.id.post_item);
        page = findViewById(R.id.page_item);
        media = findViewById(R.id.media_item);
        comment = findViewById(R.id.comment_item);
        profile = findViewById(R.id.profile_item);
        setting = findViewById(R.id.setting_item);
        wordpressIcon = findViewById(R.id.wordpress_icon);
        plusButton = findViewById(R.id.fab);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PostActivity.class);
                startActivity(intent);
            }
        });

        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PageActivity.class);
                startActivity(intent);
            }
        });

        media.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MediaActivity.class);
                startActivity(intent);
            }
        });

        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CommentActivity.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Blog_SettingActivity.class);
                startActivity(intent);
            }
        });

        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BlogOptionActivity.class );
                startActivity(intent);
            }
        });
    }
}