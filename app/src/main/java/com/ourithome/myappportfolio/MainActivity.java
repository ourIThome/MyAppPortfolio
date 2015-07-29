package com.ourithome.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showToast(View view) {

        LayoutInflater inflater = getLayoutInflater();

        //This breaks my code!!!
        //View layout = inflater.inflate(R.layout.activity_main,
                //        (ViewGroup) findViewById(R.id.toast_Layout_root));

        //show toast message because it was clicked
        Button button = (Button) view;

        //get text from button
        String buttonText = (String) button.getText();
        Context context = getApplicationContext();

        //make toast and show it
        Toast toast = Toast.makeText(context, buttonText, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER|Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);

        //not using this as the layout gets broken earlier in the code.
        //toast.setView(layout);
        toast.show();
    }

}
