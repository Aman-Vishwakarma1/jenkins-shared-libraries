def call(String tool, String projectName, String projectKey){
    withSonarQubeEnv(${tool}){
        sh "$SONAR/bin/sonarqube-scanner -Dsonar.projectName=${projectName} -Dsonar.projectKey=${projectKey}"
    }
}