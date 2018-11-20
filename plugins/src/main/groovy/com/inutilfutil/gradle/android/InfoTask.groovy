package com.inutilfutil.gradle.android

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class InfoTask extends DefaultTask {

    @TaskAction
    void doInfo() {
        println "From com.inutilfutil.info, project: ${project.name}"
    }
}