package sg.edu.rp.webservices.smsretriever;

import android.content.pm.PackageManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment F1 = new FragmentNumber();
        ft.replace(R.id.frame1, F1);

        Fragment F2 = new FragmentWord();
        ft.replace(R.id.frame2, F2);
        ft.commit();


    }



}
