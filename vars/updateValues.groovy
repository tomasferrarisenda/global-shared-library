def updateDev(Map config = [:]) {
    sh """
        sed "s/tag:.*/tag: ${config.tag}/g" environments/values-dev.yaml > values-dev.temp
        mv values-dev.temp environments/values-dev.yaml
    """
}

def updateStage(Map config = [:]) {
    sh """
        sed "s/tag:.*/tag: ${config.tag}/g" environments/values-stage.yaml > values-stage.temp
        mv values-stage.temp environments/values-stage.yaml
    """
}

def updateProd(Map config = [:]) {
    sh """
        sed "s/tag:.*/tag: ${config.tag}/g" environments/values-prod.yaml > values-prod.temp
        mv values-prod.temp environments/values-prod.yaml
    """
}
