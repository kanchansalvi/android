# BROADCAST RECIEVERS :
Repo for Broadcast Recievers in Android Projects.

# Broadcast Recievers :

1) A broadcast receiver (receiver) is an Android component which allows you to register for system or application events.
2) All registered receivers for an event are notified by the Android runtime once this event happens.
3) The broadcast message itself is wrapped in an Intent object whose action string identifies the event that occurred (for example android.intent.action.AIRPLANE_MODE).
4) There are two ways to make a broadcast receiver known to the system: 
    - Declare it in the manifest file with this element. 
    - To create the receiver dynamically in code and register it with the **Context.registerReceiver()** method. 
5) To be able to receive a broadcast, application have to extends the BroadcastReceiver abstract class and override its **onReceive()** method.

The Example [BroadcastRecieverDemo1](BroadcastRecieverDemo1) creates a dynamic custom broadcast event.
The event broadcast is registerd in the via Context.registerReceiver() method.

[Link 1](https://developer.android.com/guide/components/broadcasts), 
[Link 2](https://developer.android.com/reference/android/content/BroadcastReceiver),
[Link 3](https://developer.android.com/guide/topics/manifest/receiver-element)

