def call(Map config) {
    sh "docker stop ${config.containerName} || true"
    sh "docker rm ${config.containerName} || true"
    sh "docker run -d --name ${config.containerName} -p ${config.portMapping}:3000 ${config.imageName}"
}