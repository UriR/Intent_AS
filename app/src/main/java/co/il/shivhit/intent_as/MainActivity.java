package co.il.shivhit.intent_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etName;
    private EditText etAge;
    private Button   btnGoToB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitailizeViews();
    }

    private void InitailizeViews() {

        etName   = findViewById(R.id.etName);
        etAge    = findViewById(R.id.etAge);
        btnGoToB = findViewById(R.id.btnGoToB);

        btnGoToB.setOnClickListener(this);

        /*
        btnGoToB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                intent.putExtra("NAME", etName.getText().toString());
                intent.putExtra("AGE", Integer.valueOf((etAge.getText().toString())));
                startActivity(intent);
            }
        });
         */
    }

    @Override
    public void onClick(View v) {
        /*
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(intent);
        */

        /*
         intent.putExtra("NAME", etName.getText().toString());
        intent.putExtra("AGE", Integer.valueOf((etAge.getText().toString())));
        */
    }
}