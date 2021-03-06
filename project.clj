(defproject macro-workshop "0.1.0-SNAPSHOT"
  :description "A Clojure macros workshop"
  :url "http://clojuremacros.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :plugins [[speclj "3.3.2"]]
  :profiles {:dev {:dependencies [[speclj "3.3.2"]]}}
  :source-paths ["doc" "src"]
  :test-paths ["spec"]
  :aot [macro-workshop.aot-example])
