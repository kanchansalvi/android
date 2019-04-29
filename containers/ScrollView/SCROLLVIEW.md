# SCROLLVIEW :
Repo for Container ScrollView in Android Projects

# ScrollView : 
- Generally, the android [ScrollView](https://github.com/kanchansalvi/android/tree/master/uiControls/ScrollViewDemo1) is useful when we have a content that doesn’t fit to our android app layout screen. 
The ScrollView will enable a scroll to the content which is exceeding the screen layout and allow users to see the complete content by scrolling.
- The android ScrollView can hold only one direct child. 
In case, if we want to add multiple views within the scroll view, 
- then we need to include them in another standard layout like linearlayout, relativelayout, framelayout, etc.
- To enable scrolling for our android applications, ScrollView is the best option but 
we should not use ScrollView along with ListView or Gridview because they both will take care of their own vertical scrolling.
- In android, ScrollView supports only vertical scrolling. In case, if we want to implement horizontal scrolling, then we need to use HorizontalScrollView component.
- 
# Horizontal ScrollView :

- HorizontalScrollView is used to scroll the child elements or views in a 
horizontal direction.
- HorizontalScrollView only supports horizontal scrolling.
- For vertical scroll, android uses ScrollView. 

Check the eg. [HorizontalScrollViewDemo1](HorizontalScrollViewDemo1). 

Links:

[Link 1](https://developer.android.com/reference/android/widget/HorizontalScrollView) 

# Nested ScrollView :
- NestedScrollView is just like ScrollView, but it supports acting as both a nested scrolling parent and child on both new and old versions of Android. Nested scrolling is enabled by default.
- Adding a ScrollView inside ScrollView can be difficult.
- Nested ScrollView supports acting as both a nested scrolling parent and child on both new and old versions of Android. 

Check the eg. [NestedScrollViewDemo1](NestedScrollViewDemo1).

Links:

[Link 1](https://developer.android.com/reference/android/support/v4/widget/NestedScrollView)

