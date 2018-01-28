package com.evollu.react.fcm;

import android.content.Intent;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import org.json.JSONObject;

import android.graphics.Color;
import android.media.RingtoneManager;
import android.support.v4.app.NotificationCompat;
import android.app.*;
import android.content.Context;

public class MessagingService extends FirebaseMessagingService {

    private static final String TAG = "MessagingService";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "Remote message received");
        Intent i = new Intent("com.evollu.react.fcm.ReceiveNotification");
        i.putExtra("data", remoteMessage);
        sendOrderedBroadcast(i, null);
		// sendNotification("body");
    }

	// RENDU A METTRE CE MORCEAU LA DANS CITYUNTj
	// private void sendNotification(String messageTitle, String messageBody) {
        // Class intentClass = getMainActivityClass();
        // if (intentClass == null) {
        // 
        //     return;
        // }
        // Intent intent = new Intent(this, intentClass);
    //     Intent intent = new Intent("com.evollu.react.fcm.ReceiveNotification");
    //     intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        // PendingIntent pendingIntent = PendingIntent.getActivity(this,0 /* request code */, intent,PendingIntent.FLAG_UPDATE_CURRENT);


    //     NotificationCompat.Builder notificationBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
    //             .setContentTitle(messageTitle)
    //             .setContentText(messageBody)
    //             .setAutoCancel(true)
    //             .setContentIntent(pendingIntent)
    //             .setDefaults(NotificationCompat.DEFAULT_SOUND |
    //                          NotificationCompat.DEFAULT_VIBRATE |
    //                          NotificationCompat.DEFAULT_LIGHTS);

    //     NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        // notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    // }
	// private void sendNotification(String messageBody) {
    //     Intent intent = new Intent(this, MainActivity.class);
    //     intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    //    PendingIntent pendingIntent = PendingIntent.getActivity(this, 0 /* Request code */, intent,
    //             PendingIntent.FLAG_ONE_SHOT);

    //     Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    //     NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
    //             .setSmallIcon(R.drawable.ic_stat_ic_notification)
    //             .setContentTitle("FCM Message")
    //             .setContentText(messageBody)
    //             .setAutoCancel(true)
    //             .setSound(defaultSoundUri)
    //             .setContentIntent(pendingIntent);

    //     NotificationManager notificationManager =
    //             (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

     //   notificationManager.notify(0 /* ID of notification */, notificationBuilder.build());
    // }

    // public Class getMainActivityClass() {
    //     Context mContext;
    //     sharedPreferences = (SharedPreferences) mContext.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE);
    //     String packageName = mContext.getPackageName();
    //     Intent launchIntent = mContext.getPackageManager().getLaunchIntentForPackage(packageName);
    //     String className = launchIntent.getComponent().getClassName();
    //     try {
    //         return Class.forName(className);
    //     } catch (ClassNotFoundException e) {
    //         e.printStackTrace();
    //         return null;
    //     }
    // }
}
