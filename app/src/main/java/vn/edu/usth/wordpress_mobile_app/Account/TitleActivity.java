package vn.edu.usth.wordpress_mobile_app.Account;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import vn.edu.usth.wordpress_mobile_app.R;

public class TitleActivity extends AppCompatActivity {

    private TextView title1, link1, security1, setting_home1, time1, category1, post1, date1, time_format1;
    private Switch allowComments, allowPingbacks, allowRepost;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        title1 = findViewById(R.id.title_text);
        link1 = findViewById(R.id.link_text);
        security1 = findViewById(R.id.Security_text);
        setting_home1 = findViewById(R.id.setting_home_text);
        time1 = findViewById(R.id.time_text);
        category1 = findViewById(R.id.Default_category_text);
        post1 = findViewById(R.id.Default_post_style_text);
        date1 = findViewById(R.id.date_format_text);
        time_format1 = findViewById(R.id.time_format_text);


        allowComments = findViewById(R.id.allow_comments_switch);
        allowPingbacks = findViewById(R.id.allow_Respond_switch);
        allowRepost = findViewById(R.id.allow_repost_switch);
    }
}
