pipeline {
    agent any 
    
   environment {
       MAVEN_HOME='D:\\apache-maven-3.3.9\\bin'
  }

    stages {
        stage('Build') { 
            steps { 
                withEnv(['PATH=%PATH%;C:\\Windows\\System32;D:\\apache-maven-3.3.9\\bin']) {
                    // some block
                    bat 'mvn clean package'     
                }
               
            }
        }
        stage('Test'){
            steps {
                echo 'To do the testing stage'
            }
        }
        stage('DeployArtifactory') {
            steps {
                echo 'To push to Artifactory'
            }
        }
    }
}
