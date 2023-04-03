package uqac.dim.shake;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void swap(View view) {
        Intent i = new Intent(this, MainActivity.class);
        Bundle bundle  = ActivityOptions.makeSceneTransitionAnimation(this).toBundle();
        startActivity(i,bundle);

    }
}