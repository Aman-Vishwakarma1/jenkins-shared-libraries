def call(String projectName, String projectTag){
    echo "Building Docker image..."
    sh "docker build -t ${projectName}:${projectTag} ."
}