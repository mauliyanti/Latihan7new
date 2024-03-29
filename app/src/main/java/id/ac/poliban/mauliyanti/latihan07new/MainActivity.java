package id.ac.poliban.mauliyanti.latihan07new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar()!= null) getSupportActionBar().setTitle("Main Activity");

        Button btExplicit = findViewById(R.id.btExplicit);
        Button btImplicit = findViewById(R.id.btImplicit);

        btExplicit.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });

            btImplicit.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https:/github.com/mauliyanti"));
            startActivity(intent);

        });

    }
}
