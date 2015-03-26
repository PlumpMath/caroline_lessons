(ns caroline-lessons.program-1
  (:use arcadia.core
        arcadia.hydrate
        clojure.repl
        clojure.pprint))

(defn kill! [obj]
  (let [spec (dehydrate obj)]
    (destroy obj)
    spec))

(def cube-spec
  (kill! (create-primitive :cube)))

(defn cube-assault [n]
  (loop [i 0]
    (when (< i n)
      (do
        (hydrate
          (deep-merge-mv
            cube-spec
            {:transform [{:local-position [i 0 0]}]}))
        (recur (inc i))))))
