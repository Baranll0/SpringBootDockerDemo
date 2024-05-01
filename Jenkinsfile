pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Baranll0/SpringBootDockerDemo'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("demo2:${env.BUILD_NUMBER}")
                }
            }
        }

        stage('Run Docker Container') {
            steps {
                script {
                    docker.image("demo2:${env.BUILD_NUMBER}").run("-d -p 8989:8080 --name demo-container")
                }
            }
        }
    }

}