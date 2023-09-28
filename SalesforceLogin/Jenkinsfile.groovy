pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
               
                // Sada izvršite testove
                uftScenarioLoad(
                    testPaths: 'C:\\Users\\vboxuser\\Documents\\New folder (2)\\sflogin\\sf\\SalesforceLogin',
                    archiveTestResultsMode: 'doNotArchive'
                )
            }
        }
    }
}
