def call(String toolName, String projectName, String projectKey) {
    withSonarQubeEnv(toolName) {
        def sonarHome = tool toolName
        sh """
            ${sonarHome}/bin/sonar-scanner \
                -Dsonar.projectName=${projectName} \
                -Dsonar.projectKey=${projectKey} \
                -Dsonar.sources=.
        """
    }
}
