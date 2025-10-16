def call(string projectName, string projectTag){
    echo 'Building Docker image...'
    sh 'docker build -t ${projectName}:${projectTag} .'
}