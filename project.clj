(defproject clj-native-cmd "0.1.0-SNAPSHOT"
  :description "Example clj cli app using cli-matic and lein native-image"
  :url "https://github.com/tggreene/clj-native-cmd"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [cli-matic "0.3.9"]]
  :repl-options {:init-ns clj-native-cmd.core}
  :plugins [[io.taylorwood/lein-native-image "0.3.1"]]
  :native-image {:name "clj-native-cmd"
                 :opts ["--report-unsupported-elements-at-runtime"
                        "--initialize-at-build-time"
                        "--no-server"]
                 :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}
  :profiles {:uberjar {:aot :all
                       :main clj-native-cmd.core}})
