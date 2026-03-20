package ntu.httt_65.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Khai báo biến
    ListView lvSmartPhone;
    ArrayList<String> dsDienThoai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Xử lý tràn viền
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //B1: Ánh xạ ListView từ XML
        lvSmartPhone = findViewById(R.id.lvSmartPhone);

        //B2: Tạo nguồn dữ liệu (Data Source)
        dsDienThoai = new ArrayList<>();
        dsDienThoai.add("iPhone 15 Pro Max");
        dsDienThoai.add("Samsung Galaxy S24 Ultra");
        dsDienThoai.add("Xiaomi 14");
        dsDienThoai.add("Oppo Reno 11");
        dsDienThoai.add("Google Pixel 8");
        dsDienThoai.add("Sony Xperia 1 V");
        dsDienThoai.add("Motorola Edge+");
        dsDienThoai.add("Asus ROG Phone 8");
        dsDienThoai.add("Nokia G42");
        dsDienThoai.add("Huawei P60 Pro");
        dsDienThoai.add("Realme GT 5");
        dsDienThoai.add("Vivo X100");
        dsDienThoai.add("Techno Phantom V");
        dsDienThoai.add("Infinix Zero 30");
        dsDienThoai.add("HTC Desire 22");
        dsDienThoai.add("Techno Pova 6");

        //B3: Tạo Adapter (Dùng để nối Data Source tới AdapterView)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsDienThoai
        );

        // B4: Đổ dữ liệu lên ListView
        lvSmartPhone.setAdapter(adapter);
    }
}