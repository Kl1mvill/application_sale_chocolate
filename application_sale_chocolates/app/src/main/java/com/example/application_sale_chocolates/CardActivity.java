package com.example.application_sale_chocolates;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import javax.security.auth.Subject;

public class CardActivity extends AppCompatActivity {

    private TextView orderText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        orderText = findViewById(R.id.textOrder);

        Intent intent = getIntent();

        int count = intent.getIntExtra("count", 0);
        int prise = intent.getIntExtra("prise", 0);
        String userName = intent.getStringExtra("userName");
        String nameGoods = intent.getStringExtra("nameGoods");

        orderText.setText("Имя - " + userName + "\nВы покупаете - " + nameGoods + "\nКолличество - " + count + "\nСумма заказа - " + prise * count);


    }
    public void sendOrderInfo(View view) {
        String[] addresses = {"petrrudichev@gmail.com"};
        String subject = "Заказ товара";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(orderText.getText()));

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        


    }
}