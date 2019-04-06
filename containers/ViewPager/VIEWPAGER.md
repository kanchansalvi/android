# VIEWPAGER :
Repo for Container ViewPager in Android Projects

# ViewPager :

- ViewPager allows the user to flip left and right through pages of data.  
- ViewPager is most often used with Fragment.
- Standard adapters need to be implemented for using fragments with the ViewPager.
  These are FragmentPagerAdapter and FragmentStatePagerAdapter.   
  Check Program [ViewPagerDemo1](ViewPagerDemo1) implemented with single fragment and FragmentStatePagerAdapter.

Steps for  ViewPagerDemo1 : 

1) Create ViewPagerView in activity_main.xml Layout file. 
2) Create a new Fragment in Main File (MyPageFragment)
    (app --right click--> New --> Fragment --> Fragment Blank)
   Implement the changes in file created for the fragment in layout file(fragment_mypage.xml). 
3) Create an Adapter class for the ViewPager(MyPageAdapter).
4) Set an Adapter for ViewPager in the MainActivity File.
          
For implementation with Multiple Fragments, check Program [ViewPagerDemo2](ViewPagerDemo2).    

For implementation with TabLayout, check Program [ViewPagerDemo3](ViewPagerDemo3)

Links:

[Link 1](https://developer.android.com/reference/android/support/v4/view/ViewPager),
[Link 2](https://developer.android.com/training/animation/screen-slide)


