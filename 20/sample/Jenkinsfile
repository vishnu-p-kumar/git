pipeline {

    agent any

    tools {
        maven 'mymaven'
    }

    stages {

        stage('Build WAR') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t sample-webapp .'
            }
        }

        stage('Stop Old Container') {
            steps {
                bat 'docker stop sample-webapp-container || exit 0'
                bat 'docker rm sample-webapp-container || exit 0'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d -p 8087:8080 --name sample-webapp-container sample-webapp'
            }
        }

    }
}