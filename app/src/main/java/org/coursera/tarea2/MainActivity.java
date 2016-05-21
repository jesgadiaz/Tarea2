package org.coursera.tarea2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import org.w3c.dom.Text;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextInputLayout tilName, tilTelephone, tilEmail, tilDescription;
    DatePicker datePicker;
    Button button;
    String name, telephone, email, description;
    String year, month, day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tilName = (TextInputLayout) findViewById(R.id.tilName);
        tilTelephone = (TextInputLayout) findViewById(R.id.tilTelephone);
        tilEmail = (TextInputLayout) findViewById(R.id.tilEmail);
        tilDescription = (TextInputLayout) findViewById(R.id.tilDescription);
        button = (Button) findViewById(R.id.nextButton);
        datePicker = (DatePicker) findViewById(R.id.datePicker);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = tilName.getEditText().getText().toString();
                telephone = tilTelephone.getEditText().getText().toString();
                email = tilEmail.getEditText().getText().toString();
                description = tilDescription.getEditText().getText().toString();
                year = Integer.toString(datePicker.getYear());
                month = Integer.toString(datePicker.getMonth());
                day = Integer.toString(datePicker.getDayOfMonth());

                Intent intent = new Intent(MainActivity.this, Confirmar.class);
                intent.putExtra("name", name);
                intent.putExtra("telephone", telephone);
                intent.putExtra("email", email);
                intent.putExtra("description", description);
                intent.putExtra("year", year);
                intent.putExtra("month", month);
                intent.putExtra("day", day);

                startActivity(intent);
            }
        });
    }
}
