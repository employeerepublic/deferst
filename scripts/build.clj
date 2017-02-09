(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build
   (b/inputs "assets" "test" "src")
   {:main 'deferst-test
    :output-to "out/tests.js"
    :output-dir "out/tests"
    :target :nodejs
    :pretty-print true
    :optimizations :advanced
    :language-in  :ecmascript5
    :language-out :ecmascript5
    :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
