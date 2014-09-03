(defproject com.zengularity/clife "0.1.0"
  :description "ZU - Clojurescript Game Of Life"
  :license {:name "WTFPL" :url "http://www.wtfpl.net"}
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]]
  :cljsbuild
  {:builds
   {:dev {:source-paths ["src"]
          :compiler
          {:output-dir "out"
           :output-to "clife.js"
           :optimizations :none
           :source-map true}}
    :prod {:source-paths ["src"]
           :compiler
           {:output-dir "out-prod"
            :output-to "clife.prod.js"
            :optimizations :advanced
            :pretty-print false
            :output-wrapper false
            :closure-warnings {:externs-validation :off
                               :non-standard-jsdoc :off}}}}})
