def call(String imageName, String dockerfilePath) {
    echo "Building Docker image ${imageName} using Dockerfile at ${dockerfilePath}"
    sh "docker build -t ${imageName} -f ${dockerfilePath} ."
}