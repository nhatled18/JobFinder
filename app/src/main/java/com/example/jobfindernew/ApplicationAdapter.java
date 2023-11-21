package com.example.jobfindernew;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ApplicationAdapter extends RecyclerView.Adapter<ApplicationAdapter.ApplicationViewHolder> {

    private List<Application> applications;

    // Constructor và các phương thức khác

    @NonNull
    @Override
    public ApplicationViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_application, parent, false);
        return new ApplicationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ApplicationViewHolder holder, final int position) {
        final Application application = this.applications.get(position);

        // Hiển thị thông tin từ application trên item view
        // Ví dụ: holder.textView.setText(application.getSomeInfo());

        // Gắn sự kiện click cho button detail
        holder.btnDetail.setOnClickListener(v -> {
            // Xử lý sự kiện khi người dùng nhấn vào button detail
            // Ví dụ: mở màn hình chi tiết thông tin application
        });
    }

    @Override
    public int getItemCount() {
        return null != applications ? this.applications.size() : 0;
    }

    static class ApplicationViewHolder extends RecyclerView.ViewHolder {
        // Khai báo các View trong item layout
        // Ví dụ: TextView textView;
        ImageButton btnDetail;

        ApplicationViewHolder(@NonNull final View itemView) {
            super(itemView);
            // Ánh xạ các View
            // Ví dụ: textView = itemView.findViewById(R.id.text_view);
            this.btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}