// def updateDev(String tag, String system, String service) {
//     sh """
//         sed "s/tag:.*/tag: ${tag}/g" helm-charts/systems/${system}/${service}/environments/values-dev.yaml > values-dev.temp
//         mv values-dev.temp helm-charts/systems/${system}/${service}/environments/values-dev.yaml
//     """
// }
def updateDev(Map config = [:]) {
    sh """
        sed "s/tag:.*/tag: ${config.tag}/g" helm-chart/environments/values-dev.yaml > values-dev.temp
        mv values-dev.temp helm-chart/environments/values-dev.yaml
    """
}

        // sed "s/tag:.*/tag: ${config.tag}/g" helm-charts/systems/${config.system}/${config.service}/environments/values-dev.yaml > values-dev.temp
        // mv values-dev.temp helm-charts/systems/${config.system}/${config.service}/environments/values-dev.yaml


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
