pipeline {

    agent any
    
    stages{
      stage("Jenkinsfile2"){
        steps{
          println "I am from Jenkinsfile2"
        }
      }
     }
 }
