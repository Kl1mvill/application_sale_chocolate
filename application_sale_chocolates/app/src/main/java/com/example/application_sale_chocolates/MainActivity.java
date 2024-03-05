package com.example.application_sale_chocolates;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private Spinner spinner;
    private ImageView image;
    private Button button_plus;
    private Button button_manus;
    private TextView text_quantity;
    private TextView text_prise;
    private HashMap<Integer, Integer> prise_hash;
    private Integer prise;
    private Integer count;
    private String nameGoods;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        spinner = findViewById(R.id.spinner);
        image = findViewById(R.id.chocolat);
        button_plus = (Button) findViewById(R.id.button_plus);
        button_manus = findViewById(R.id.button_manus);
        text_quantity = findViewById(R.id.text_quantity);
        text_prise = findViewById(R.id.text_prise);

        String[] arraySpinner = new String[]{"Барбариска", "Гусиные лапки", "Рачка", "Шоколадка",
                "Батончик", "Негр", "Маскарад", "Мурёнка", "Женщина",
                "Тайна", "Клубничка", "Не Еврей", "Лебедь", "Тирамису", "Топовая конфетка"};
        prise_hash = new HashMap<Integer, Integer>();
        prise_hash.put(R.drawable.caramel_barberry, 10);
        prise_hash.put(R.drawable.crow_feet, 20);
        prise_hash.put(R.drawable.crustacean, 30);
        prise_hash.put(R.drawable.chocolat_1, 40);
        prise_hash.put(R.drawable.halvichny_bar, 50);
        prise_hash.put(R.drawable.masquerade, 60);
        prise_hash.put(R.drawable.moray_eel, 70);
        prise_hash.put(R.drawable.secret, 80);
        prise_hash.put(R.drawable.strawberry, 90);
        prise_hash.put(R.drawable.chocolate, 100);
        prise_hash.put(R.drawable.swan, 110);
        prise_hash.put(R.drawable.tiramisu, 120);
        prise_hash.put(R.drawable.top, 130);
        prise_hash.put(R.drawable.peanut_caramel, 140);
        prise_hash.put(R.drawable.samurai_wife, 150);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = (String) parent.getItemAtPosition(position);

                switch (item) {
                    case "Барбариска":
                        image.setImageResource(R.drawable.caramel_barberry);
                        prise = prise_hash.get(R.drawable.caramel_barberry);
                        nameGoods = "Барбариска";
                        break;
                    case "Гусиные лапки":
                        image.setImageResource(R.drawable.crow_feet);
                        prise = prise_hash.get(R.drawable.crow_feet);
                        nameGoods = "Гусиные лапки";
                        break;
                    case "Рачка":
                        image.setImageResource(R.drawable.crustacean);
                        prise = prise_hash.get(R.drawable.crustacean);
                        nameGoods = "Рачка";
                        break;
                    case "Шоколадка":
                        image.setImageResource(R.drawable.chocolat_1);
                        prise = prise_hash.get(R.drawable.chocolat_1);
                        nameGoods = "Шоколадка";
                        break;
                    case "Батончик":
                        image.setImageResource(R.drawable.halvichny_bar);
                        prise = prise_hash.get(R.drawable.halvichny_bar);
                        nameGoods = "Батончик";
                        break;
                    case "Маскарад":
                        image.setImageResource(R.drawable.masquerade);
                        prise = prise_hash.get(R.drawable.masquerade);
                        nameGoods = "Маскарад";
                        break;
                    case "Мурёнка":
                        image.setImageResource(R.drawable.moray_eel);
                        prise = prise_hash.get(R.drawable.moray_eel);
                        nameGoods = "Мурёнка";
                        break;
                    case "Тайна":
                        image.setImageResource(R.drawable.secret);
                        prise = prise_hash.get(R.drawable.secret);
                        nameGoods = "Тайна";
                        break;
                    case "Клубничка":
                        image.setImageResource(R.drawable.strawberry);
                        prise = prise_hash.get(R.drawable.strawberry);
                        nameGoods = "Клубничка";
                        break;
                    case "Не Еврей":
                        image.setImageResource(R.drawable.chocolate);
                        prise = prise_hash.get(R.drawable.chocolate);
                        nameGoods = "Не Еврей";
                        break;
                    case "Лебедь":
                        image.setImageResource(R.drawable.swan);
                        prise = prise_hash.get(R.drawable.swan);
                        nameGoods = "Лебедь";
                        break;
                    case "Тирамису":
                        image.setImageResource(R.drawable.tiramisu);
                        prise = prise_hash.get(R.drawable.tiramisu);
                        nameGoods = "Тирамису";
                        break;
                    case "Топовая конфетка":
                        image.setImageResource(R.drawable.top);
                        prise = prise_hash.get(R.drawable.top);
                        nameGoods = "Топовая конфетка";
                        break;
                    case "Негр":
                        image.setImageResource(R.drawable.peanut_caramel);
                        prise = prise_hash.get(R.drawable.peanut_caramel);
                        nameGoods = "Негр";
                        break;
                    case "Женщина":
                        image.setImageResource(R.drawable.samurai_wife);
                        prise = prise_hash.get(R.drawable.samurai_wife);
                        nameGoods = "Женщина";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);


        View.OnClickListener plus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = text_quantity.getText().toString();
                int foo = parseInt(text);
                count = foo;
                foo++;

                if (foo <= 20) {
                    text_quantity.setText(String.valueOf(foo));


                    text_prise.setText(String.valueOf(foo * prise));
                }
            }
        };

        button_plus.setOnClickListener(plus);


        View.OnClickListener manus = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = text_quantity.getText().toString();
                int foo = parseInt(text);
                count = foo;
                foo--;

                if (foo >= 0) {
                    text_quantity.setText(String.valueOf(foo - 1));

                    text_prise.setText(String.valueOf(foo * prise));
                    Drawable drawable = image.getDrawable();
                    System.out.println(drawable);
                }
            }
        };

        button_manus.setOnClickListener(manus);
    }

    public void addToCard(View view) {
        Intent intent = new Intent(MainActivity.this, CardActivity.class);
        intent.putExtra("prise", prise);
        intent.putExtra("count", count);
        intent.putExtra("userName", String.valueOf(name.getText()));
        intent.putExtra("nameGoods", nameGoods);

        startActivity(intent);

    }
}