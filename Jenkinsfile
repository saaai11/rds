pipeline {
  agent any

  environment {
    DOCKERHUB_CREDENTIALS = credentials('DOCKER_HUB_CREDENTIALS')
    VERSION = "${env.BUILD_ID}"
  }

//   tools {
//     maven "Maven"
//   }
    triggers {
        githubPush()
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



//       stage('Docker Build and Push') {
//       steps {
//           sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
//           sh 'docker build -t saai11/deployment:${VERSION} .'
//           sh 'docker push saai11/deployment:${VERSION}'
//       }
//     }
//
//
//      stage('Cleanup Workspace') {
//       steps {
//         deleteDir()
//       }
//     }





  }

}
























