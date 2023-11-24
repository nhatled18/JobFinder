package com.example.jobfindernew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {
    private List<Notification> notifications = new ArrayList<>();

    // Constructor để khởi tạo Adapter
    public NotificationAdapter() {
    }

    // Phương thức để thiết lập dữ liệu mới cho Adapter
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
        notifyDataSetChanged();
    }

    // Phương thức để tạo ViewHolder mới
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notification, parent, false);
        return new ViewHolder(view);
    }

    // Phương thức để gắn dữ liệu vào ViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Notification notification = notifications.get(position);
        holder.bind(notification);
    }

    // Phương thức để trả về số lượng item trong danh sách
    @Override
    public int getItemCount() {
        return notifications.size();
    }

    // Lớp ViewHolder để giữ các thành phần giao diện người dùng
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView titleTextView;
        private final TextView createdAtTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView); // Thay R.id.titleTextView bằng ID thích hợp
            createdAtTextView = itemView.findViewById(R.id.createdAtTextView); // Thay R.id.createdAtTextView bằng ID thích hợp
        }

        // Phương thức để gắn dữ liệu vào các thành phần giao diện người dùng
        public void bind(Notification notification) {
            titleTextView.setText(notification.getMessage());
            createdAtTextView.setText(notification.getCreatedAt());
        }
    }
}
