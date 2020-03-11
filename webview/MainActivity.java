package google.tamayo.christopher.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.PrintWriter;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.txt_web);
    }
    public void Ir(View view){
        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("sitio", et1.getText().toString());
        startActivity(i);
    }

}
