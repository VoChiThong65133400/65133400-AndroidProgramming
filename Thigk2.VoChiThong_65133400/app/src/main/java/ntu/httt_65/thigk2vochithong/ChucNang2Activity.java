package ntu.httt_65.thigk2vochithong;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.CN2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView lvTinhThanh = findViewById(R.id.lvTinhThanh);
        Button btnBack = findViewById(R.id.btnBackCN2);

        ArrayList<String> dsTinhThanh = new ArrayList<>();
        dsTinhThanh.add("Khánh Hòa");
        dsTinhThanh.add("Hà Nội");
        dsTinhThanh.add("TP. Hồ Chí Minh");
        dsTinhThanh.add("Đà Nẵng");
        dsTinhThanh.add("Lâm Đồng");
        dsTinhThanh.add("Bình Định");
        dsTinhThanh.add("Phú Yên");
        dsTinhThanh.add("Ninh Thuận");
        dsTinhThanh.add("Đắk Lắk");
        dsTinhThanh.add("Võ Chí Thông - 65133400");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dsTinhThanh
        );

        lvTinhThanh.setAdapter(adapter);
        btnBack.setOnClickListener(v -> finish());
    }
}