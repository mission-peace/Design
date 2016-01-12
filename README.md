<h2> How to use this repository </h2>

<h3> Softwares to install </h3>
* Install JDK8 https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
* Install mvn from https://maven.apache.org/download.cgi . Update your PATH to MAVEN_DIRECTORY/bin
* Install Git https://git-scm.com/book/en/v2/Getting-Started-Installing-Git
* Install either Intellij https://www.jetbrains.com/idea/download/
* If you like eclipse intead of intellij install eclipse https://eclipse.org/downloads/

<h3> Set up your desktop </h3>
* Pull the git repository. Go to command line and type git clone https://github.com/mission-peace/interview.git
* Run mvn compile to compile the entire source code
* Run mvn idea:idea to generate intellij related files. 
* Fire up intellij. Go to Open. Go to git repo folder and open interview.ipr . On file menu go to projec structure. Update language level support to 8
* If you use eclipse, do mvn eclipse:eclipse . This will generate eclipse related files. Go to eclipse and open up folder containing this repo.
