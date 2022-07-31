package com.github.sanghojeon.baekplug.actions



import com.github.sanghojeon.baekplug.Notifier.TestNotifier
import com.intellij.ide.actions.CreateDirectoryOrPackageAction
import com.intellij.ide.actions.CreateDirectoryOrPackageHandler
import com.intellij.ide.actions.CreateFileAction
import com.intellij.ide.actions.DeleteAction
import com.intellij.ide.util.TipUIUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project

import com.intellij.openapi.ui.Messages
import com.intellij.openapi.util.NlsSafe
import com.intellij.ui.ClickListener
import com.intellij.util.Icons
import com.intellij.util.PlatformIcons.ADD_ICON
import com.intellij.util.ui.UIUtil
import java.awt.event.MouseEvent


class BaekJoonAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {

        val name: @NlsSafe String? = Messages.showInputDialog("Please Select number of the problem", "baekJoon", Icons.CHECK_ICON)



        val createDirectory = CreateDirectoryOrPackageAction()
        val deleteDirectory = DeleteAction();
        val createFile = CreateFileAction();
        createFile.actionPerformed(e);
        createDirectory.actionPerformed(e);
        Messages.showPasswordDialog("select password", "fuck")
        val project : Project? = e.project;

        TestNotifier.notifyError(project, "fucking shit")



    }
    object click : ClickListener(){
        override fun onClick(event: MouseEvent, clickCount: Int): Boolean {
            println("Click event!!!");
            return true;
        }
    }


    override fun update(e: AnActionEvent) {
        super.update(e)
    }

}