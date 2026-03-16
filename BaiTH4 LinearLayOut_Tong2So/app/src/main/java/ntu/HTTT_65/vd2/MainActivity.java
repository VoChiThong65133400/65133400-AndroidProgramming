package ntu.HTTT_65.vd2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.view.View;
import android.widget.EditText;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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
    }

    //Xử lý cộng
    void XuLyCong(View v){
        //Code xử lý cộng ở đây
        //b1. lấy được dữ liệu 2 số
        //b1.1. Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2. Lấy dữ liệu từ 2 đkhiển đó
        String soThu1=  editTextSo1.getText().toString();
        String soThu2=  editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Tong = soA + soB;
        //b3. Hiện kết quả
        EditText editTextKQ = (EditText)findViewById(R.id.edtketQua);
        //b3.2. chuyển dữ liệu xuất,từ số biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3. gắn kết quả
        editTextKQ.setText(chuoiKQ);

    }
    //Xử lý trừ
    void XuLyTru(View v){
        //Code xử lý trừ ở đây
        //b1. lấy được dữ liệu 2 số
        //b1.1. Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2. Lấy dữ liệu từ 2 đkhiển đó
        String soThu1=  editTextSo1.getText().toString();
        String soThu2=  editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Tong = soA - soB;
        //b3. Hiện kết quả
        EditText editTextKQ = (EditText)findViewById(R.id.edtketQua);
        //b3.2. chuyển dữ liệu xuất,từ số biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3. gắn kết quả
        editTextKQ.setText(chuoiKQ);

    }
    //Xử lý nhân
    void XuLyNhan(View v){
        //Code xử lý nhân ở đây
        //b1. lấy được dữ liệu 2 số
        //b1.1. Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2. Lấy dữ liệu từ 2 đkhiển đó
        String soThu1=  editTextSo1.getText().toString();
        String soThu2=  editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Tong = soA * soB;
        //b3. Hiện kết quả
        EditText editTextKQ = (EditText)findViewById(R.id.edtketQua);
        //b3.2. chuyển dữ liệu xuất,từ số biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3. gắn kết quả
        editTextKQ.setText(chuoiKQ);
    }
    //Xử lý chia
    void XuLyChia(View v){
        //Code xử lý chia ở đây
        //b1. lấy được dữ liệu 2 số
        //b1.1. Tìm EditText số 1 và số 2
        EditText editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        EditText editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        //b1.2. Lấy dữ liệu từ 2 đkhiển đó
        String soThu1=  editTextSo1.getText().toString();
        String soThu2=  editTextSo2.getText().toString();
        //b1.3. Chuyển dữ liệu từ chuỗi sang số
        float soA = Float.parseFloat(soThu1);
        float soB = Float.parseFloat(soThu2);
        //b2.Tính toán
        float Tong = soA / soB;
        //b3. Hiện kết quả
        EditText editTextKQ = (EditText)findViewById(R.id.edtketQua);
        //b3.2. chuyển dữ liệu xuất,từ số biến thành dạng chuỗi
        String chuoiKQ = String.valueOf(Tong);
        //b3.3. gắn kết quả
        editTextKQ.setText(chuoiKQ);

    }
}