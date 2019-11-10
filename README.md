# clj-native-cmd

A simple template for making cli apps with clojure and compiling with graalvm.

## Usage

A leiningen template is generated from this project with `lein-create-template`:

    lein new clj-native-cmd my-cli

You should be able to build a native-image using:

    lein native-image

You will need `native-image` available on your path.

Tested with:

    Clojure 1.9.0
    GraalVM Version 19.2.1 CE
    Darwin Kernel Version 18.0.0
    MacOS 10.14 Mojave

N.B. Do not upgrade to clojure 1.10 with this template until [this bug is fixed](https://clojure.atlassian.net/browse/CLJ-1472) you will not be able to create a native binary with graalvm.

Some further graalvm and clojure related links:

 - [lein-native-image](https://github.com/taylorwood/lein-native-image) 
 - [cli-matic](https://github.com/l3nz/cli-matic) 
 - [cmd line apps with clojure and graalvm](https://www.astrecipes.net/blog/2018/07/20/cmd-line-apps-with-clojure-and-graalvm/)
 - Discussion of clojure 1.10 issue [1](https://github.com/oracle/graal/issues/1266) [2](https://github.com/oracle/graal/issues/1681) [3](https://github.com/l3nz/cli-matic/issues/64)

## License

Copyright © 2019

This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary Licenses when the conditions for such availability set forth in the Eclipse Public License, v. 2.0 are satisfied: GNU General Public License as published by the Free Software Foundation, either version 2 of the License, or (at your option) any later version, with the GNU Classpath Exception which is available at https://www.gnu.org/software/classpath/license.html.
