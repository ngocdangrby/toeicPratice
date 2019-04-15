package com.dangcong.toeicpratice;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.widget.Toolbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menu button bar
        Toolbar toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
        //navigation selected
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new PracticeFragment()).commit();
            navigationView.setCheckedItem(R.id.pratice);
        }


        View headerView = navigationView.getHeaderView(0);
        TextView navUsername = (TextView) headerView.findViewById(R.id.nav_view);
        navUsername.setText("Your Text Here");

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.pratice:
                drawer.closeDrawer(GravityCompat.START);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PracticeFragment()).commit();
                break;

            case R.id.test:
                drawer.closeDrawer(GravityCompat.START);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new TestFragment()).commit();
                break;

            case R.id.history:
                drawer.closeDrawer(GravityCompat.START);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HistoryFragment()).commit();
                break;

            case R.id.downloaded_manage:
                drawer.closeDrawer(GravityCompat.START);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DownloadFragment()).commit();
                break;

            case R.id.settings:
                drawer.closeDrawer(GravityCompat.START);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SettingsFragment()).commit();
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        } else{
            super.onBackPressed();
        }
    }
}
