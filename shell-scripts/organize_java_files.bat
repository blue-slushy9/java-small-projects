:: This is a batch script to help me organize my java-small-projects repo

:: Turns off command echoing so commands don't appear in terminal
::@echo off
:: '%%a' populates to each directory object, * is the working directory
for %%a in (*) do (
  :: '~ta' checks the type attribute, 'f' means directory
  if %%~ta == f (
    :: Make sure the file extension is '.java'
    set "ext=%%a:~-5%%"
    :: DEBUG
    echo %ext%
    :: If file extension is '.java'
    if %%a:-5%% == %%ext%% (
    :: Create a directory for the file with the same name but capital first
    :: letter, also drop the '.java'
    set "dir_name=%%a:~0,-5%%"
    :: DEBUG
    echo %%dir_name%%
  )
)