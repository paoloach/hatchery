## Hatchery

An open source IDE for the [Robot Operating System](http://www.ros.org/) that provides language support and code assistance for developing ROS applications. 

### Running

Hatchery requires a JRE or JDK. First, ensure that you have one installed:

`java -version`
 
If not, [JDK 8](http://openjdk.java.net/install/) or higher is sufficient:

`sudo apt-get install openjdk-8-jre`

<details> 
<summary><b>Duckietown Participants</b> <em>(Click to expand)</em>...</summary> 

Ensure `echo $DUCKIETOWN_ROOT` returns the correct path to your [Duckietown directory](https://github.com/duckietown/software).

If not, you should first run `source environment.sh` from inside the Duckietown software directory.

Hatchery will use `DUCKIETOWN_ROOT` as the default project directory, so you can omit the `-Project` flag in the following step.
</details>

To run the IDE (optionally, you can provide an existing ROS project path):

`./gradlew runIde [-Project="<ABSOLUTE_PATH_TO_ROS_PROJECT>"]`

When first running the IDE, you may need to configure your Python SDK. To do so, open **File | Project Structure** and create or edit a *Python SDK*.

### Getting Started

Check out the following screencast for demonstration of some features we support:

(TODO)

### Features 

Currently, Hatchery supports the following [ROS filetypes](https://wiki.wpi.edu/robotics/ROS_File_Types):

- [x] ROS Launch (`*.launch`, `*.test`)
    -[x] Syntax highlighting
    -[x] Resource references (`$(find <directory>)...`)
- [x] ROS Package (`package.xml`)
    -[x] Syntax highlighting
    -[x] Package references (`<build_depend>`, `<test_depend>`, `<run_depend>`)
- [x] ROS URDF (`*.urdf.xacro`)
    -[x] Syntax highlighting
    -[x] Resource references (`$(find <directory>)...`)
- [ ] ROS Bag (`*.bag`)
    -[ ] Live logfile tracking
- [x] ROS Message (`*.msg`)
    -[x] Syntax highlighting
- [ ] ROS Service (`*.srv`)

It also supports refactoring and navigation in XML files:

* XML
* Python
* YAML
* CMake
* Bash

### Planning

- [x] Implement preliminary project structure and XML support
- [x] Write an MVP/POC app that supports file renaming and refactoring.
- [ ] Add support for project templates and skeleton project creation.
- [x] Add support for deploying a project from the local machine to the remote.
- [ ] Add support for monitoring and tracking running code, viewing logs.
    - [ ] Save to local disk
    - [ ] Searching the log
- [ ] Collect crash dumps and link to the corresponding code points.
    - [ ] Link stack traces to source code
    - [ ] Copy environment info and crash dump to clipboard

### Roadmap

We are currently workign to expand support for the following features:

* **Syntax support** - Highlighting, navigation, autocompletion
* **Program analysis** - Code inspections, intentions, and linting
* **Testing support** - Unit and integration testing, code coverage
* **Project creation** - Project setup and boilerplate code generation
* **Dependency management** - Track installed and missing packages
* **Monitoring utils** - Logging, diagnostics, profiling and visualization
* **Crash analytics** - Enhanced stack traces with source navigation
* **Build automation** - Delta rebuilds, cmake magic, code hotswap
* **ROS integration** - Nodes, topics, services, parameters, graphs
* **Duckumentation** - Usage instructions and supported features

### Authors

* [Breandan Considine](https://github.com/breandan)

### Special Thanks

* [Duckietown](https://duckietown.org)
* [Liam Paull](https://github.com/liampaull)
* [Open Robotics](https://www.openrobotics.org/)