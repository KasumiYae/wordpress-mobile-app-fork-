package vn.edu.usth.wordpress_mobile_app.Account;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import vn.edu.usth.wordpress_mobile_app.Comment.CommentActivity;
import vn.edu.usth.wordpress_mobile_app.MainActivity;
import vn.edu.usth.wordpress_mobile_app.Media.MediaActivity;
import vn.edu.usth.wordpress_mobile_app.Page.PageActivity;
import vn.edu.usth.wordpress_mobile_app.Post.PostActivity;
import vn.edu.usth.wordpress_mobile_app.R;

public class AccountActivity extends AppCompatActivity {
    private ImageView btnback;
//    private TextView profile1, accountSettings1, appSettings1, help1, refer1, about1, logout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.account), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnback = findViewById(R.id.back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        RelativeLayout myProfile = findViewById(R.id.my_profile);
        RelativeLayout accountSettings = findViewById(R.id.account_settings);
        RelativeLayout appSettings = findViewById(R.id.app_settings);
        RelativeLayout help = findViewById(R.id.help);
        RelativeLayout about = findViewById(R.id.about_wordpress);

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, MyProfileActivity.class);
                startActivity(intent);
            }
        });

        accountSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });

        appSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, AppSettingsActivity.class);
                startActivity(intent);
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, HelpActivity.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccountActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

    }
}