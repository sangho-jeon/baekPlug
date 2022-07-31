package com.github.sanghojeon.baekplug.Notifier


import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.project.Project

object TestNotifier {
    fun notifyError(
        project: Project?,
        content: String?
    ) {
        NotificationGroupManager.getInstance()
            .getNotificationGroup("Custom Notification Group")
            .createNotification(content!!, NotificationType.ERROR)
            .notify(project)
    }
}