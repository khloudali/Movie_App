package myapplication90.khloud.example.com.myapplication_demo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detailes");
        Bundle bundle = new Bundle();
        bundle.putLong("id", getIntent().getExtras().getLong("id"));
        DetailFragmentActivity detailActivityFragment = new  DetailFragmentActivity();
        detailActivityFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.movie_detail_fragment, detailActivityFragment)
                .commit();
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
