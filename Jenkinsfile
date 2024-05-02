pipeline {
    agent any
    tools {
        maven 'maven_3_5_0'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    userRemoteConfigs: [[url: 'https://github.com/Baranll0/SpringBootDockerDemo']]
                )
                bat 'mvn clean install'
            }
        }

        stage('Build docker image'){
                    steps{
                        script{
                            docker.build("baranll0/app:${env.BUILD_NUMBER}")
                        }
                    }
        }
        stage('Run Docker Container') {
                    steps {
                           script {
                               docker.image("demo/app:${env.BUILD_NUMBER}").run("-d -p 4444:8080 --name demo-container")
                           }
                    }
        }
    }