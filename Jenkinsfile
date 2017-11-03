pipeline {
    agent any 

    stages {
        stage('Build') { 
            steps { 
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
