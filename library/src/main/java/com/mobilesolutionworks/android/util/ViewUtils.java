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
@SuppressWarnings({"unchecked", "unused"})
public class ViewUtils {

    @Deprecated
    public static <T extends View> T vuFind(Activity activity, int id, int... ids) {
        View view = activity.findViewById(id);
        if (ids != null) {
            view = vuFind(view, ids);
        }

        return (T) view;
    }

    public static <T extends View> T vuFind(Activity activity, int id) {
        return (T) activity.findViewById(id);
    }

    @Deprecated
    public static <T extends View> T vuFind(View view, int... ids) {
        View v = view;
        if (v != null) {
            for (int id : ids) {
                v = view.findViewById(id);
                if (v == null) {
                    v = view.getRootView().findViewById(id);
                }
            }
        }

        return (T) v;
    }

    public static <T extends View> T vuFind(View view, int id) {
        View v = view;
        if (v != null) {
            v = view.findViewById(id);
            if (v == null) {
                v = view.getRootView().findViewById(id);
            }

        }
        return (T) v;
    }


    public static <T extends View> void vuSetTag(View view, int key, Object data, int... ids) {
        for(int id : ids) {
            View find = vuFind(view, id);
            find.setTag(key, data);
        }
    }

    public static <T extends View> void vuSetOnClickListener(View view, View.OnClickListener listener, int... ids) {
        for(int id : ids) {
            View find = vuFind(view, id);
            find.setOnClickListener(listener);
        }
    }

    public static <T extends View> void vuSetOnClickListener(Activity activity, View.OnClickListener listener, int... ids) {
        for(int id : ids) {
            View find = vuFind(activity, id);
            find.setOnClickListener(listener);
        }
    }

    public static <T extends View> void vuSetBackgroundResource(Activity activity, int background, int... ids) {
        for(int id : ids) {
            View find = vuFind(activity, id);
            find.setBackgroundResource(background);
        }
    }

    public static <T extends View> void vuSetBackgroundResource(View view, int background, int... ids) {
        for(int id : ids) {
            View find = vuFind(view, id);
            find.setBackgroundResource(background);
        }
    }

    public static <T extends View> void vuSetVisibility(Activity activity, int visibility, int... ids) {
        for(int id : ids) {
            View find = vuFind(activity, id);
            find.setVisibility(visibility);
        }
    }

    public static <T extends View> void vuSetVisibility(View view, int visibility, int... ids) {
        for(int id : ids) {
            View find = vuFind(view, id);
            find.setVisibility(visibility);
        }
    }

    public static <T extends View> void vuSetImageResource(Activity activity, int drawable, int... ids) {
        for(int id : ids) {
            ImageView find = vuFind(activity, id);
            find.setImageResource(drawable);
        }
    }

    public static <T extends View> void vuSetImageResource(View view, int drawable, int... ids) {
        for(int id : ids) {
            ImageView find = vuFind(view, id);
            find.setImageResource(drawable);
        }
    }

    public static <T extends TextView> void vuSetTextColor(Activity activity, int color, int... ids) {
        for(int id : ids) {
            TextView textView = vuFind(activity, id);
            textView.setTextColor(color);
        }
    }


    public static <T extends TextView> void vuSetTextColor(View view, int color, int... ids) {
        for(int id : ids) {
            TextView textView = vuFind(view, id);
            textView.setTextColor(color);
        }
    }

    public static <T extends TextView> void vuSetText(Activity activity, String text,  int... ids) {
        for(int id : ids) {
            TextView textView = vuFind(activity, id);
            textView.setText(text);
        }
    }


    public static <T extends TextView> void vuSetText(View view, String text, int... ids) {
        if (text == null) {
            text = "";
        }
        for(int id : ids) {
            TextView textView = vuFind(view, id);
            textView.setText(text);
        }
    }

    public static <T extends View> void vuSetEnabled(Activity activity, boolean enabled, int... ids) {
        for(int id : ids) {
            View find = vuFind(activity, id);
            find.setEnabled(enabled);
        }
    }

    public static <T extends View> void vuSetEnabled(View view, boolean enabled, int... ids) {
        for(int id : ids) {
            View find = vuFind(view, id);
            find.setEnabled(enabled);
        }
    }

    public static CharSequence vuGetText(Activity activity, int id) {
        TextView textView = vuFind(activity, id);
        return textView.getText();
    }

    public static CharSequence vuGetText(View view, int id) {
        TextView textView = vuFind(view, id);
        return textView.getText();
    }

}
