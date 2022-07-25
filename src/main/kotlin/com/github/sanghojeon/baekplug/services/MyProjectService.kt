package com.github.sanghojeon.baekplug.services

import com.intellij.openapi.project.Project
import com.github.sanghojeon.baekplug.MyBundle

class MyProjectService(project: Project) {
    init {
        println(MyBundle.message("projectService", project.name))
    }
}
