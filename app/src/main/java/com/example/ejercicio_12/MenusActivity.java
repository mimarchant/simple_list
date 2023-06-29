package com.example.ejercicio_12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.ejercicio_12.databinding.ActivityMenusBinding;

public class MenusActivity extends AppCompatActivity {
ActivityMenusBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenusBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getMenus();


    }

    private void getMenus() {
        String[] items = new String[20];
        for (int i = 0; i < items.length; i++) {
            items[i] = "Menú " + (i + 1);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);

        binding.menuList.setAdapter(adapter);

    }
}