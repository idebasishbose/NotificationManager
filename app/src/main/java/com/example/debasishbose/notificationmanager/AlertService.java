package com.example.debasishbose.notificationmanager;


import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by debasishbose on 9/4/17.
 */

public class AlertService extends BroadcastReceiver {
//    private final int N_ID = 23;
//    private final String N_ID1 = "e0e2bfbf-674c-4a52-b52f-c10d0701f99e";
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        createTip(context, intent);
//
//    }
//
//    private void createTip(Context context, Intent intent) {
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "xx");
//        builder.setColor(Color.RED)
//                .setSmallIcon(android.support.v4.R.drawable.notification_icon_background)
//                .setContentTitle("notification")
//                .setAutoCancel(true)
//                .setContentText("messages")
//                .setCategory(Notification.CATEGORY_REMINDER)
//                .setDefaults(Notification.DEFAULT_ALL);
//        Notification notification = builder.build();
//        NotificationManagerCompat.from(context).notify(N_ID, notification);
//
//
//    }
public static String NOTIFICATION_ID = "notification-id";
    public static String NOTIFICATION = "notification";

    public void onReceive(Context context, Intent intent) {

        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification notification = intent.getParcelableExtra(NOTIFICATION);
        int id = intent.getIntExtra(NOTIFICATION_ID, 0);
        notificationManager.notify(id, notification);

    }
}
