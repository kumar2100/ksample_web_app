pipeline {
    agent any 
    
   environment {
    PATH = "D:\apache-maven-3.3.9\bin:$PATH"
  }

    stages {
        stage('Build') { 
            steps { 
                echo "PATH is: $PATH"
                bat 'mvn clean package' 
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
