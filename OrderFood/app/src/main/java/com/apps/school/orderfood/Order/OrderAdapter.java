package com.apps.school.orderfood.Order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.school.orderfood.Menu.MenuAdapter;
import com.apps.school.orderfood.R;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter{

    ArrayList<OrderItem> menu;
    Context context;

    public OrderAdapter(ArrayList<OrderItem> menu, Context context) {
        this.menu = menu;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.basket_item, parent, false);
        OrderAdapter.ViewHolderBasket vh = new ViewHolderBasket(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((MenuAdapter.ViewHolder)holder).itemname.setText(menu.get(position).getName());
        ((MenuAdapter.ViewHolder)holder).itemprice.setText(menu.get(position).getPrice()+"");
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    public class ViewHolderBasket extends RecyclerView.ViewHolder{


        public TextView itemname, itemprice;
        public View v;


        public ViewHolderBasket(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            itemname = itemView.findViewById(R.id.textViewname);
            itemprice = itemView.findViewById(R.id.textViewprice);


        }
    }
}
