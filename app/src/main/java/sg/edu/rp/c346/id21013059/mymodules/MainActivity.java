package sg.edu.rp.c346.id21013059.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView c346;
TextView c203;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           //Event handling Step 2
        c346 = findViewById(R.id.C346);
        c203 = findViewById(R.id.C203);


c346.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, c346.class);
        // giving main activity intention to go to the second activity..
        intent.putExtra("ModuleCode", "C346");
        // PASSING, storing value to bring to the second activity
        intent.putExtra("name", "Android Programming");
        intent.putExtra("year", "2020");
        intent.putExtra("sem", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("class1", "W");
        intent.putExtra("class2", "66");
        intent.putExtra("class3", "M");

        startActivity(intent);
        // initialise, bring user to next activity....
    }
});


c203.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, c346.class);
        intent.putExtra("ModuleCode", "C203");
        // PASSING, storing value to bring to the second activity
        intent.putExtra("name", "Web Application");
        intent.putExtra("year", "2020");
        intent.putExtra("sem", "1");
        intent.putExtra("credit", "4");
        intent.putExtra("class1", "W");
        intent.putExtra("class2", "66");
        intent.putExtra("class3", "M");

        startActivity(intent);
        // initialise, bring user to next activity....

    }
});

















    }
}




