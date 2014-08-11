/*
 * Copyright 2014-present Yunarta
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mobilesolutionworks.android.util;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Most used View functions.
 * <p/>
 * Created by Yunarta on 3/7/14.
 */
public class ViewUtils {
    public static <T extends View> T vuFind(Activity activity, int id, int... ids) {
        View view = activity.findViewById(id);
        if (ids != null) {
            view = vuFind(view, ids);
        }

        return (T) view;
    }

    public static <T extends View> T vuFind(View view, int... ids) {
        View v = view;
        if (v != null) {
            for (int id : ids) {
                v = v.findViewById(id);
                if (v == null) {
                    return null;
                }
            }
        }

        return (T) v;
    }

    public static View vuSetTag(View view, int id, Object data, int... ids) {
        View find = vuFind(view, ids);
        find.setTag(id, data);

        return find;
    }

    public static <T extends View> T vuSetOnClickListener(Activity activity, View.OnClickListener listener, int id, int... ids) {
        View find = vuFind(activity, id, ids);
        find.setOnClickListener(listener);

        return (T) find;
    }

    public static <T extends View> T vuSetOnClickListener(View view, View.OnClickListener listener, int... ids) {
        View find = vuFind(view, ids);
        find.setOnClickListener(listener);

        return (T) find;
    }

    public static <T extends View> T vuSetBackgroundResource(Activity activity, int background, int id, int... ids) {
        View find = vuFind(activity, id, ids);
        find.setBackgroundResource(background);

        return (T) find;
    }

    public static <T extends View> T vuSetBackgroundResource(View view, int background, int... ids) {
        View find = vuFind(view, ids);
        find.setBackgroundResource(background);

        return (T) find;
    }

    public static <T extends View> T vuSetVisibility(Activity activity, int visibility, int id, int... ids) {
        View find = vuFind(activity, id, ids);
        find.setVisibility(visibility);

        return (T) find;
    }

    public static <T extends View> T vuSetVisibility(View view, int visibility, int... ids) {
        View find = vuFind(view, ids);
        find.setVisibility(visibility);

        return (T) find;
    }

    public static <T extends View> T vuSetImageResource(Activity activity, int drawable, int id, int... ids) {
        ImageView find = vuFind(activity, id, ids);
        find.setImageResource(drawable);

        return (T) find;
    }

    public static <T extends View> T vuSetImageResource(View view, int drawable, int... ids) {
        ImageView find = vuFind(view, ids);
        find.setImageResource(drawable);

        return (T) find;
    }

    public static void vuSetTextColor(Activity activity, int color, int id, int... ids) {
        TextView textView = vuFind(activity, id, ids);
        textView.setTextColor(color);
    }

    public static void vuSetTextColor(View view, int color, int... ids) {
        TextView textView = vuFind(view, ids);
        textView.setTextColor(color);
    }

    public static TextView vuSetText(Activity activity, String text, int id, int... ids) {
        TextView textView = vuFind(activity, id, ids);
        textView.setText(text);

        return textView;
    }

    public static TextView vuSetText(View view, String text, int... ids) {
        if (text == null) {
            text = "";
        }
        TextView textView = vuFind(view, ids);
        textView.setText(text);

        return textView;
    }

    public static void vuSetEnabled(Activity activity, boolean enabled, int id, int... ids) {
        View find = vuFind(activity, id, ids);
        find.setEnabled(enabled);
    }

    public static void vuSetEnabled(View view, boolean enabled, int... ids) {
        View find = vuFind(view, ids);
        find.setEnabled(enabled);
    }

    public static CharSequence vuGetText(Activity activity, int id, int... ids) {
        TextView textView = vuFind(activity, id, ids);
        return textView.getText();
    }

    public static CharSequence vuGetText(View view, int... ids) {
        TextView textView = vuFind(view, ids);
        return textView.getText();
    }
}
