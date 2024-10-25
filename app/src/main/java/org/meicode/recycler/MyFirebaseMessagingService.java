package org.meicode.recycler;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "FCMService";

    // Called when the FCM token is refreshed
    @Override
    public void onNewToken(String token) {
        Log.d(TAG, "Refreshed FCM token: " + token);

        // Send the token to your server for future notifications
        sendRegistrationToServer(token);
    }

    // Custom method to send the token to your app's server
    private void sendRegistrationToServer(String token) {
        // You can implement server logic here to store the token for later use
        Log.d(TAG, "Token sent to the server: " + token);
        // e.g., using Retrofit, OkHttp, or any HTTP client to send the token to your backend server.
    }

    // Called when a message (notification) is received
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        // Check if the message contains a notification payload
        if (remoteMessage.getNotification() != null) {
            String title = remoteMessage.getNotification().getTitle();
            String body = remoteMessage.getNotification().getBody();
            Log.d(TAG, "Notification Title: " + title);
            Log.d(TAG, "Notification Body: " + body);

            // Handle the notification here. E.g., show a notification in the system tray.
        }

        // Check if the message contains a data payload
        if (remoteMessage.getData().size() > 0) {
            Log.d(TAG, "Data Payload: " + remoteMessage.getData());
            // Handle the data message here
        }
    }
}
