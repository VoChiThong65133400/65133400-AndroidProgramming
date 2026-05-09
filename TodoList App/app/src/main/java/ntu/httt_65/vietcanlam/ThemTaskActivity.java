package ntu.httt_65.vietcanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_them_task);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. Ánh xạ và lấy dữ liệu từ giao diện
                EditText editTextName = findViewById(R.id.editTextTenCV);
                EditText editTextMess = findViewById(R.id.editTextMesage);
                EditText editTextDate = findViewById(R.id.editTextDate);
                EditText editTextPrio = findViewById(R.id.editTextPrio);

                String tenCV = editTextName.getText().toString();
                String mess = editTextMess.getText().toString();
                String date = editTextDate.getText().toString();
                String prio = editTextPrio.getText().toString();

                // 2. Gói vào đối tượng TASKS
                // LƯU Ý: Thứ tự trong class TASKS của bạn là: (name, priority, message, date)
                TASKS task = new TASKS(tenCV, prio, mess, date);

                // 3. Kết nối DB và thêm dữ liệu
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference databaseReference = database.getReference("TASKS");

                // Tạo một key ngẫu nhiên
                String key = databaseReference.push().getKey();

                // Dùng HashMap để cập nhật
                HashMap<String, Object> item = new HashMap<>();
                item.put(key, task.toFirebaseObject());

                databaseReference.updateChildren(item, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        if (error == null) {
                            // Nếu thành công thì đóng Activity để quay về danh sách
                            finish();
                        }
                    }
                });
            }
        });
    }
}