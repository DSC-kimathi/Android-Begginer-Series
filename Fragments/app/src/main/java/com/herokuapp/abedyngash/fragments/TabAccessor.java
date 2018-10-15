package com.herokuapp.abedyngash.fragments;

/*
*import the following libraries
* Ensure to put the "implementation 'com.android.support:design:28.0.0'" line in your gradle file
 */
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabAccessor extends FragmentPagerAdapter {

    /*
    * Create the constructor method for our class
    * Alt+Enter should do the trick
    */
    public TabAccessor(FragmentManager fm) {
        super(fm);
    }

    /*
    * The method below is responsible for allocating fragments to different Tab positions
    * In our case we have 3 tabs, hence the three cases in our switch statement
    * Note: "i" is a variable of integer data type and is responsible for getting the current item*/
    @Override
    public Fragment getItem(int i) {

        //Our switch statement goes below. REFERENCE: INTRO TO JAVA
        switch (i){
            case 0:
                //Instantiate the ChatsFragment class(Created when we created the ChatsFragment)
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment; //return the instantiated variable
            case 1:
                //Instantiate the StatusFragment class(Created when we created the StatusFragment)
                StatusFragment statusFragment = new StatusFragment();
                return statusFragment; //return the instantiated variable
            case 2:
                //Instantiate the CallsFragment class(Created when we created the CallsFragment)
                CallsFragment callsFragment = new CallsFragment();
                return callsFragment; //return the instantiated variable
            default:
                //By default we return nothing
                return null;
        }
    }

    /*
    * The method below gets the number of items on the Tab Layout
    * In our case we have 3 three items
    */
    @Override
    public int getCount() {
        return 3;
    }

    /*
    * This other method allocates what name we want to label each of our Tab item
    * Note the following:
    * CharSequence is the method dataType
    * getPageTitle is the name of the method
    * position is a variable to get the position of the item
    */
    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "CHATS";
            case 1:
                return "STATUS";
            case 2:
                return "CALLS";
                default:
                    return null;

        }
    }

}
