# TOOLBAR :
Repo for Container Toolbar in Android Projects

# Toolbar :

1) Toolbar was earlier known as ActionBar, displays items for easier navigation.

Check the program [ToolbarDemo1](ToolbarDemo1) which displays toolbar as an ActionBar.    

Steps for adding Bottom Navigation View:
1) Add toolbar widget in activity file(activity_main).    
2) Create a menu file to hold items of toolbar.   
3) In the main file, setsupportActionBar for toolbar. 
Override the onCreateOptionsMenu method inflate the menu infater with the menu file. 
4) Override the onOptionsItemSelected method to add events on the toolbar menu.
5) Update the android:theme attribute in the Manifest File with appcompat's NoActionBar themes.
    
Links:

[Link 1](https://developer.android.com/reference/android/widget/Toolbar), 
[Link 2](https://developer.android.com/training/appbar/setting-up)

