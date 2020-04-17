#!/bin/bash

USER=admin
PASSWORD=admin
BUILD_DIR="/Users/jidefakoya/workspace/tm4j-cucumber-calculator-example"
TARGET_PATH="src/test/resources/features"
ZIP_FILE="featurefile.zip"

JIRA_URL="http://localhost:8080"
PROJECT_KEY="COV"

echo "Clean target path"
rm -rf $BUILD_DIR/$TARGET_PATH
mkdir -p $BUILD_DIR/$TARGET_PATH

echo "Downloading feature files"
curl -u $USER:$PASSWORD $JIRA_URL/rest/atm/1.0/automation/testcases?tql="testCase.projectKey='$PROJECT_KEY'" --output $BUILD_DIR/$TARGET_PATH/$ZIP_FILE


echo "Unzipping feature files"
unzip $BUILD_DIR/$TARGET_PATH/$ZIP_FILE -d $BUILD_DIR/$TARGET_PATH
echo "Finished"


#https://docs.adaptavist.io/tm4j/server/api/v1/