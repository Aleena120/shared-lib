def call(String imageName) {
    echo "Building Docker image ${imageName} using Dockerfile at ${dockerfilePath}"
    sh "docker build -t ${imageName} ."
}
