package country;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.hw34.R;

import continent.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.container,new ContinentFragment()).commit();
    }
}