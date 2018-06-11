package com.sparker0i.weather;

import android.net.Uri;
import android.os.AsyncTask;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherTask extends AsyncTask<String , Void , JSONObject> {

    private String URL = "https://api.openweathermap.org/data/2.5/weather?";

    @Override
    protected JSONObject doInBackground(String... strings) {
        Uri uri;
        uri = Uri.parse(URL).buildUpon()
                .appendQueryParameter("q" , strings[0])
                .appendQueryParameter("appId" , "d5a6ea70ae01e251d9649590d525a286")
                .appendQueryParameter("units" , "metric")
                .build();

        HttpURLConnection connection = null;
        InputStream is = null;

        try {
            java.net.URL url = new URL(uri.toString());

            connection = (HttpURLConnection) url.openConnection();
            is = connection.getInputStream();

            StringBuffer buffer = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line + "\n");
            }

            JSONObject obj = new JSONObject(buffer.toString());
            return obj;
        }
        catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
        catch (IOException iex) {
            iex.printStackTrace();
        }
        catch (JSONException jex) {
            jex.printStackTrace();
        }
        finally {
            try {
                is.close();
                connection.disconnect();
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        return null;
    }
}
