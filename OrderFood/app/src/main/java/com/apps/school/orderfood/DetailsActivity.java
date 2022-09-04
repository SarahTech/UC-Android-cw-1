package com.apps.school.orderfood;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.apps.school.orderfood.Menu.Food;

public class DetailsActivity extends AppCompatActivity {

    ImageView img;
    TextView name, desc, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
        Food item = (Food) b.getSerializable("item");

        img = findViewById(R.id.imageView);
        name = findViewById(R.id.textView);
        desc = findViewById(R.id.textView2);
        price = findViewById(R.id.textView3);

        name.setText(item.getName());
        desc.setText(item.getDescription());
        price.setText(item.getPrice()+"");
        // Use Picasso
        img.setImageResource(item.getPicture());




    }
}