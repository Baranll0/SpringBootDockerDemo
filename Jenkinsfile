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
                   stage('Stop and Remove Existing Container') {
                                             steps {stage('Build docker image'){
                                                 script {    steps{
                                                            bat 'docker stop demo-container '        script{
                                                            bat 'docker rm demo-container'            docker.build("demo13:${env.BUILD_NUMBER}")
                                                        }        }
                                                   }    }
                                        }}
        stage('Push image to Hub'){
            steps{
                script{
                    docker.image("demo13:${env.BUILD_NUMBER}").run("-d -p 6530:6530 --name demo-container")
                }
            }
  }
}

}