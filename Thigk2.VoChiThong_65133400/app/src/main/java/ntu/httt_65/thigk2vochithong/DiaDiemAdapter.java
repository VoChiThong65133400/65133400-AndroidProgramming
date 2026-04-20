package ntu.httt_65.thigk2vochithong;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DiaDiemAdapter extends BaseAdapter {
    private Context context;
    private List<DiaDiem> list;

    public DiaDiemAdapter(Context context, List<DiaDiem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() { return list.size(); }
    @Override
    public Object getItem(int i) { return list.get(i); }
    @Override
    public long getItemId(int i) { return i; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_diadiem, viewGroup, false);
        }


        DiaDiem item = list.get(i);

        ImageView img = view.findViewById(R.id.imgHinh);
        TextView txtTen = view.findViewById(R.id.tvTenDiaDiem);
        TextView txtDiaChi = view.findViewById(R.id.tvDiaChi);

        // Đổ dữ liệu vào View
        img.setImageResource(item.getHinhAnh());
        txtTen.setText(item.getTen());
        txtDiaChi.setText(item.getDiaChi());

        return view;
    }
}