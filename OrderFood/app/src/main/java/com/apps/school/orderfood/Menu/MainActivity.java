package com.apps.school.orderfood.Menu;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apps.school.orderfood.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> menu = new ArrayList<>();
    // نعرف الفايربيز

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView menulist = findViewById(R.id.rv);
        menulist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        menulist.setLayoutManager(lm);


        // نقرا من الداتا بيز ونضيف للسته

        MenuAdapter adapter = new MenuAdapter(menu, this);
        menulist.setAdapter(adapter);



    }
}