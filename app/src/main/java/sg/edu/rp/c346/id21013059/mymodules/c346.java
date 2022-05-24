package sg.edu.rp.c346.id21013059.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class c346 extends AppCompatActivity {
TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;
    TextView tvBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c346);

        //Step 2
// MOD CODE
        tvCode = findViewById(R.id.MC);
        Intent intentReceived = getIntent();
        String code = intentReceived.getStringExtra("code");
        tvCode.setText("Module Code: " + code);


// MOD NAME
        tvName = findViewById(R.id.MN);
        String name = intentReceived.getStringExtra("name");
        tvCode.setText("Module Name: " + name);



        //YEAR
        tvYear = findViewById(R.id.Y);
        int year = intentReceived.getIntExtra("year", 2000);
        // default set as 2000
        tvCode.setText("Academic Year: " + year);



        // SEM
        tvSem = findViewById(R.id.Sem);
        int sem = intentReceived.getIntExtra("sem", 2);
        tvCode.setText("Semester: " + sem);


// CREDIT
        tvCredit = findViewById(R.id.Credit);
        int credit = intentReceived.getIntExtra("credit",5);
        tvCode.setText("Module Credit: " + credit);


// VENUE
        tvVenue = findViewById(R.id.Venue);
        char class1 = intentReceived.getCharExtra("class1",'J');
        int class2 = intentReceived.getIntExtra("class2",99);
        char class3 = intentReceived.getCharExtra("class1",'J');
        tvCode.setText("Venue: " + class1 + class2 + class3);




    }
}