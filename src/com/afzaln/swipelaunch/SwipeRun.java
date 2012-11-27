package com.afzaln.swipelaunch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SwipeRun extends Activity {
    /** Called when the activity is first created */
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(Intent.ACTION_SEARCH_LONG_PRESS);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
