package org.coursera.tarea2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by rodomualdo on 20/05/2016.
 */
public class Confirmar extends AppCompatActivity{

    String name, telephone, email, description;
    String year, day, month;

    TextView tvName, tvTelephone, tvEmail, tvDescription, tvBirthday;

    Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmar_layout);

        tvName = (TextView) findViewById(R.id.tvName);
        tvTelephone = (TextView) findViewById(R.id.tvTelephone);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvBirthday = (TextView) findViewById(R.id.tvBirthday);
        button = (Button) findViewById(R.id.buttonEdit);

        Bundle b = getIntent().getExtras();
        name = b.getString("name");
        telephone = b.getString("telephone");
        email = b.getString("email");
        description = b.getString("description");
        year = b.getString("year");
        day = b.getString("day");
        month = b.getString("month");

        int mont_int = Integer.parseInt(month) + 1;
        month = Integer.toString(mont_int);

        tvName.setText(name);
        tvTelephone.setText(getText(R.string.telephone) + ": " + telephone);
        tvEmail.setText(getText(R.string.email) + ": " + email);
        tvDescription.setText(getText(R.string.description) + ": " + description);
        tvBirthday.setText(getText(R.string.birthday) + ": " + day + "/" + month + "/" + year);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
