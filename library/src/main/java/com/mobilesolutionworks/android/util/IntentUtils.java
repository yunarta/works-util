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

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Intent related utility.
 */
public class IntentUtils {
    /**
     * Describe intent data.
     *
     * @param tag    log tag
     * @param intent intent object
     */
    public static void describe(String tag, Intent intent) {
        Log.d(tag, "intent = " + intent);
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String key : extras.keySet()) {
                    Log.d(tag, key + " = " + extras.get(key));
                }
            }
        }
    }
}
