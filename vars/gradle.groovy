def microBundle() {
    sh """
        gradle microBundle
    """
}

def wrapper() {
    sh """
        gradle wrapper
    """
}

def build() {
    sh """
        ./gradlew build
    """
}

def test() {
    sh """
        ./gradlew test --info
    """
}

