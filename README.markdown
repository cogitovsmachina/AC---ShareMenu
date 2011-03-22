AC ShareMenu: Sharing content in Android using ACTION_SEND Intent
=================================================================

ShareMenu was a method where i created a [sharer][sharer] using 
`android.content.Intent.ACTION_SEND` and `Intent.createChooser` to allow
the Android Framework populate a [menu of share options][call] using
`android.intent.action.SEND`. 

Now, ShareMenu has evolved as a component you can download and use :).


Usage
-----
You need to add the `ShareMenu.jar` library to your project, and then you can call the next line of code:

`ShareMenu.buildShareMenu( context, title , text );`

Where:

`context` is the context of your application.
`title` is a string of the title of your menu.
`text` is the main text you want to share via Facebook/Twitter/others.


Version
-------
Version 0.1, which helps you build Share Via to pass only a text, soon i'll implement send a binary like a video/image. pull requests are well received!


Demo
----
You can clone this project and run in your IDE to see how can be implemented :).


Questions
---------
You can contact me via StackOverflow, or with my email: nrikediaz@androidtitlan.org

[sharer]:http://sudarmuthu.com/blog/sharing-content-in-android-using-action_send-intent
[call]: http://www.androidguys.com/2009/11/02/a-call-to-action-action_send-that-is/
