# TABITEM :
Repo for Container TabItem in Android Projects

# TabItem :

1) TabItem is a special 'view' which allows you to declare tab items for a TabLayout within a layout.
2) This view is not actually added to TabLayout, it is just a dummy which allows setting of a tab items's text, icon and custom layout.
you can't set any kind of standard layout attribute on it, like layout_width or background. 
3) TabLayout can't use a custom View(eg. ViewPager) when self-populating its Tabs, 
and the texts get pulled from the PagerAdapter automatically. 
The program [TabItemDemo1](TabItemDemo1) demonstrates TabItem.    

Steps for creating TabItem:   
1) Include the dependency in your gradle File :      
implementation 'com.android.support:design:28.0.0'
2) Implement the TabLayout in the Main Layout File(activity_main).
3) Create TabItems in TabLayout.


Links:

[Link 1](https://developer.android.com/reference/android/support/design/widget/TabItem)


