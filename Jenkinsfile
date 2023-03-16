pipeline {

agent any

 tools {
    maven 'mvn_3.8.7'
 }
stages {
    stage ('1 check java version'){
        steps  {
		sh 'java --version'
         }
         }
     stage ('2 code compile'){
        steps  {
		sh 'mvn clean compile'
        }
        }
        stage ('3 code Test'){
        steps  {
		sh 'mvn clean test'
        }
        }
        stage ('4 code package'){
        steps  {
		sh 'mvn clean package'
        }
        }
        stage ('5 code compile'){
        steps  {
		sh 'mvn clean compile'
        }

        }

    }
}
