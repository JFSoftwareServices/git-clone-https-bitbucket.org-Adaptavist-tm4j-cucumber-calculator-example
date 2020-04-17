set USER=admin
set PASSWORD=admin
set BUILD_DIR="/Users/jidefakoya/workspace/tm4j-cucumber-calculator-example"
set TARGET_PATH="src/test/resources/features"
set ZIP_FILE="featurefile.zip"


set PROJECT_KEY="COV"
set JIRA_URL="http://localhost:2990"

echo "Clean target path"
rm -rf %BUILD_DIR%/%TARGET_PATH%
mkdir -p %BUILD_DIR%/%TARGET_PATH%

echo "Downloading feature files"
curl -u %USER%:%PASSWORD% %JIRA_URL%/rest/atm/1.0/automation/testcases?tql="testCase.projectKey='%PROJECT_KEY%'" --output %BUILD_DIR%/%TARGET_PATH%/%ZIP_FILE%

echo "Unzipping feature files"
7z e -aoa %BUILD_DIR%/%TARGET_PATH%/%ZIP_FILE% -d %BUILD_DIR%/%TARGET_PATH%

echo "Finished"

#https://docs.adaptavist.io/tm4j/server/api/v1