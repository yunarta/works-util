package com.mobilesolutionworks.android.util;

import android.text.TextUtils;

/**
 * Created by yunarta on 15/5/14.
 */
public class ValidateUtils
{
    public static boolean isEmpty(CharSequence... args)
    {
        for (CharSequence arg : args)
        {
            if (TextUtils.isEmpty(arg))
            {
                return true;
            }
        }

        return false;
    }
}
