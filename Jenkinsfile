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
                    bat 'docker build -t baranll0/app .'
                }
            }
        }
        stage('Push image to Hu                                                                                                                                         b'){
            steps{
                 script {
                 docker.image("baranll0/app:${env.BUILD_NUMBER}").run("-d -p 6530:6530 --name demo-container")
                            }
            }
        }
    }
}
