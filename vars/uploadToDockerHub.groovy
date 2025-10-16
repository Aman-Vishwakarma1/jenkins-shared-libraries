def call(string dockerUserName, string dockerPass, string projectName, string projectTag){
    echo "uploading docker image to DockerHub"
    sh "docker login -u ${dockerUserName} -p ${dockerPass}"
    sh "docker tag ${projectName} ${dockerUserName}/${projectName}:${projectTag}"
    sh "docker push ${dockerUserName}/${projectName}:${projectTag}"
}