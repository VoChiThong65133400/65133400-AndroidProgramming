package ntu.httt_65.vddongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub_one);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Hàm đáp ứng sự kiện nhấn nút "Quay lại trang chủ"
    //Xử lý chuyển về màn hình trang chủ
    public void Quayve(View v){
        //Tạo một đối tượng Intent
        //Tham số thứ 2 của haàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
        Intent iManHinhChinh = new Intent(this, MainActivity.class);
        //Thực hiện chuyển
        startActivity(iManHinhChinh);
    }
}