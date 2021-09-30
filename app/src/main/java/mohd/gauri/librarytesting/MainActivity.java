package mohd.gauri.librarytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import mohd.gauri.mylibrary.FirstClass;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void hello(View view) {
        FirstClass.ToastHello(this,"this is my message");
    }
}