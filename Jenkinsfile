pipeline {

agent any

 tools {
    maven 'mvn_3.8.7'
 }
stages {
    stage ('check java version'){
        steps  {
		"sh java --version"
         }
         }
     stage ('code compile'){
        steps  {
		"sh mvn clean compile"
        }
        }
        stage ('code Test'){
        steps  {
		"sh mvn clean test"
        }
        }
        stage ('code package'){
        steps  {
		"sh mvn clean package"
        }
        }
        stage ('code compile'){
        steps  {
		"sh mvn clean compile"
        }

        }

    }
}
