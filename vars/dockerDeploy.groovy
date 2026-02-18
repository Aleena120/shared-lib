def call(Map config) {
    echo "Deploying Docker container ${config.containerName} from image ${config.imageName} on port ${config.portMapping}"
    sh "docker stop ${config.containerName} || true"
    sh "docker rm ${config.containerName} || true"
    sh "docker run -d --name ${config.containerName} -p ${config.portMapping}:3000 ${config.imageName}"
}