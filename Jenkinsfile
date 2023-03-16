pipeline {
 tools {
    maven 'mvn_3.8.7'
 }
stages {
    stage {
        steps ('check java version') {
		"sh java --version"
         }
        steps ('code compile') {
		"sh mvn clean compile"
        }
        steps ('code Test') {
		"sh mvn clean test"
        }
        steps ('code package') {
		"sh mvn clean package"
        }
        steps ('code compile') {
		"sh mvn clean compile"
        }

        }

    }
}
