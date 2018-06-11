package com.sparker0i.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        String cityName = "Kayankulam";
        cityView = findViewById(R.id.city);
        tempView = findViewById(R.id.temp);


    }

    public void execute(String city) {
        JSONObject weather = null;

        WeatherTask task = new WeatherTask();
        try {
            weather = task.execute(city).get();
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


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
