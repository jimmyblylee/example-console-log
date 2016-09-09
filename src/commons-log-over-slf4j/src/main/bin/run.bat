@echo off
set JAR_FILE=

pushd lib
  for /f "delims=" %%i in ('dir /b /a-d /s "console-commons-log-over-slf4j*.jar"') do (set JAR_FILE=%%i)
popd

call java -jar %JAR_FILE%
pause