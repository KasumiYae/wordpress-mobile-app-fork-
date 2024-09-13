package vn.edu.usth.wordpress_mobile_app.Account;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import vn.edu.usth.wordpress_mobile_app.R;

public class AccountActivity extends AppCompatActivity {

    private TextView profile, accountSettings, appSettings, help, refer, about, logout;

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


        profile = findViewById(R.id.profile);
        accountSettings = findViewById(R.id.account_settings);
        appSettings = findViewById(R.id.app_settings);
        help = findViewById(R.id.help);
        refer = findViewById(R.id.refer);
        about = findViewById(R.id.about);
        logout = findViewById(R.id.logout);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this, "My Profile", Toast.LENGTH_SHORT).show();
            }
        });

        accountSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this, "Account Settings", Toast.LENGTH_SHORT).show();
            }
        });

        appSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this, "App Settings", Toast.LENGTH_SHORT).show();
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(AccountActivity.this, "Help", Toast.LENGTH_SHORT).show();
            }
        });
        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(AccountActivity.this, "Refer WordPress to Friends", Toast.LENGTH_SHORT).show();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this, "About WordPress", Toast.LENGTH_SHORT).show();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this, " Log Out of Account", Toast.LENGTH_SHORT).show();
            }
        });
    }
}