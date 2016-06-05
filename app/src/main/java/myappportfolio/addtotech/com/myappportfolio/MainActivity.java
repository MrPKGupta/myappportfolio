package myappportfolio.addtotech.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAppMovies = (Button) findViewById(R.id.btnMovies);
        Button btnAppStock = (Button) findViewById(R.id.btnStock);
        Button btnAppBuildBig = (Button) findViewById(R.id.btnBuildBig);
        Button btnAppMaterial = (Button) findViewById(R.id.btnAppMaterial);
        Button btnAppGoUbi = (Button) findViewById(R.id.btnGoUbi);
        Button btnAppCapstone = (Button) findViewById(R.id.btnCapstone);

        btnAppMovies.setOnClickListener(this);
        btnAppStock.setOnClickListener(this);
        btnAppBuildBig.setOnClickListener(this);
        btnAppMaterial.setOnClickListener(this);
        btnAppGoUbi.setOnClickListener(this);
        btnAppCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnMovies:
                showToast(R.string.app_movies);
                return;
            case R.id.btnStock:
                showToast(R.string.app_stock);
                return;
            case R.id.btnBuildBig:
                showToast(R.string.app_build_big);
                return;
            case R.id.btnAppMaterial:
                showToast(R.string.app_material);
                return;
            case R.id.btnGoUbi:
                showToast(R.string.app_go_ubi);
                return;
            case R.id.btnCapstone:
                showToast(R.string.app_capstone);
                return;
        }
    }

    private void showToast(int resId) {
        Toast.makeText(this, getResources().getString(R.string.app_name_format,
                getResources().getString(resId)), Toast.LENGTH_SHORT).show();
    }
}
