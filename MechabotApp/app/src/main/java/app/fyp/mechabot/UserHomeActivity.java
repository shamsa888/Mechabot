package app.fyp.mechabot;

import android.content.Intent;
        import android.os.Bundle;

        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.LinearLayout;
        import android.widget.TextView;
        import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.database.DataSnapshot;
        import com.google.firebase.database.DatabaseError;
        import com.google.firebase.database.DatabaseReference;
        import com.google.firebase.database.FirebaseDatabase;
        import com.google.firebase.database.ValueEventListener;

        import java.util.ArrayList;



public class UserHomeActivity extends AppCompatActivity {


    ConstraintLayout MainFragmentContainer;
    ArrayList mLocationArr;
    Double latDouble, langDouble;


    FirebaseAuth mAuth;
    DatabaseReference AddLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_user_home);

        mAuth = FirebaseAuth.getInstance();
        MainFragmentContainer = findViewById(R.id.main_fragment_container);


        BottomNavigationView MainBottomNavigationView;
        MainBottomNavigationView = findViewById(R.id.bottom_navigationer);


        MainBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id) {


                }
                return true;
            }
        });


    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_logout) {
            mAuth.signOut();
            startActivity(new Intent(UserHomeActivity.this, MainActivity.class));
            finish();
            return true;
        } else if (id == R.id.action_about_us) {
        }

        return super.onOptionsItemSelected(item);
    }







}
