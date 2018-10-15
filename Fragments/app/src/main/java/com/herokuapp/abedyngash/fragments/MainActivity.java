package com.herokuapp.abedyngash.fragments;

/*
* Add the following imports
*/
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    /*
    * Define our components from the XML file
    * And also instantiate the TabAccessor class which we created
    */
    TabAccessor tabAccessor;
    ViewPager viewPager;
    TabLayout tabLayout;

    /*
    * The onCreate method is where set our components*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This method links the JAVA variables up there to the XML components using their ID's
        setUIComponents();
    }

    private void setUIComponents() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_pager);
        tabAccessor = new TabAccessor(getSupportFragmentManager()); //This is important

        viewPager.setAdapter(tabAccessor);
        tabLayout.setupWithViewPager(viewPager);
    }

    /*And Wallah! we're so done!*/
}
