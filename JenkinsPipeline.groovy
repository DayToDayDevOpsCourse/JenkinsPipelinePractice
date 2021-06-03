pipeline {

    agent any
    
    stages{
      stage("Jenkinsfile2"){
        steps{
          println "I am from JenkinsPipeline.groovy file"
        }
      }
     }
 }
