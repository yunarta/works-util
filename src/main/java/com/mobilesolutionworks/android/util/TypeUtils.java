package com.mobilesolutionworks.android.util;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by yunarta on 22/1/14.
 *
 */
public class TypeUtils
{
    public static String json(String ... args) {
        JSONObject object = new JSONObject();
        for (int i = 0; i < args.length / 2; i++)
        {
            try
            {
                object.put(args[i * 2], args[i * 2 + 1]);
            }
            catch (JSONException e)
            {
                // e.printStackTrace();
            }
        }
        return object.toString();
    }

    public static float parseFloat(String value)
    {
        return parseFloat(value, 0);
    }

    public static float parseFloat(String value, float fallback)
    {
        if (value == null || value.length() == 0)
        {
            return fallback;
        }

        try
        {
            return Float.parseFloat(value);
        }
        catch (Exception e)
        {
            return fallback;
        }
    }

    public static double parseDouble(String value)
    {
        return parseDouble(value, 0);
    }

    public static double parseDouble(String value, double fallback)
    {
        if (value == null || value.length() == 0)
        {
            return fallback;
        }

        try
        {
            return Double.parseDouble(value);
        }
        catch (Exception e)
        {
            return fallback;
        }
    }

    public static int parseInt(String value)
    {
        return parseInt(value, 0);
    }

    public static int parseInt(String value, int fallback)
    {
        if (value == null || value.length() == 0)
        {
            return fallback;
        }

        try
        {
            return Integer.parseInt(value);
        }
        catch (Exception e)
        {
            return fallback;
        }
    }

    public static long parseLong(String value)
    {
        return parseLong(value, 0);
    }

    public static long parseLong(String value, long fallback)
    {
        if (value == null || value.length() == 0)
        {
            return fallback;
        }

        try
        {
            return Long.parseLong(value);
        }
        catch (Exception e)
        {
            return fallback;
        }
    }
}
