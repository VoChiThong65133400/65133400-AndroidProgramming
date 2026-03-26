package ntu.httt_65.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Tìm listview
        ListView lvDSMonAn = (ListView)  findViewById(R.id.lvDSMonAn);

        //chuẩn bị nguồn dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Cơm tấm sườn", 25000, "Mô tả ở đây", R.drawable.cts));
        dsMonAn.add(new MonAn("Cơm tấm sườn trứng", 27000, "Mô tả ở đây", R.drawable.ctst));
        dsMonAn.add(new MonAn("Cơm gà xối mỡ", 30000, "Mô tả ở đây", R.drawable.cgxm));
        dsMonAn.add(new MonAn("Cơm tấm sườn bì chả", 32000, "Mô tả ở đây", R.drawable.ctsbc));
        dsMonAn.add(new MonAn("Cơm tấm đặc biệt", 35000, "Mô tả ở đây", R.drawable.ctdb));

        //
        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        //Bắt xử lý sự kiện
        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //lấy phần tử được chạm
                MonAn monAnChon = dsMonAn.get(position);
                //Làm gì đó, tùy bài
                Toast.makeText(MainActivity.this,monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}