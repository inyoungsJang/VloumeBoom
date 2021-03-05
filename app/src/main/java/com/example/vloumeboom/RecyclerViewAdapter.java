package com.example.vloumeboom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<Data> mData;

    public RecyclerViewAdapter(ArrayList<Data> data) {
        mData = data;
    }


    @NonNull
    @Override
    //아이템 뷰를 위한 뷰홀더 객체를 생성하여 리턴
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.activity_main_recycler_view__item, parent, false);
        RecyclerViewAdapter.ViewHolder viewHolder = new RecyclerViewAdapter.ViewHolder(view);

        return viewHolder;
    }

    @Override
    // 포지션에 해당하는 데이터를 뷰홀더에 아이템뷰에 표시
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Data data = mData.get(position); //리스트형태의 데이타의 포지션값을 가져옴

        holder.tv_title.setText(data.getTitle());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_profileImage;
        TextView tv_name;
        TextView tv_age;
        TextView tv_sex;
        TextView tv_title;

        ViewHolder(View view) {
            super(view);
            tv_title = view.findViewById(R.id.tv_title);
        }
    }
}




