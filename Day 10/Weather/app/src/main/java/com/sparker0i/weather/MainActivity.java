package com.sparker0i.weather;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    TextView cityView , tempView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String cityName = "Kannur";
        cityView = findViewById(R.id.city);
        tempView = findViewById(R.id.temp);

        execute(new String[]{cityName});
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

    }

    public void execute(String[] args) {
        JSONObject weather = null;

        WeatherTask task = new WeatherTask();
        try {
            if (args.length == 1)
                weather = task.execute(args[0]).get();
            else
                weather = task.execute(args).get();
        }
        catch (InterruptedException iex) {
            iex.printStackTrace();
        }
        catch (ExecutionException ex) {
            ex.printStackTrace();
        }

        try {
            String cityName = weather.getString("name");
            Double temp = weather.getJSONObject("main").getDouble("temp");

            cityView.setText(cityName);
            tempView.setText(temp.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    public void run() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_weather , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.gps) {
            
        }
        return super.onOptionsItemSelected(item);
    }
}
