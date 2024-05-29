def updateDev(String tag) {
    sh """
        docker build -t "${tag}" .
    """
}

def updateStage(String tag) {
    sh """
        docker push "${tag}"
    """
}

def updateProd(String tag) {
    sh """
        docker push "${tag}"
    """
}
