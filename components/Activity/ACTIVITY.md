# ACTIVITY :
Repo for Activity in Android Projects.

# Activity :

1) An activity provides the window in which the app draws its UI.
2) Generally, one activity implements one screen in an app. 
3) Most apps contain multiple screens, which means they comprise multiple activities.
4) To use activities in your app, you must register information about them in the app’s manifest, and you must manage activity lifecycles appropriately.

*Activity LifeCycle Methods:*
1) *onCreate() :* This is the first callback and called when the activity is first created.
2) *onStart() :*  This callback is called when the activity becomes visible to the user.
3) *onResume() :* This is called when the user starts interacting with the application.
4) *onPause() :* The paused activity does not receive user input and cannot execute any code 
and called when the current activity is being paused and the previous activity is being resumed.
5) *onStop() :* This callback is called when the activity is no longer visible.
6) *onDestroy() :* This callback is called before the activity is destroyed by the system.
7) *onRestart() :* This callback is called when the activity restarts after stopping it.



The program [ActivityDemo1](ActivityDemo1) demonstrates use *of* Activity Component.    

Links:

[Link 1](https://developer.android.com/guide/components/activities/intro-activities),
[Link 2](https://developer.android.com/reference/android/app/Activity#inherited-methods),
[Link 3](https://developer.android.com/training/basics/firstapp/starting-activity)


