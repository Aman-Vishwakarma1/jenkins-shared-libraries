def call(Map config = [:]) {
    echo "Initializing OWASP Dependency Check"

    def args = config.get('additionalArguments', '--scan ./')
    def installation = config.get('odcInstallation', 'Default-OWASP')

    dependencyCheck additionalArguments: args, odcInstallation: installation
    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'

    echo "Completed OWASP Dependency Check"
}
