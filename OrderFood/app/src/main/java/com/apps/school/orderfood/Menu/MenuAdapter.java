package com.apps.school.orderfood.Menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.school.orderfood.DetailsActivity;
import com.apps.school.orderfood.R;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter {

    ArrayList<Food> menu;
    Context context;

    public MenuAdapter(ArrayList<Food> menu, Context context) {
        this.menu = menu;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        ((ViewHolder)holder).itempimg.setImageResource(menu.get(position).getPicture());
        ((ViewHolder)holder).itemname.setText(menu.get(position).getName());
        ((ViewHolder)holder).itemdesc.setText(menu.get(position).getDescription());
        ((ViewHolder)holder).itemprice.setText(menu.get(position).getPrice()+"");
        ((ViewHolder)holder).v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra("item" , menu.get(position));
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itempimg;
        public TextView itemname, itemdesc, itemprice;
        public View v;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            itempimg = itemView.findViewById(R.id.imageViewitem);
            itemname = itemView.findViewById(R.id.textViewname);
            itemdesc = itemView.findViewById(R.id.textViewdesc);
            itemprice = itemView.findViewById(R.id.textViewprice);


        }
    }


}
