def call(){
    steps{
        echo "Intiallizing trivy file System Check....."
        sh "trivy fs --format table -o trivy-fs-report.html ."
        echo "Completed trivy file System Check"
    }
}