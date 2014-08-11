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

import android.text.TextUtils;

/**
 * Created by yunarta on 15/5/14.
 */
public class ValidateUtils {
    /**
     * Validate that any of the args is empty.
     *
     * @param args char sequence argument
     * @return true if any of the args is empty by TextUtils.isEmpty definition
     */
    public static boolean isEmpty(CharSequence... args) {
        for (CharSequence arg : args) {
            if (TextUtils.isEmpty(arg)) {
                return true;
            }
        }

        return false;
    }
}
