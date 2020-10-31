package arielle.mueller.m301037045;

// Arielle Mueller
// Student ID: 301037045
// Sec: 002

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MuellerActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mueller);

        mTextView = (TextView) findViewById(R.id.text);

    }
}