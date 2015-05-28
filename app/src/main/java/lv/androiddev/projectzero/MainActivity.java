package lv.androiddev.projectzero;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void projectClick(View v){
        int message = 0;
        switch (v.getId()){
            case R.id.project_spotify_streamer:
                message = R.string.project_spotify_streamer;
                break;
            case R.id.project_scores_app:
                message = R.string.project_scores_app;
                break;
            case R.id.project_library_app:
                message = R.string.project_library_app;
                break;
            case R.id.project_build_it_bigger:
                message = R.string.project_build_it_bigger;
                break;
            case R.id.project_xyz_reader:
                message = R.string.project_xyz_reader;
                break;
            case R.id.project_captstone_my_own_app:
                message = R.string.project_captstone_my_app;
                break;

        }

        if(message != 0){
            Toast.makeText(MainActivity.this, getString(R.string.this_button_will_launch) + " " + getString(message) + "!", Toast.LENGTH_LONG).show();
        }
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
}
