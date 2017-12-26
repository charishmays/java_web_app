# gradle_withExistingJavaWeb

###         Build War using Gradle in 10 minutes within 5 steps

This project is focus on the how to use Gradle in your **existing** Java web project.

 > - **All you have to do is copy is the "build.gradle"**
 > - rest of the files is for reference only.

And you can have following feature

  - build war file 
  - build seperate war files for different environment (dev, prod)

### Steps
  
  ##### 1. Install/Download gradle, and set env vairable https://docs.gradle.org/current/userguide/installation.html
    
  ##### 2. Copy build.gradle to your project root folder
    
  ##### 3. Customize the src, resources(dev & prod environments) folder in the build.gradle according to your project layout

  
  on top of the build.gradle, modify the value inside the ext{}
  ```groovy    
      
      /*
       set default variables, to override the default folder settings 
       The folder config_dev & config_production is just in case you have two different resources settings 
       You want to put them in the src root for different environment
      */
      
      ext{
             webDir = "WebContent" //default is  src/main/webapp
             javaSrcFolders = "src" //default is src/main/java
             resourceFolders_dev = ["config", "config_dev"] //default is src/main/resources
             resourceFolders_prod = ["config", "config_production"] 
      }
  ```
     
    

  ##### 4. execute command using terminal or cmd
  
   - For Staging/Normal setting
          
  ```
          gradle clean war
  ```
          
  - For Production setting
     
 ```
         gradle clean war -Pprod
 ```
 
 ##### 5. The war file will be found under build/lib
  
      
