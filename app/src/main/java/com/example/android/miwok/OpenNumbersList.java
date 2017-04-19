package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by kkuma on 27/03/2017.
 */

    public class OpenNumbersList implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "This is a toast b!", Toast.LENGTH_LONG).show();
    }
}
