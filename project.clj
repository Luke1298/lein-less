(defproject org.clojars.lukenelson/lein-less "1.7.6-SNAPSHOT"
            :description "Less CSS compiler plugin for leiningen"
            :url "http://github.com/Luke1298/lein-less"
            :license {:name "Eclipse Public License"
                      :url  "http://www.eclipse.org/legal/epl-v10.html"}

            :java-source-paths ["java"]
            :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]

            :eval-in :leiningen
            :min-lein-version "2.3.0"

            :profiles {:dev {:dependencies [[org.clojure/clojure "1.6.0" :optional true]
                                            [leiningen-core "2.5.1" :optional true]]}})
