package com.github.fkistner.testlegendarydollop.services

import com.intellij.openapi.project.Project
import com.github.fkistner.testlegendarydollop.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
