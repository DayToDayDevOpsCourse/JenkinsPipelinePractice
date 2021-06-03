
pipeline {

    agent any
    
    options { 
        timestamps() 
        disableConcurrentBuilds()
    }
    
    tools{
        maven 'maven-3.8.1'
    }
    
    parameters{
		string(name: 'buildVersion', defaultValue: '1.0.${BUILD_NUMBER}', description: '')
		string(name: 'ServerIP', defaultValue: '', description: '')
		booleanParam(name: 'DEBUG_BUILD', defaultValue: true, description: '')
	}
	
	

    stages{
        stage('Stage 1') {
            steps {
                // One or more steps need to be included within the steps block.
                println "stage-1"
                
                println "String parameter: ${params.buildVersion}"
                println "String parameter: ${params.ServerIP}"
                println "String parameter: ${params.DEBUG_BUILD}"
                
                
                sh """
                    ls -l /var/lib/jenkins
                    
                    ls -l
    
                    rm -rf /var/lib/jenkins/.m2/repository
                    
                    rm -rf sampleDir
                    
                    mkdir sampleDir
                    
                    mvn -v
                    
                """
            }
        }
    }
}

