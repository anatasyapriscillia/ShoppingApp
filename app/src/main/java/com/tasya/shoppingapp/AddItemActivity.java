package com.tasya.shoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddItemActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM="com.tasya.shoppingapp";

    private Button Apple;
    private Button Cheese;
    private Button Rice;
    private Button Potato;
    private Button Corn;
    private Button Grape;
    private Button Banana;
    private Button Tomato;
    private Button Cabbage;
    private Button Chili;

    private String itemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        Apple = findViewById(R.id.Apple);
        Cheese = findViewById(R.id.Cheese);
        Rice = findViewById(R.id.Rice);
        Potato = findViewById(R.id.Potato);
        Corn = findViewById(R.id.Corn);
        Grape = findViewById(R.id.Grape);
        Banana = findViewById(R.id.Banana);
        Tomato = findViewById(R.id.Tomato);
        Cabbage = findViewById(R.id.Cabbage);
        Chili = findViewById(R.id.Chili);
    }

    public void addApple(View view) {
        itemText = Apple.getText().toString();
        sendItem(itemText);
    }

    public void addCheese(View view) {
        itemText = Cheese.getText().toString();
        sendItem(itemText);
    }

    public void addRice(View view) {
        itemText = Rice.getText().toString();
        sendItem(itemText);
    }

    public void addPotato(View view) {
        itemText = Potato.getText().toString();
        sendItem(itemText);
    }
    public void addCorn(View view) {
        itemText = Corn.getText().toString();
        sendItem(itemText);
    }
    public void addGrape(View view) {
        itemText = Grape.getText().toString();
        sendItem(itemText);
    }
    public void addBanana(View view) {
        itemText = Banana.getText().toString();
        sendItem(itemText);
    }
    public void addTomato(View view) {
        itemText = Tomato.getText().toString();
        sendItem(itemText);
    }
    public void addCabbage(View view) {
        itemText = Cabbage.getText().toString();
        sendItem(itemText);
    }
    public void addChili(View view) {
        itemText = Chili.getText().toString();
        sendItem(itemText);
    }


    public void sendItem (String itemText){
        Intent itemIntent = new Intent();
        itemIntent.putExtra(EXTRA_ITEM, itemText);
        setResult(RESULT_OK, itemIntent);
        finish();
    }
}
