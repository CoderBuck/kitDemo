package com.github.coderbuck.kitdemo.services

import com.github.coderbuck.kitdemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
