package vn.edu.usth.wordpress_mobile_app.Account;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import vn.edu.usth.wordpress_mobile_app.R;

public class AccountActivity extends AppCompatActivity {
    private ImageView btnback;
    private TextView profile1, accountSettings1, appSettings1, help1, refer1, about1, logout1;

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


        profile1 = findViewById(R.id.profile);
        accountSettings1 = findViewById(R.id.account_settings);
        appSettings1 = findViewById(R.id.app_settings);
        help1 = findViewById(R.id.help);
        refer1 = findViewById(R.id.refer);
        about1 = findViewById(R.id.about);
        logout1 = findViewById(R.id.logout);
    }
}