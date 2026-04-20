package ntu.httt_65.thigk2vochithong;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ChucNang3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.CN3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ListView lv = findViewById(R.id.lvDuLich);
        ArrayList<DiaDiem> ds = new ArrayList<>();

        ds.add(new DiaDiem("VinWonders Nha Trang (Đảo Hòn Tre)", "Đảo Hòn Tre, phường Vĩnh Nguyên, TP. Nha Trang", R.drawable.dulich1));
        ds.add(new DiaDiem("Tháp Bà Ponagar", "Đường Hai Tháng Tư, Vĩnh Phước, TP. Nha Trang", R.drawable.dulich2));
        ds.add(new DiaDiem("Viện Hải dương học Nha Trang", "Đảo Hòn Tre", R.drawable.dulich3));
        ds.add(new DiaDiem("hòn chồng", "Đường Phạm Văn Đồng, Phường Vĩnh Phước, TP Nha Trang", R.drawable.dulich4));
        ds.add(new DiaDiem("Chùa Long Sơn", "Vịnh Nha Phu", R.drawable.dulich5));

        DiaDiemAdapter adapter = new DiaDiemAdapter(this, ds);
        lv.setAdapter(adapter);
    }
}