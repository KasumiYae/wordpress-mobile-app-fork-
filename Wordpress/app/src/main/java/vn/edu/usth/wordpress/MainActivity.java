package vn.edu.usth.wordpress;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // khai báo các thành phần giao diện
    private TextView profile, accountSettings, appSettings, help, refer, about, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Liên kết với layout activity_main.xml
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Khởi tạo các thành phần giao diện từ file xml
        profile = findViewById(R.id.profile);
        accountSettings = findViewById(R.id.account_settings);
        appSettings = findViewById(R.id.app_settings);
        help = findViewById(R.id.help);
        refer = findViewById(R.id.refer);
        about = findViewById(R.id.about);
        logout = findViewById(R.id.logout);

        // Gán sự kiện nhấp chuột cho các TextView
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Hồ sơ của tôi"
                Toast.makeText(MainActivity.this, "Hồ sơ của tôi", Toast.LENGTH_SHORT).show();
            }
        });

        accountSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Cài đặt tài khoản"
                Toast.makeText(MainActivity.this, "Cài đặt tài khoản", Toast.LENGTH_SHORT).show();
            }
        });

        appSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Cài đặt ứng dụng"
                Toast.makeText(MainActivity.this, "Cài đặt ứng dụng", Toast.LENGTH_SHORT).show();
            }
        });

        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Help"
                Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
            }
        });

        refer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Giới thiệu WordPress cho bạn bè"
                Toast.makeText(MainActivity.this, "Giới thiệu WordPress cho bạn bè", Toast.LENGTH_SHORT).show();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Về WordPress"
                Toast.makeText(MainActivity.this, "Về WordPress", Toast.LENGTH_SHORT).show();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi nhấp vào "Đăng xuất tài khoản"
                Toast.makeText(MainActivity.this, "Đăng xuất tài khoản", Toast.LENGTH_SHORT).show();
            }
        });
    }
}