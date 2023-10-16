package com.androiddevs.unittestingyt

import android.content.Context

/**
 * Created by Abhinay on 16/10/23.
 */
class ResourceComparer {

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}