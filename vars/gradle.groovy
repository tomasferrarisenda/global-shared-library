def wrapper() {
    sh """
        gradle wrapper
    """
}

def clean() {
    sh """
        ./gradlew clean
    """
}

def compileJava() {
    sh """
        ./gradlew compileJava
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

def microBundle() {
    sh """
        gradle microBundle
    """
}
