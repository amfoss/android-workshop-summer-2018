package com.sparker0i.weather;

import android.content.Context;

import java.util.Calendar;

public class Utils {
    public static String setWeatherIcon(Context context , int id) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String str = "";

        if (!(hour < 6 || hour > 18)) {
            switch (id / 100) {
                case 2:
                    if (id <= 202 || id >= 230 && id <= 232)
                        str = context.getString(R.string.wi_day_thunderstorm);
                    else if (id >= 210 && id <= 221)
                        str = context.getString(R.string.wi_day_lightning);
                    break;
                case 3:
                case 5:
                    if (id < 302 || id == 321 || id == 500)
                        str = context.getString(R.string.wi_day_sprinkle);
                    else if (id >= 302 && id <= 314 || id >= 501 && id <= 504)
                        str = context.getString(R.string.wi_day_rain);
                    else if (id == 511)
                        str = context.getString(R.string.wi_day_rain_mix);
                    else if (id <= 522)
                        str = context.getString(R.string.wi_day_showers);
                    else if (id == 531)
                        str = context.getString(R.string.wi_day_storm_showers);
                    break;
                case 6:
                    if (id <= 602)
                        str = context.getString(R.string.wi_day_snow);
                    else if (id <= 620)
                        str = context.getString(R.string.wi_day_rain_mix);
                    else if (id <= 622)
                        str = context.getString(R.string.wi_day_snow);
                    break;
                case 7:
                    if (id == 701)
                        str = context.getString(R.string.wi_day_showers);
                    else if (id == 721)
                        str = context.getString(R.string.wi_day_haze);
                    else if (id == 711)
                        str = context.getString(R.string.wi_smoke);
                    else if (id == 731)
                        str = context.getString(R.string.wi_dust);
                    else if (id == 741)
                        str = context.getString(R.string.wi_day_fog);
                    else if (id <= 762)
                        str = context.getString(R.string.wi_dust);
                    else if (id == 781)
                        str = context.getString(R.string.wi_tornado);
                    break;
                case 8:
                    if (id == 800)
                        str = context.getString(R.string.wi_day_sunny);
                    else if (id <= 803)
                        str = context.getString(R.string.wi_day_cloudy_gusts);
                    else if (id == 804)
                        str = context.getString(R.string.wi_day_sunny_overcast);
                    break;
                case 9:
                    if (id == 900)
                        str = context.getString(R.string.wi_tornado);
                    else if (id == 902)
                        str = context.getString(R.string.wi_hurricane);
                    else if (id == 903)
                        str = context.getString(R.string.wi_snowflake_cold);
                    else if (id == 904)
                        str = context.getString(R.string.wi_hot);
                    else if (id == 906)
                        str = context.getString(R.string.wi_day_hail);
                    else if (id == 957)
                        str = context.getString(R.string.wi_strong_wind);
                    break;
            }
        }
        else {
            switch (id / 100) {
                case 2:
                    if (id <= 202 || id >= 230 && id <= 232)
                        str = context.getString(R.string.wi_night_thunderstorm);
                    else if (id >= 210 && id <= 221)
                        str = context.getString(R.string.wi_night_lightning);
                    break;
                case 3:
                case 5:
                    if (id < 302 || id == 321 || id == 500)
                        str = context.getString(R.string.wi_night_sprinkle);
                    else if (id >= 302 && id <= 314 || id >= 501 && id <= 504)
                        str = context.getString(R.string.wi_night_rain);
                    else if (id == 511)
                        str = context.getString(R.string.wi_night_rain_mix);
                    else if (id <= 522)
                        str = context.getString(R.string.wi_night_showers);
                    else if (id == 531)
                        str = context.getString(R.string.wi_night_storm_showers);
                    break;
                case 6:
                    if (id <= 602)
                        str = context.getString(R.string.wi_night_snow);
                    else if (id <= 620)
                        str = context.getString(R.string.wi_night_rain_mix);
                    else if (id <= 622)
                        str = context.getString(R.string.wi_night_snow);
                    break;
                case 7:
                    if (id == 701)
                        str = context.getString(R.string.wi_night_showers);
                    else if (id == 721)
                        str = context.getString(R.string.wi_day_haze);
                    else if (id == 711)
                        str = context.getString(R.string.wi_smoke);
                    else if (id == 731)
                        str = context.getString(R.string.wi_dust);
                    else if (id == 741)
                        str = context.getString(R.string.wi_night_fog);
                    else if (id <= 762)
                        str = context.getString(R.string.wi_dust);
                    else if (id == 781)
                        str = context.getString(R.string.wi_tornado);
                    break;
                case 8:
                    if (id == 800)
                        str = context.getString(R.string.wi_night_clear);
                    else if (id <= 803)
                        str = context.getString(R.string.wi_night_cloudy_gusts);
                    else if (id == 804)
                        str = context.getString(R.string.wi_night_alt_cloudy);
                    break;
                case 9:
                    if (id == 900)
                        str = context.getString(R.string.wi_tornado);
                    else if (id == 902)
                        str = context.getString(R.string.wi_hurricane);
                    else if (id == 903)
                        str = context.getString(R.string.wi_snowflake_cold);
                    else if (id == 904)
                        str = context.getString(R.string.wi_hot);
                    else if (id == 906)
                        str = context.getString(R.string.wi_night_hail);
                    else if (id == 957)
                        str = context.getString(R.string.wi_strong_wind);
                    break;
            }
        }
        return str;
    }
}
