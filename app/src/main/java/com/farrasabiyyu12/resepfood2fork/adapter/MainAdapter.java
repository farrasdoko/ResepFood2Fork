package com.farrasabiyyu12.resepfood2fork.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.farrasabiyyu12.resepfood2fork.Main.activity.MainActivity;
import com.farrasabiyyu12.resepfood2fork.Main.model.RecipesItem;
import com.farrasabiyyu12.resepfood2fork.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    Context context;
    List<RecipesItem> recipesItems;

    public MainAdapter(Context context, List<RecipesItem> data) {
        this.context = context;
        this.recipesItems = data;
    }

    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.recy_layout, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder myViewHolder, int i) {
        RecipesItem resep = recipesItems.get(i);
        myViewHolder.publisherMain.setText(resep.getPublisher());
        myViewHolder.titleMain.setText(resep.getTitle());
        try {
            Glide.with(context)
                    .load(recipesItems.get(i).getImageUrl())
                    .into(myViewHolder.imgMain);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try{
//            Glide.with(context)
//                    .load(resep.getImageUrl())
//                    .into(myViewHolder.imgMain);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public int getItemCount() {
        return recipesItems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleMain, publisherMain;
        ImageView imgMain;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleMain = itemView.findViewById(R.id.titleMain);
            publisherMain = itemView.findViewById(R.id.publisherMain);
            imgMain = itemView.findViewById(R.id.img_view);
        }
    }
}
