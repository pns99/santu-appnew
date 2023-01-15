pipeline {
    agent any
    stages {
        stage ("Git mvn hellocheckout") {
            steps {
            git branch: "main", url: "https://github.com/pns99/santu-appnew.git"
            }
        }
        
        stage ("jtest") {
            steps {
                  echo "jtest 1"
                  }
        }
      
      stage {
        steps {
            echo "jtest 2
          
        }
        
      }
      stage {
        steps {
            echo "jtest 3"
          
        }
        
      }
        
    }
}    
