/* groovylint-disable MethodReturnTypeRequired, NoDef */
package com.valecard.siag

def execute() {
    stage('Init') {
        branchName = env.BRANCH_NAME
        echo "$branchName"
        sh 'ls -la'
    }
}
