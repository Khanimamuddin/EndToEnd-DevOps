pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build Application') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t end-to-end-devops .'
            }
        }

        stage('Deploy Container') {
            steps {
                bat 'docker run --rm end-to-end-devops'
            }
        }
    }

    post {
        success {
            echo 'End-to-End DevOps Pipeline Completed Successfully!'
        }

        failure {
            echo 'Pipeline Failed!'
        }
    }
}