@echo off
setlocal
java -version 2>&1 | findstr /C:"25." >nul
if errorlevel 1 (
  echo ERROR: Minecraft 26.1.2 necesita Java JDK 25 para compilar este mod.
  echo Instala JDK 25 y vuelve a ejecutar este archivo.
  pause
  exit /b 1
)
gradle build
if errorlevel 1 (
  echo La compilacion fallo. Revisa el error anterior.
) else (
  echo Mod compilado en build\libs\
)
pause
