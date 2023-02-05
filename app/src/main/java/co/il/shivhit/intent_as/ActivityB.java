package co.il.shivhit.intent_as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity /*implements View.OnClickListener*/ {

    private TextView txtName;
    private TextView txtAge;
    private Button   btnGoToA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        InitializeViews();

        //GetExtras();
    }

    private void InitializeViews() {
        txtName  = findViewById(R.id.txtName);
        txtAge   = findViewById((R.id.txtAge));
        btnGoToA = findViewById(R.id.btnGoToA);

        //btnGoToA.setOnClickListener(this);
    }

    private void GetExtras() {
        //txtName.setVisibility(View.VISIBLE);
        //txtAge.setVisibility(View.VISIBLE);

        /*
        String name = getIntent().getStringExtra("NAME");
        int    age  = getIntent().getIntExtra("AGE", 1);

        txtName.setText(name);
        txtAge.setText(String.valueOf(age));
         */
    }

    /*
    @Override
    public void onClick(View v) {
        if (v == btnGoToA){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
     */
}