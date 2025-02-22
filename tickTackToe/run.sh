#!/bin/bash

# Set the source and build directories
SRC_DIR="."
BUILD_DIR="./build"

# Ensure the build directory exists
mkdir -p "$BUILD_DIR"

# Compile all Java files into the build directory
javac -d "$BUILD_DIR" $(find "$SRC_DIR" -name "*.java")

# Run the main Java class
java -cp "$BUILD_DIR" tickTackToe.main

