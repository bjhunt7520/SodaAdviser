package org.pltw.examples.sodaadviser;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button find_soda;
    private TextView brands;
    private Spinner color;
    private SodaExpert expert = new SodaExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        find_soda = (Button)findViewById(R.id.find_soda);
        brands = (TextView)findViewById(R.id.brands);
        color = (Spinner)findViewById(R.id.color);

        find_soda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedColor = String.valueOf(color.getSelectedItem());

                List<String> brandsList = expert.getBrands(selectedColor);
                StringBuilder brandsFormatted = new StringBuilder();
                for (String brand : brandsList) {
                    brandsFormatted.append(brand).append('\n');
                }
                brands.setText(brandsFormatted);

            }
        });
    }
}
