# PHONE CALL :
Repo for SMS Projects in Android Projects.

# Phone Call :

1) Phone Call in Android can be easily be done by using implicit Intent with appropriate actions.
2) The following Actions are used to make Phone Calls:
    - ACTION_CALL : Needs permission in to be declared in the Manifest File. 
        This uses the built-in phone call functionality available in Android device.
    - ACTION_DIAL : Asks the Phone calling App to dial the number. 
        Here you will have option to modify hardcoded phone number before making a call instead of making a direct call.
        Does not need permission to be declared in the Manifest File.
3) TelephonyManager can be used to check the Phone call state.

The Example [PhoneCallDemo1](PhoneCallDemo1) we are going to show you in practical how 
how to dial a number with ACTION_DIAL.

Links :
[Link 1](https://developer.android.com/guide/topics/connectivity/telecom/selfManaged),