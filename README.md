# demo

## One time setup

- Set up application

        eb init experiment --platform Java --region eu-central-1

- Setup environment
    
        branch-defaults:
          master:
            environment: experiment-dev
            group_suffix: null
        deploy:
          artifact: target/demo-1.0.0-SNAPSHOT.jar
        global:
          application_name: experiment
          branch: null
          default_ec2_keyname: null
          default_platform: Java
          default_region: eu-central-1
          include_git_submodules: true
          instance_profile: null
          platform_name: null
          platform_version: null
          repository: null
          sc: git
          workspace_type: Application

## Every time

- Deploy

        eb deploy

## Extra

https://gist.github.com/ryansimms/808214137d219be649e010a07af44bad
