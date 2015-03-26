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
            {:transform [{:local-position [i i 0]}]}))
        (recur (inc i))))))


(defn cube-assault-2 [n]
	(let[data 
		(mapv
			(fn [i] 
				(deep-merge-mv cube-spec  
					{:transform [{:local-position [i i 0]}]}))
			(range n))
		data2
		(mapv
			(fn [d] 
				(deep-merge-mv d
					{:transform [{:local-scale [(rand)(rand)(rand)]}]}))
			data)]
		(hydrate 
			{:name "cubes"
			 :children data2})))


(pprint
	(take 5
	 (iterate
		(fn [x] [:hi-there x])
		0)))

(set! *print-level* 14)
(set! *print-length* 100)


(defn i-dont-know [tims] 
	(take tims 
	 (iterate
		(fn [x] (+ 1 x))
		0)))