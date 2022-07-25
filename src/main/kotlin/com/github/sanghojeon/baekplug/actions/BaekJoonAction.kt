package com.github.sanghojeon.baekplug.actions



import com.intellij.ide.util.TipUIUtil
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

import com.intellij.openapi.ui.Messages
import com.intellij.openapi.util.NlsSafe
import com.intellij.ui.ClickListener
import com.intellij.util.Icons
import com.intellij.util.PlatformIcons.ADD_ICON
import com.intellij.util.ui.UIUtil
import java.awt.event.MouseEvent


class BaekJoonAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {

        val url: @NlsSafe String? = Messages.showInputDialog("Please Select number of the problem", "baekJoon", Icons.CHECK_ICON)
        val sb: StringBuilder = StringBuilder();

//        Messages.showPasswordDialog("select password", "fuck")
//        var t: String = project.toString()
    }
    object click : ClickListener(){
        override fun onClick(event: MouseEvent, clickCount: Int): Boolean {
            println(event);
            return true;
        }
    }


    override fun update(e: AnActionEvent) {
        super.update(e)
    }

}