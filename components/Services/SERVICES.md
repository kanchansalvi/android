# SERVICES :
Repo for Services in Android Projects.

# Services :

1) A service is a component that runs in the background to perform long-running 
operations without needing to interact with the user and it works even 
if application is destroyed.
2) A service can essentially take two states:
    - **Started:**
      A service is started when an application component, such as an activity, 
      starts it by calling startService(). 
      Once started, a service can run in the background indefinitely, 
      even if the component that started it is destroyed.
    - **Bound:**
      A service is bound when an application component binds to it by calling bindService(). 
      A bound service offers a client-server interface that allows components 
      to interact with the service, send requests, get results, and even do so 
      across processes with interprocess communication (IPC).
 
The example [ServicesDemo1](ServicesDemo1) demonstrates the service for MediaPlayer.

*Activity LifeCycle Callback Methods:*
1) onStartCommand():
      The system calls this method when another component, such as an activity, requests that the service be started, by calling startService(). If you implement this method, it is your responsibility to stop the service when its work is done, by calling stopSelf() or stopService() methods.
2) onBind():
   The system calls this method when another component wants to bind with 
   the service by calling bindService(). 
   If you implement this method, you must provide an interface that 
   clients use to communicate with the service, by returning an IBinder object. 
   You must always implement this method, but if you don't want to allow binding, 
   then you should return null. 
3) onUnbind():
   The system calls this method when all clients have disconnected from a 
   particular interface published by the service.
4) onRebind():   
   The system calls this method when new clients have connected to the service, 
   after it had previously been notified that all had disconnected in its
    onUnbind(Intent).
5) onCreate():
   The system calls this method when the service is first created using 
   onStartCommand() or onBind(). 
   This call is required to perform one-time set-up. 
6) onDestroy()
   The system calls this method when the service is no longer used and is being destroyed.
    Your service should implement this to clean up any resources such as threads, registered listeners, receivers, etc. 


[Link 1](https://developer.android.com/guide/components/services), 
[Link 2](https://developer.android.com/reference/android/app/Service)

