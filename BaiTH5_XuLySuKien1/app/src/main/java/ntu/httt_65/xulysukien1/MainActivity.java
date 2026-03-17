package ntu.httt_65.xulysukien1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng với đkhiển tương ứng ở đây
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;

    Button nutCong,nutTru,nutNhan,nutChia;

    void TimDieuKhien() {
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtketQua);
        nutCong =(Button) findViewById(R.id.btnCong);
        nutTru =(Button) findViewById(R.id.btnTru);
        nutNhan =(Button) findViewById(R.id.btnNhan);
        nutChia =(Button) findViewById(R.id.btnChia);
    }
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
        TimDieuKhien();
        // Gắn bộ lắn nghe sự kiện và sử lý cho từng nút
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // xử lý cộng ở đây
                XULY_CONG();
            }
        });
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý trừ ở đây
                XULY_TRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý nhân ở đây
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử chia ở đây
                XULY_CHIA();
            }
        });
    }



    //Xử lý cộng
    void XULY_CONG(){

        //lấy dữ liệu
        String so1=  editTextSo1.getText().toString();
        String so2=  editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 + num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);

    }
    //Xử lý trừ
     void XULY_TRU(){
         String so1=  editTextSo1.getText().toString();
         String so2=  editTextSo2.getText().toString();
         float num1 = Float.parseFloat(so1);
         float num2 = Float.parseFloat(so2);
         float tong = num1 - num2;
         String chuoiKQ = String.valueOf(tong);
         editTextKQ.setText(chuoiKQ);

    }
    //Xử lý nhân
    void XULY_NHAN(){
        String so1=  editTextSo1.getText().toString();
        String so2=  editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 * num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    //Xử lý chia
    void XULY_CHIA(){
        String so1=  editTextSo1.getText().toString();
        String so2=  editTextSo2.getText().toString();
        float num1 = Float.parseFloat(so1);
        float num2 = Float.parseFloat(so2);
        float tong = num1 / num2;
        String chuoiKQ = String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);

    }
}