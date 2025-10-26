def call(String toolName, String projectName, String projectKey){
    withSonarQubeEnv(${toolName}){
        def sonarqubeHome = tool ${toolName}
        sh "${sonarqubeHome}/bin/sonarqube-scanner -Dsonar.projectName=${projectName} -Dsonar.projectKey=${projectKey}"
    }
}