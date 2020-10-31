package arielle.mueller.m301037045;

// Arielle Mueller
// Student ID: 301037045
// Sec: 002


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ArielleActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private EditText editTextUser;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arielle);

        imageView = (ImageView)findViewById(R.id.arielleImageView);

        textView = (TextView) findViewById(R.id.Student);
        editTextUser = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextPassword = (EditText) findViewById(R.id.editTextNumberPassword);
    }
}