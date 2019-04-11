# TABLAYOUT :
Repo for Container TabLayout in Android Projects

# TabLayout :

1) TabLayout provides a horizontal layout to display tabs.
2) Tabs are best implemented by leveraging the ViewPager.
3) Tab layout are visible below toolbar with View pager, used to create swipeable views on. Tabs are designed to work with fragments. 
Use them to swipe fragments in view pager.
4) The primary role of the ViewPager is to allow the user to flip through different pages of information where each page is most typically represented by a layout fragment. 
The fragments that are associated with the ViewPager are managed by an instance of the FragmentPagerAdapter class.
5) The purpose of the TabLayout is to present the user with a row of tabs which can be selected to display different pages to the user. 
The tabs can be fixed or scrollable, whereby the user can swipe left or right to view more tabs than will currently fit on the display.     
The program [TabLayoutDemo1](TabLayoutDemo1) demonstrates TabLayout.    

Steps for creating TabLayout:   
1) Include the dependency in your gradle File :      
implementation 'com.android.support:design:28.0.0'
2) Implement the TabLayout along with ViewPager in the Main Layout File(activity_main).
3) Create Fragment for each tab.(app -> java -> New Fragment(Blank).         
4) Define a java Adapter class which extends FragmentStatePagerAdapter and initialise the fragments as per their location.  
5) Implement the TabLayout in our MAin Java File with ViewPager adapter ttached o the TabLayout.


Links:

[Link 1](https://developer.android.com/reference/android/support/design/widget/TabLayout),
[Link 2](https://developer.android.com/training/implementing-navigation/lateral)
[Link 3](https://material.io/develop/android/components/tab-layout/)


