package org.meicode.recycler;


import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseService extends FirebaseMessagingService {
    private static final String TAG = "FirebaseService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        // Handle received FCM messages
        if (remoteMessage.getNotification() != null) {
            Log.d(TAG, "Message Notification Body: " + remoteMessage.getNotification().getBody());
            // Display the message in a notification
            showNotification(remoteMessage.getNotification().getBody());
        }
    }

    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.d(TAG, "Refreshed token: " + token);

        // Send the new token to your server
        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token) {
        // Implement your logic to send the token to your server
        Log.d(TAG, "Token sent to server: " + token);
    }

    private void showNotification(String messageBody) {
        // You can implement your Notification logic here (as shown in the previous example)
    }
}
