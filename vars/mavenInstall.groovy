def install() {
    sh """
        mvn clean install
    """
}

def test() {
    sh """
        mvn test
    """
}
