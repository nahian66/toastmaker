package com.crisisstudio.trial1toastlibrary;

import android.content.Context;
import android.widget.Toast;

public class toastmaker {

    // first toast library for me
    public static void newtoast(Context context, String msg){

        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }


}
