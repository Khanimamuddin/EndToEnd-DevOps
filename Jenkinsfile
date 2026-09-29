pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                echo 'Fetching source code from GitHub'
                checkout scm
            }
        }

        stage('Build Application') {
            steps {
                echo 'Building Java application using Maven'
                bat 'mvn clean compile'
            }
        }

        stage('Run Automated Tests') {
            steps {
                echo 'Executing JUnit test cases'
                bat 'mvn test'
            }
        }

        stage('Build Verification') {
            steps {
                echo 'Application build and testing completed'
            }
        }
    }

    post {
        success {
            echo 'CI Pipeline Executed Successfully!'
        }

        failure {
            echo 'CI Pipeline Failed!'
        }
    }
}