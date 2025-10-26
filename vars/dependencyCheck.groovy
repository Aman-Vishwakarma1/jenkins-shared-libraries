def call(String dependencyCheckInstalltionName){
    echo "Initiallizing OWASP Dependency Check"
    dependencyCheck additionalArguments: "--scan ./", odcInstallation:"${dependencyCheckInstalltionName}"
    dependencyCheckPublisher pattern: "**/dependency-check-report.xml"
    echo "Completed OWASP Dependency Check"
}