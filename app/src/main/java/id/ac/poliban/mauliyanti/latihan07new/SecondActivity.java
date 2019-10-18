package id.ac.poliban.mauliyanti.latihan07new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getSupportActionBar()!= null)
            getSupportActionBar().setTitle("Second Activity");
    }
}
