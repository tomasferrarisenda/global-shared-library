
def commitAndPush(Map config = [:]) {
    sh "ls"
    sh "git config --global user.email ${config.email}"
    sh "git config --global user.name ${config.organization}"
    sh "git add ."
    sh "git commit -m 'Update image tags'"
    withCredentials([usernamePassword(credentialsId: "github", passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
        sh("git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/${config.service}.git")
    }
}
        // sh("git push https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/${config.organization}/${config.service}.git")