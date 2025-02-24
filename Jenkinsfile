pipeline {
  agent any

  environment {
    DOCKERHUB_CREDENTIALS = credentials('DOCKER_HUB_CREDENTIAL')
    VERSION = "${env.BUILD_ID}"

  }

  tools {
    maven "Maven"
  }

  stages {

    stage('Maven Build'){
        steps{
        sh 'mvn clean package  -DskipTests'
        }
    }

     stage('Run Tests') {
      steps {
        sh 'mvn test'
      }
    }



      stage('Docker Build and Push') {
      steps {
          sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
          sh 'docker build -t saai11/deployment:${VERSION} .'
          sh 'docker push saai11/deployment:${VERSION}'
      }
    }


     stage('Cleanup Workspace') {
      steps {
        deleteDir()
      }
    }





  }

}


























// pipeline{
//     agent any
//         environment{
//         DOCKER_HUB_CREDENTIALS = credentials('DOCKER_HUB_CREDENTIAL')
//         VERSION = "${env.BUILD_ID}"
//         DOCKER_IMAGE_NAME='deployment'
//         DOCKER_IMAGE_TAG='0.0.1'
//         }
//         tools{
//         maven "Maven"
//         }
//             stages{
//             stage("Maven build"){
//             steps{
//             sh 'maven clean package -DSkipTests'
//             }
//             }
//
//             stage("Run Tests"){
//             steps{
//             sh 'mvn test'
//             }
//             }
//             stage("Build"){
//             steps{
//             sh 'echo $DOCKER_HUB_CREDENTIALS_PSW | docker login -u $DOCKER_HUB_CREDENTIALS_USR --password-stdin'
//             sh 'docker build -t saai11/${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG} .'
//             }
//             }
//             stage("Push"){
//             steps{
//                  sh 'docker push saai11/${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG}'
//             }
//             }
//         }


}