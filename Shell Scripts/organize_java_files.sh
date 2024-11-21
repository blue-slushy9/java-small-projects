# This is a Bash script to help me organize java-small-projects

# Change into the target directory
cd ..
# Iterate over target directory contents
for item in *; do
  # If it is a file (-f)
  if [[ -f "$object" ]]; then
    # Set the new directory name equal to the project name, minus the '.java'
    dir_name="${item:0:-5}"


done