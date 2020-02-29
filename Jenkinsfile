pipeline {
   agent any

   stages {

      stage('Compile') {
         steps {
            echo "Compile step"
             bat "mvn compile"
            }
         }
         stage('Test') {
         steps {
            echo "Build step"
            bat "mvn -Dmaven.test.failure.ignore=true test "
            }
         }
         stage('Result') {
         steps {
             step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
            }
            post{
                 failure {
                telegramSend "$BUILD_TAG is failure"
             }
            success {
                telegramSend "$BUILD_TAG is success"
             }
             unstable {
                telegramSend "$BUILD_TAG is unstable"
             }
            changed {
                telegramSend "$BUILD_TAG is changed"
                }
            }
         }
      }
   }

