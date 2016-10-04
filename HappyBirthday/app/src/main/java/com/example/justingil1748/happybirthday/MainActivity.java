package com.example.justingil1748.happybirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static com.example.justingil1748.happybirthday.R.id.quantity_value;


public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        //display(quantity);
        displayPrice(calculatePrice(quantity));
    }

    public int calculatePrice(int quantity) {
        int price = quantity * 5;
        return price;
    }
    public void incrementQuantity(View view) {
        quantity++;
        displayQuantity(quantity);
    }

    public void decrementQuantity(View view) {
        if(quantity > 0)
            quantity--;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(quantity_value);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.text_priceValue);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void displayMessage(String message){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_Summary_text_view);
        orderSummaryTextView.setText(message);

    }



}
