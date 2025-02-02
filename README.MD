A library mod for 1.7.10 with lots of useful stuff. See the table below for more information.

| Package                                                         | Contents / Purpose                                              |
|-----------------------------------------------------------------|-----------------------------------------------------------------|
| [compat](src/main/java/com/falsepattern/lib/compat)             | Code backported from vanilla 1.12.2                             |
| [config](src/main/java/com/falsepattern/lib/config)             | 1.12.2-style annotation-based config library                    |
| [dependencies](src/main/java/com/falsepattern/lib/dependencies) | Runtime dependency loader which uses Maven                      |
| [mixin](src/main/java/com/falsepattern/lib/mixin)               | Mixin loader plugin boilerplate code                            |
| [text](src/main/java/com/falsepattern/lib/text)                 | Better Chat and GUI text processing                             |
| [util](src/main/java/com/falsepattern/lib/util)                 | Additional utilities that do not fit the above categories, see below for more information |

The contents of the [util](src/main/java/com/falsepattern/lib/util) package so far:

| Class        | Purpose                                                                                                        |
|--------------|----------------------------------------------------------------------------------------------------------------|
| ResourceUtil | Provides methods for efficiently retrieving resources from SPECIFIC jar files instead of the entire classpath |


Anything annotated with [@StableAPI](src/main/java/com/falsepattern/lib/StableAPI.java) is guaranteed to not change in patch versions.

### This project WILL NOT be ported to any version beyond 1.7.10, don't even ask

[![POOP badge](https://raw.githubusercontent.com/gist/poop-person/991e80f390384bbeef09d208bff208f4/raw/a9ef83add84a70f2202896c2d81117ff7b169be1/poop-badge.svg)](https://gist.github.com/poop-person/991e80f390384bbeef09d208bff208f4)
