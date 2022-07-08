pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                nodejs('Node-10.17')
                sh 'yarn-install'   
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                withGradle(){
                    sh './gradlew -v'
                }
            }
        }
    }
}
