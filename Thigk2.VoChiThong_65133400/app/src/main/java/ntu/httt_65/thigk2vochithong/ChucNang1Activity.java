package ntu.httt_65.thigk2vochithong;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChucNang1Activity extends AppCompatActivity {

    EditText edtDai, edtRong;
    Button btnChuVi, btnDienTich, btnQuayLai;
    TextView txtKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chuc_nang1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.CN1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        edtDai = findViewById(R.id.edtDai);
        edtRong = findViewById(R.id.edtRong);
        btnChuVi = findViewById(R.id.btnChuVi);
        btnDienTich = findViewById(R.id.btnDienTich);
        btnQuayLai = findViewById(R.id.btnQuayLai);
        txtKetQua = findViewById(R.id.txtKetQua);

        btnChuVi.setOnClickListener(v -> {
            String sDai = edtDai.getText().toString().trim();
            String sRong = edtRong.getText().toString().trim();

            if (sDai.isEmpty() || sRong.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ!", Toast.LENGTH_SHORT).show();
                return;
            }

            double dai = Double.parseDouble(sDai);
            double rong = Double.parseDouble(sRong);

            double chuVi = 2 * (dai + rong);

            txtKetQua.setText("Kết quả: Chu vi = " + chuVi);
        });

        btnDienTich.setOnClickListener(v -> {
            String sDai = edtDai.getText().toString().trim();
            String sRong = edtRong.getText().toString().trim();

            if (sDai.isEmpty() || sRong.isEmpty()) {
                Toast.makeText(this, "Vui lòng nhập đầy đủ!", Toast.LENGTH_SHORT).show();
                return;
            }

            double dai = Double.parseDouble(sDai);
            double rong = Double.parseDouble(sRong);

            double dienTich = dai * rong;

            txtKetQua.setText("Kết quả: Diện tích = " + dienTich);
        });

        btnQuayLai.setOnClickListener(v -> {
            finish();
        });
    }
}